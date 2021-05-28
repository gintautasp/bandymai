package smulkus;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{	
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
    
		assertEquals ( "klaida diskriminanto skaiciavime, kai D<0", Reiksmes.tiketinasD [ 0 ], Funkcijos.skaiciuotiDiskriminanta ( Reiksmes.a [ 0 ], Reiksmes.b [ 0 ], Reiksmes.c [ 0 ] ), Reiksmes.tikslumas );
		assertEquals ( "klaida diskriminanto skaiciavime, kai D=0", Reiksmes.tiketinasD [ 1 ], Funkcijos.skaiciuotiDiskriminanta ( Reiksmes.a [ 1 ], Reiksmes.b [ 1 ], Reiksmes.c [ 1 ] ), Reiksmes.tikslumas );
		assertEquals ( "klaida diskriminanto skaiciavime, kai D>0", Reiksmes.tiketinasD [ 2 ], Funkcijos.skaiciuotiDiskriminanta ( Reiksmes.a [ 2 ], Reiksmes.b [ 2 ], Reiksmes.c [ 2 ] ), Reiksmes.tikslumas );
	}


	@Test
	public void lygtiesSprendiniuSkaicius() {

		assertEquals ( "lygties sprendiniu skaicius - 1 testas, kai D<0", 0,  Funkcijos.lygtiesSprendiniuSkaicius ( -3.0 ) );
		assertEquals ( "lygties sprendiniu skaicius - 1 testas, kai D=0", 1,  Funkcijos.lygtiesSprendiniuSkaicius ( 0.0 ) );	    
		assertEquals ( "lygties sprendiniu skaicius - 1 testas, kai D>0", 2,  Funkcijos.lygtiesSprendiniuSkaicius ( 6.0 ) );
		assertEquals ( "lygties sprendiniu skaicius - 2 testas, kai D<0", Reiksmes.kiek_sprendiniu [ 0 ],  Funkcijos.lygtiesSprendiniuSkaicius ( Reiksmes.tiketinasD [ 0 ] ) );
		assertEquals ( "lygties sprendiniu skaicius - 2 testas, kai D=0", Reiksmes.kiek_sprendiniu [ 1 ],  Funkcijos.lygtiesSprendiniuSkaicius ( Reiksmes.tiketinasD [ 1 ] ) );
		assertEquals ( "lygties sprendiniu skaicius - 2 testas, kai D=0", Reiksmes.kiek_sprendiniu [ 2 ],  Funkcijos.lygtiesSprendiniuSkaicius ( Reiksmes.tiketinasD [ 2 ] ) );	
	}

	@Test
	public void kvadratinesLygtiesSprendimas()
	{

		// assertArrayEquals ( "lygties sprendimas, kai D<0",  Reiksmes.sprendiniai, Funkcijos.rastiSprendinius ( a, b, c, kiek_sprendiniu, tiketinasD ), tikslumas );
		// assertArrayEquals ( "lygties sprendimas, kai D=0",  vienas_sprendinys, Funkcijos.rastiSprendinius ( a, b, c, kiek_sprendiniu, tiketinasD  ), tikslumas );
		// assertArrayEquals ( "lygties sprendimas, kai D>0",  du_sprendiniai, Funkcijos.rastiSprendinius ( a, b, c, kiek_sprendiniu, tiketinasD ), tikslumas );	
	}    
}
