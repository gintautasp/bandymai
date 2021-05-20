package smulkus;

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
		
		System.out.println ( "prieš .. skaiciuku vieta : " + skaiciukai.toString() + " kiekis : " + kiekis  + " ir jo vieta : " + testuojama_eilute.toString() );
		
		String grazinta_eilute = Funkcijos.keistiMasyva ( kiekis, skaiciukai, testuojama_eilute );
		
		System.out.println ( "po .. skaiciuku vieta : " + skaiciukai.toString()  + " kiekis : " + kiekis + " ir jo vieta : " + grazinta_eilute.toString() );

		if ( testuojama_eilute == grazinta_eilute ) {
		
			System.out.println ( "eilutes tos pacios" );		
			
		} else {
			
			System.out.println ( "eilutes skirtingos" );					
		}
		
		for ( int i = 0; i < kiekis; i++ ) {

			System.out.print ( skaiciukai [ i ] + " " );
		}
	}
}
