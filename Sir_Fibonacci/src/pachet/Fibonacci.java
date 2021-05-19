package pachet;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Clasa Fibonacii are scopul de a genera primele "n" numere din sir
 * Are un atribut privat de tip intreg care memoreaza cate numere trebuie afisate din sir
 * @author Rut Catana
 *
 */
public class Fibonacci {
	//numarul de numere care trebuie afisate din sir. A fost citit de la tastatura in clasa MainClass
	private int nr;
	
	//constructorul clasei unde se initializeaza valoarea variabilei nr
	public Fibonacci(int nr) {
		this.nr = nr;
	}
	
	//metoda care genereaza numere din sirul lui Fibonacii
	public ArrayList<Integer> genereazaSir() {
		//cele 3 variabil de care avem nevoie pentru a contrui sirul
		int a = 0, b = 0 , c = 1;
		
		ArrayList<Integer> sir = new ArrayList<Integer>();
		
		//instructiunea for unde se genereaza numerele
		for(int i = 1; i <= nr; i++) {
            a = b;
            b = c;
            c = a + b;
            //afisarea fiecarui numar din sir
            System.out.print(a+" ");
            
            //adaugam in vector numarul
            sir.add(a);
        }
		
		return sir;
	}
	
}
