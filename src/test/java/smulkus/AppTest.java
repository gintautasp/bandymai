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
    public void kvadratinesLygtiesSprendimas()
    {
	double D = Funkcijos.skaiciuotiDiskriminanta ( 2.0, 4.0, 2.0 );
        assertEquals ( "klaida diskriminanto skaiciavime", 0.0, D, 0.00000001 );
	assertEquals ( "lygties sprendiniu skaicius, kai D<0", 0,  Funkcijos.lygtiesSprendiniuSkaicius ( -3.0 ) );
	assertEquals ( "lygties sprendiniu skaicius, kai D=0", 1,  Funkcijos.lygtiesSprendiniuSkaicius ( D ) );
	assertEquals ( "lygties sprendiniu skaicius, kai D>0", 2,  Funkcijos.lygtiesSprendiniuSkaicius ( 6.0 ) );
	    
	double[] nera_sprendiniu = { 0.0, 0.0 };
	assertArrayEquals ( "lygties sprendimas, kai D<0",  nera_sprendiniu, Funkcijos.rastiSprendinius ( 1.0, 5.0, 9.0 ), 0.000001 );
	
	double[] vienas_sprendinys = { -1.0, 0.0 };
	assertArrayEquals ( "lygties sprendimas, kai D=0",  vienas_sprendinys, Funkcijos.rastiSprendinius ( 2.0, 4.0, 2.0 ), 0.000001 );
	
	double[] du_sprendiniai = { -1.0,  -1.5 };
	assertArrayEquals ( "lygties sprendimas, kai D>0",  du_sprendiniai, Funkcijos.rastiSprendinius ( 2.0, 5.0, 3.0 ), 0.000001 );	
    }    
}
