package smulkus;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SistemosIntegraciniaiTest
{
	public double tikslumas = 0.000001;

	double[] a = { 1.0, 2.0, 2.0 };
	double[] b = { 5.0, 4.0, 5.0 };
	double[] c = { 9.0, 2.0, 3.0 };
     

	double[][]  sprendiniai = { { 0.0, 0.0 }, { -1.0, 0.0 }, { -1.0,  -1.5 } };	     

	double[] tiketinasD = { -11.0, 0.0, 1.0 };
	int[] kiek_sprendiniu = { 0, 1, 2 };
	
	/**
	* Rigorous Test :-)
	*/
	@Test
	public void shouldAnswerWithTrue()
	{
		assertTrue( true );
	}

	@Test
	public void diskriminantoSkaiciavimas() {
    
		assertEquals ( "klaida diskriminanto skaiciavime, kai D<0", tiketinasD [ 0 ], Funkcijos.skaiciuotiDiskriminanta ( a [ 0 ], b [ 0 ], c [ 0 ] ), tikslumas );
		assertEquals ( "klaida diskriminanto skaiciavime, kai D=0", tiketinasD [ 1 ], Funkcijos.skaiciuotiDiskriminanta ( a [ 1 ], b [ 1 ], c [ 1 ] ), tikslumas );
		assertEquals ( "klaida diskriminanto skaiciavime, kai D>0", tiketinasD [ 2 ], Funkcijos.skaiciuotiDiskriminanta ( a [ 2 ], b [ 2 ], c [ 2 ] ), tikslumas );
	}


	@Test
	public void lygtiesSprendiniuSkaicius() {

		assertEquals ( "lygties sprendiniu skaicius - 1 testas, kai D<0", 0,  Funkcijos.lygtiesSprendiniuSkaicius ( -3.0 ) );
		assertEquals ( "lygties sprendiniu skaicius - 1 testas, kai D=0", 1,  Funkcijos.lygtiesSprendiniuSkaicius ( 0.0 ) );	    
		assertEquals ( "lygties sprendiniu skaicius - 1 testas, kai D>0", 2,  Funkcijos.lygtiesSprendiniuSkaicius ( 6.0 ) );
		assertEquals ( "lygties sprendiniu skaicius - 2 testas, kai D<0", kiek_sprendiniu [ 0 ],  Funkcijos.lygtiesSprendiniuSkaicius ( tiketinasD [ 0 ] ) );
		assertEquals ( "lygties sprendiniu skaicius - 2 testas, kai D=0", kiek_sprendiniu [ 1 ],  Funkcijos.lygtiesSprendiniuSkaicius ( tiketinasD [ 1 ] ) );
		assertEquals ( "lygties sprendiniu skaicius - 2 testas, kai D=0", kiek_sprendiniu [ 2 ],  Funkcijos.lygtiesSprendiniuSkaicius ( tiketinasD [ 2 ] ) );	
	}

	@Test
	public void kvadratinesLygtiesSprendimas()
	{

		// assertArrayEquals ( "lygties sprendimas, kai D<0",  nera_sprendiniu, Funkcijos.rastiSprendinius ( a, b, c, kiek_sprendiniu, tiketinasD ), tikslumas );
		// assertArrayEquals ( "lygties sprendimas, kai D=0",  vienas_sprendinys, Funkcijos.rastiSprendinius ( a, b, c, kiek_sprendiniu, tiketinasD  ), tikslumas );
		// assertArrayEquals ( "lygties sprendimas, kai D>0",  du_sprendiniai, Funkcijos.rastiSprendinius ( a, b, c, kiek_sprendiniu, tiketinasD ), tikslumas );	
	}    
}
