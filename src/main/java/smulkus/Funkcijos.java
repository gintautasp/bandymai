package smulkus;

/**
 * Hello world!
 *
 */
public class Funkcijos 
{

	public Funkcijos() {
	}
	
	public static String keistiMasyva ( int n, int[] masyvas, String blabla ) {
		
		int tarp;
		
		String funkcijos_blabla = blabla.substring( 0, 10 ) + "labai patinka";
	
		if ( n > 1 ) {
		
			tarp = masyvas [ 0 ];
			masyvas [ 0 ] = masyvas [ n - 1 ];
			masyvas [ n - 1 ] = tarp;
		}
		
		if ( false ) {
		
			funkcijos_blabla = blabla; //.substring ( 0, 10 );			
		}
		return funkcijos_blabla;
	}
	
	public static double skaiciuotiDiskriminanta ( double a, double b, double c ) {
	
		double D = b * b - 4 * a * c;
		
		return D;
	}
	
	public static int lygtiesSprendiniuSkaicius ( double D ) {
	
		int lygties_sprendiniu_skaicius = 0;
		
		if ( D == 0 ) {
		
			lygties_sprendiniu_skaicius = 1;
		}
		
		if ( D > 0 ) {
			
			lygties_sprendiniu_skaicius = 2;
		}
		return lygties_sprendiniu_skaicius;
	}
	
	public static double [] rastiSprendinius ( double a, double b, double c) {
		
		double D = skaiciuotiDiskriminanta ( a, b, c );
		
		int sprendiniu_skaicius = lygtiesSprendiniuSkaicius ( D );
		
		double sprendiniai[] = { 0.0, 0.0 };
		
		switch ( sprendiniu_skaicius ) {
		
			case 1: 
				sprendiniai [ 0 ] = -b / ( 2 * a );
				break;
		
			case 2:
				sprendiniai [ 0 ] = ( -b + Math.sqrt ( D ) ) / ( 2 * a );
				sprendiniai [ 1 ] = ( -b - Math.sqrt ( D ) ) / ( 2 * a );
				break;
		}
		
		return sprendiniai;
	}
}