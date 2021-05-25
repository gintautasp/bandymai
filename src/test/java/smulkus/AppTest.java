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
    public double tikslumas = 0.000001;
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

	
	assertEquals ( "lygties sprendiniu skaicius, kai D<0", 0,  Funkcijos.lygtiesSprendiniuSkaicius ( -3.0 ) );
	assertEquals ( "lygties sprendiniu skaicius, kai D=0", 1,  Funkcijos.lygtiesSprendiniuSkaicius ( 0.0 ) );	    
	assertEquals ( "lygties sprendiniu skaicius, kai D>0", 2,  Funkcijos.lygtiesSprendiniuSkaicius ( 6.0 ) );
	
	double a = 1.0;
	double b = 5.0;
	double c = 9.0;
	double tiketinasD = -11.0;
	int kiek_sprendiniu = 0;
	double[] nera_sprendiniu = { 0.0, 0.0 };
	double D = Funkcijos.skaiciuotiDiskriminanta ( a, b, c );
	assertEquals ( "klaida diskriminanto skaiciavime", tiketinasD, D, tikslumas );	
	assertEquals ( "lygties sprendiniu skaicius, kai D=0", kiek_sprendiniu,  Funkcijos.lygtiesSprendiniuSkaicius ( tiketinasD ) );
	assertArrayEquals ( "lygties sprendimas, kai D<0",  nera_sprendiniu, Funkcijos.rastiSprendinius ( a, b, c, kiek_sprendiniu, tiketinasD ), tikslumas );
	
	a = 2.0;
	b = 4.0;
	c = 2.0;
	tiketinasD = 0.0;
	kiek_sprendiniu = 1;	
	double[] vienas_sprendinys = { -1.0, 0.0 };
	D = Funkcijos.skaiciuotiDiskriminanta ( a, b, c );
	assertEquals ( "klaida diskriminanto skaiciavime", tiketinasD, D, tikslumas );
	assertEquals ( "lygties sprendiniu skaicius, kai D=0", kiek_sprendiniu,  Funkcijos.lygtiesSprendiniuSkaicius ( tiketinasD ) );
	assertArrayEquals ( "lygties sprendimas, kai D=0",  vienas_sprendinys, Funkcijos.rastiSprendinius ( a, b, c, kiek_sprendiniu, tiketinasD  ), tikslumas );
	
	a = 2.0;
	b = 5.0;
	c = 3.0;	
	tiketinasD = 1.0;	
	kiek_sprendiniu = 2;	
	double[] du_sprendiniai = { -1.0,  -1.5 };
	D = Funkcijos.skaiciuotiDiskriminanta ( a, b, c );
	assertEquals ( "klaida diskriminanto skaiciavime", tiketinasD, D, tikslumas );
	assertEquals ( "lygties sprendiniu skaicius, kai D=0", kiek_sprendiniu,  Funkcijos.lygtiesSprendiniuSkaicius ( tiketinasD ) );	
	assertArrayEquals ( "lygties sprendimas, kai D>0",  du_sprendiniai, Funkcijos.rastiSprendinius ( a, b, c, kiek_sprendiniu, tiketinasD ), tikslumas );	
    }    
}
