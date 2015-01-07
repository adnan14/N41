/*
 * ZADATAK: Racunar zamislja niz od 10 elemenata (brojeva).
 *			Pitati korisnika da unese jedan broj i nakon toga ispisati poruku 
 * 			nalazi li se taj broj u nizu i na kojoj poziciji. 
 */

public class NizBrojeva {

	public static void main(String[] args) {

		boolean imaNema = false;
		int korisnikovBroj;
		int[] brojevi = new int[10];
		
		for (int i = 0; i < 10; i++) {

			// zamisljanje broja 1-10
			brojevi[i] = (int) (Math.random()*10);
			
			//ispis elemenata random kreiranog niza
			System.out.print(brojevi[i] + " ");
							
		}	
		
		// korisnik upisuje jedan broj
		System.out.println("\nUnesi jedan broj: ");
		korisnikovBroj = TextIO.getlnInt();		
		
		for (int j = 0; j < 10; j++) {

			// poredjenje korisnikovog broja sa elementima zamisljenog niza
			if (brojevi[j] == korisnikovBroj) {
				imaNema = true;
				System.out.printf("Broj %d nalazi se u zamisljenom nizu na %d. mjestu\n", korisnikovBroj, j+1);
			}
		}	

		if (imaNema == false) {
			System.out.printf("Broj %d se NE NALAZI u zamisljenom nizu!\n", korisnikovBroj);
		}
	
	}
}
