package smulkus;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class IntegraciniaiTest
{
	public double tikslumas = 0.000001;
	
	double[] a = { 1.0, 2.0, 2.0 };
	double[] b = { 5.0, 4.0, 5.0 };
	double[] c = { 9.0, 2.0, 3.0 };
     

	double[][]  sprendiniai = { { 0.0, 0.0 }, { -1.0, 0.0 }, { -1.0,  -1.5 } };	     

	int[] kiek_sprendiniu = { 0, 1, 2 };

	double[] tiketinasD = { -11.0, 0.0, 1.0 };
	
	/**
	* Rigorous Test :-)
	*/
	@Test
	public void shouldAnswerWithTrue()
	{
		assertTrue( true );
	}
    
	@Test
	public void diskriminantoSkaiciavimasLygtiesSprendiniuSkaiciui ()
	{
	

		assertEquals ( 
			"diskriminato skaičiavimas, pagal surastą lygties sprendiniu skaicių, kai D<0"
			, kiek_sprendiniu[ 0 ]
			,  Funkcijos.lygtiesSprendiniuSkaicius ( Funkcijos.skaiciuotiDiskriminanta ( a[ 0 ], b[ 0 ], c [ 0 ] ) ) 
		);
		
		assertEquals ( 
			"diskriminato skaičiavimas, pagal surastą lygties sprendiniu skaicių, kai D=0"
			, kiek_sprendiniu[ 1 ]
			,  Funkcijos.lygtiesSprendiniuSkaicius ( Funkcijos.skaiciuotiDiskriminanta ( a[ 1 ], b[ 1 ], c [ 1 ] ) ) 
		);
		
		assertEquals ( 
			"lygties sprendiniu skaicius, kai D=0"
			, kiek_sprendiniu[ 2 ]
			,  Funkcijos.lygtiesSprendiniuSkaicius ( Funkcijos.skaiciuotiDiskriminanta ( a[ 2 ], b[ 2 ], c [ 2 ] ) ) 
		);
	}  

	
	@Test
	public void lygtiesSprendiniuSkaiciausRadimoSprendiniams()
	{	
		assertArrayEquals ( 
			"lygties sprendimas, pagal surastą lygties sprendiniu skaicių, kai D<0"
			,  sprendiniai [ 0 ]
			, Funkcijos.rastiSprendinius ( a[ 0 ], b [ 0 ], c [ 0 ], Funkcijos.lygtiesSprendiniuSkaicius ( tiketinasD [ 0 ] ), tiketinasD [ 0]  )
			, tikslumas 
		);
		
		assertArrayEquals ( 
			"lygties sprendimas, pagal surastą lygties sprendiniu skaicių, kai D<0"
			,  sprendiniai [ 1 ]
			, Funkcijos.rastiSprendinius ( a[ 1 ], b [ 1 ], c [ 1 ], Funkcijos.lygtiesSprendiniuSkaicius ( tiketinasD [ 1 ] ), tiketinasD [ 1 ] )
			, tikslumas 
		);		
		
		assertArrayEquals ( 
			"lygties sprendimas, pagal surastą lygties sprendiniu skaicių, kai D<0"
			,  sprendiniai [ 2 ]
			, Funkcijos.rastiSprendinius ( a[ 2 ], b [ 2 ], c [ 2 ], Funkcijos.lygtiesSprendiniuSkaicius ( tiketinasD [ 2 ] ), tiketinasD [ 2 ] )
			, tikslumas 
		);	
	}
	
	@Test
	public void diskriminantoSkaiciavimoSprendiniams()
	{	
		assertArrayEquals ( 
			"lygties sprendimas, pagal suskaiciuota diskriminanta, kai D<0"
			,  sprendiniai [ 0 ]
			, Funkcijos.rastiSprendinius ( a[ 0 ], b [ 0 ], c [ 0 ], kiek_sprendiniu [ 0 ], Funkcijos.skaiciuotiDiskriminanta ( a[ 0 ], b[ 0 ], c [ 0 ] ) )
			, tikslumas 
		);
		
		assertArrayEquals ( 
			"lygties sprendimas, pagal suskaiciuota diskriminanta, kai D=0"
			,  sprendiniai [ 1 ]
			, Funkcijos.rastiSprendinius ( a[ 1 ], b [ 1 ], c [ 1 ], kiek_sprendiniu [ 1 ], Funkcijos.skaiciuotiDiskriminanta ( a[ 0 ], b[ 0 ], c [ 0 ] ) )
			, tikslumas 
		);		
		
		assertArrayEquals ( 
			"lygties sprendimas, pagal suskaiciuota diskriminanta, kai D>0"
			,  sprendiniai [ 2 ]
			, Funkcijos.rastiSprendinius ( a[ 2 ], b [ 2 ], c [ 2 ], kiek_sprendiniu [ 2 ], Funkcijos.skaiciuotiDiskriminanta ( a[ 0 ], b[ 0 ], c [ 0 ] ) )
			, tikslumas 
		);	
	}	
}
