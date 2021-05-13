package pachet;

import java.util.Scanner;

/**
 * Proiectul are scopul de a implementa o aplicatie Java care sa genereze primele "n" numere din sirul lui Fibonacii
 * Numarul "n" va fi introdus de catre utiliz\ator si se va citit de la tastatura
 * Proiectul este realizat pentru disciplina "Proiect Sincretic", An 2, semestrul 2
 * @author Rut Catana, 
 * studente, an 2, UPT-AC-Info
 */

/*
 * Clasa principala de unde incepe executia programului si citirea numarului de la tastatura
 */
public class MainClass {

	//metoda principala de unde incepe executia programului
	public static void main(String[] args) {
		
		//mesaj care afiseaza scopul programului
		System.out.println("Program care genereaza sirul lui Fibonacci");
		
		//crearea unui obiect de tip Scanner care ne ajuta sa citim de la tastatura
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner( System.in );

		//mesaj pentru utilizator
		System.out.print( "Introduceti numarul dorit: " );
		//citirea numarului de la tastatura
		int nr = scanner.nextInt();
		
		//afisarea numarului pentru ca utilizatorul sa poate verifica daca este corect
		System.out.println("Ati introdus: "+nr);
		
		//crearea unui obiect de tip Fibonacii
		Fibonacci fibo = new Fibonacci(nr);
		//apelarea metodei care genereaza sirul
		fibo.genereazaSir();
	}

}
