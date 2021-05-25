package smulkus;

import java.util.Objects;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		
		int[] skaiciukai = { 3, 5, 8, 4, 6, -2, 7, 0, 4, -1 };
		
		Integer kiekis = skaiciukai.length;
		
		String testuojama_eilute = "Java mums labai patinka";
		
		System.out.println ( "prieš .. skaiciuku vieta : " + skaiciukai.toString() + " kiekis : " + kiekis  + " ir  vieta : " + Objects.toString( kiekis ) + " eilute : " + testuojama_eilute + ", o eilutes vieta : " + System.identityHashCode ( testuojama_eilute ) );
		
		String grazinta_eilute = Funkcijos.keistiMasyva ( kiekis, skaiciukai, testuojama_eilute );
		
		System.out.println ( "po .. skaiciuku vieta : " + skaiciukai.toString()  + " kiekis : " + kiekis + " eilute : " + testuojama_eilute + ", o eilutes vieta : " + System.identityHashCode ( testuojama_eilute ) );

		if ( testuojama_eilute == grazinta_eilute ) {
		
			System.out.println ( "eilutes tos pacios" );		
			
		} else {
			
			System.out.println ( "eilutes ne tos pacios" );					
		}
		
		if ( testuojama_eilute.equals ( grazinta_eilute ) ) {
		
			System.out.println ( "eilutes tokios pacios" );		
			
		} else {
			
			System.out.println ( "eilutes skirtingos" );					
		}		
		
		for ( int i = 0; i < kiekis; i++ ) {

			System.out.print ( skaiciukai [ i ] + " " );
		}
		
		System.out.println ( "\n" );
		System.out.println ( "kvadratines lygties sprendimas : " );
		
		double a = 3.0;
		double b = 8.0;
		double c = 4.0;
		
		System.out.println ( "kai a=" + a +", b=" + b + ", c=" + c );
		
		double D =  Funkcijos.skaiciuotiDiskriminanta ( a, b, c );
		
		System.out.println ( "Diskriminatas , D : " +  D );
		
		int sprendiniu_sk = Funkcijos.lygtiesSprendiniuSkaicius( D );
		
		double[] sprendiniai = Funkcijos.rastiSprendinius ( a, b, c );
		
		if ( sprendiniu_sk > 0 ) { 
		
			System.out.println ( "lygties sprendiniai : " );
		
			for( int i = 0; i < sprendiniu_sk; i++) {
			
				System.out.println ( sprendiniai [ i ] + " " );
			}
			
		} else {
			
			System.out.println ( "lygtis sprendiniu neturi" );
		}
	
	}
}
