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
			, Reiksmes.kiek_sprendiniu[ 0 ]
			,  Funkcijos.lygtiesSprendiniuSkaicius ( Funkcijos.skaiciuotiDiskriminanta ( Reiksmes.a[ 0 ], Reiksmes.b[ 0 ], Reiksmes.c [ 0 ] ) ) 
		);
		
		assertEquals ( 
		
			"diskriminato skaičiavimas, pagal surastą lygties sprendiniu skaicių, kai D=0"
			, Reiksmes.kiek_sprendiniu[ 1 ]
			,  Funkcijos.lygtiesSprendiniuSkaicius ( Funkcijos.skaiciuotiDiskriminanta ( Reiksmes.a[ 1 ], Reiksmes.b[ 1 ], Reiksmes.c [ 1 ] ) ) 
		);
		
		assertEquals ( 
		
			"lygties sprendiniu skaicius, kai D=0"
			, Reiksmes.kiek_sprendiniu[ 2 ]
			,  Funkcijos.lygtiesSprendiniuSkaicius ( Funkcijos.skaiciuotiDiskriminanta ( Reiksmes.a[ 2 ], Reiksmes.b[ 2 ], Reiksmes.c [ 2 ] ) ) 
		);
	}  

	
	@Test
	public void lygtiesSprendiniuSkaiciausRadimoSprendiniams()
	{	
		assertArrayEquals ( 
		
			"lygties sprendimas, pagal surastą lygties sprendiniu skaicių, kai D<0"
			,  Reiksmes.sprendiniai [ 0 ]
			, Funkcijos.rastiSprendinius ( Reiksmes.a[ 0 ], Reiksmes.b [ 0 ], Reiksmes.c [ 0 ], Funkcijos.lygtiesSprendiniuSkaicius ( Reiksmes.tiketinasD [ 0 ] ), Reiksmes.tiketinasD [ 0]  )
			, Reiksmes.tikslumas 
		);
		
		assertArrayEquals ( 
		
			"lygties sprendimas, pagal surastą lygties sprendiniu skaicių, kai D<0"
			,  Reiksmes.sprendiniai [ 1 ]
			, Funkcijos.rastiSprendinius ( Reiksmes.a[ 1 ], Reiksmes.b [ 1 ], Reiksmes.c [ 1 ], Funkcijos.lygtiesSprendiniuSkaicius ( Reiksmes.tiketinasD [ 1 ] ), Reiksmes.tiketinasD [ 1 ] )
			, Reiksmes.tikslumas 
		);		
		
		assertArrayEquals ( 
		
			"lygties sprendimas, pagal surastą lygties sprendiniu skaicių, kai D<0"
			,  Reiksmes.sprendiniai [ 2 ]
			, Funkcijos.rastiSprendinius ( Reiksmes.a[ 2 ], Reiksmes.b [ 2 ], Reiksmes.c [ 2 ], Funkcijos.lygtiesSprendiniuSkaicius ( Reiksmes.tiketinasD [ 2 ] ), Reiksmes.tiketinasD [ 2 ] )
			, Reiksmes.tikslumas 
		);	
	}
	
	@Test
	public void diskriminantoSkaiciavimoSprendiniams()
	{	
		assertArrayEquals ( 
		
			"lygties sprendimas, pagal suskaiciuota diskriminanta, kai D<0"
			,  Reiksmes.sprendiniai [ 0 ]
			, Funkcijos.rastiSprendinius ( Reiksmes.a[ 0 ], Reiksmes.b [ 0 ], Reiksmes.c [ 0 ], Reiksmes.kiek_sprendiniu [ 0 ], Funkcijos.skaiciuotiDiskriminanta (Reiksmes.a[ 0 ], Reiksmes.b[ 0 ], Reiksmes.c [ 0 ] ) )
			, Reiksmes.tikslumas 
		);
		
		assertArrayEquals ( 
		
			"lygties sprendimas, pagal suskaiciuota diskriminanta, kai D=0"
			,  Reiksmes.sprendiniai [ 1 ]
			, Funkcijos.rastiSprendinius ( Reiksmes.a[ 1 ], Reiksmes.b [ 1 ], Reiksmes.c [ 1 ], Reiksmes.kiek_sprendiniu [ 1 ], Funkcijos.skaiciuotiDiskriminanta ( Reiksmes.a[ 0 ], Reiksmes.b[ 0 ], Reiksmes.c [ 0 ] ) )
			, Reiksmes.tikslumas 
		);		
		
		assertArrayEquals ( 
		
			"lygties sprendimas, pagal suskaiciuota diskriminanta, kai D>0"
			,  Reiksmes.sprendiniai [ 2 ]
			, Funkcijos.rastiSprendinius ( Reiksmes.a[ 2 ], Reiksmes.b [ 2 ], Reiksmes.c [ 2 ], Reiksmes.kiek_sprendiniu [ 2 ], Funkcijos.skaiciuotiDiskriminanta ( Reiksmes.a[ 2 ], Reiksmes.b[ 2 ], Reiksmes.c [ 2 ] ) )
			, Reiksmes.tikslumas 
		);	
	}	
}
