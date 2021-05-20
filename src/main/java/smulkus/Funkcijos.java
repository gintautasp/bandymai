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
}