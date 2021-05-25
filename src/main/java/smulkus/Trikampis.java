package smulkus;

/**
 * Hello world!
 *
 */
public class Trikampis
{

	public double statinis1;
	public double statinis2;
	public double izambine;
	
	public Trikampis() {
	}
	
	public Trikampis ( double a, double b, double c ) {
		
		nustatyti ( a, b, c );
	}
	
	public void nustatyti ( double a, double b, double c ) {
		
		statinis1 = a;
		statinis2 = b;
		izambine = c;
	}
/*
	public void vestiIsKlaviaturos() throws IOException {
		
		...
		
		statinis1 = Double.parseDouble ( reader.readLine() );
		
		..
		statinis2 = Double.parseDouble ( reader.readLine() );
		
		..
		statinis3 = Double.parseDouble ( reader.readLine() );
	}
*/	
}