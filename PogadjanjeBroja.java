
/*
 * ZADATAK: Racunar zamislja broj od 1-100. Korisnik pogadja zamisljeni broj sve dok ne pogodi.
 * 			Ako ne pogodi, dobije poruku da li je njegov broj veci ili manji od zamisljenog. 
 */

public class PogadjanjeBroja {
	
	public static void main(String[] args) {

		int zamisljeniBroj, pokusajPogadjanja;
		String stanje;
		
		// zamisljanje broja 1-100
		zamisljeniBroj = (int) (Math.random()*100);
		
		do {

			// korisnik pogadja broj
			System.out.println("Pogadjaj zamisljeni broj: ");
			pokusajPogadjanja = TextIO.getlnInt();		
			
			// provjera da li je pogodjen
			if (zamisljeniBroj > pokusajPogadjanja) {
				stanje = "VECI";
			}
			else if (zamisljeniBroj < pokusajPogadjanja) {
				stanje = "MANJI";
			} else {
				System.out.println("Pogodio si zamisljeni broj! CESTITAM!"); return;
			}
				
			System.out.printf("Zamisljeni broj je %s od %d.\n", stanje, pokusajPogadjanja);
		} while (zamisljeniBroj != pokusajPogadjanja);			
	}
}