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
	private ArrayList<Integer> sir;
	
	//constructorul clasei unde se initializeaza valoarea variabilei nr
	public Fibonacci(int nr) {
		this.nr = nr;
		sir = new ArrayList<Integer>();
	}
	
	//metoda care genereaza numere din sirul lui Fibonacii
	public ArrayList<Integer> genereazaSir() {
		
		//cele 3 variabil de care avem nevoie pentru a contrui sirul
		int a = 0, b = 0 , c = 1;
		
		//instructiunea do-while unde se genereaza numerele	
		do {
            a = b;
            b = c;
            c = a + b;
            
            //adaugam in vector numarul
            sir.add(a);
        } while(b<=nr);
		
		return sir;
	}
	
	public ArrayList<Integer> getSir(){
		return sir;
	}
	
}
