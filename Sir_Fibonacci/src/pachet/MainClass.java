package pachet;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Program care genereaza sirul lui Fibonacci");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner( System.in );

		System.out.print( "Introduceti numarul dorit: " );
		int nr = scanner.nextInt();
		
		System.out.println("Ati introdus: "+nr);
		
		Fibonacci fibo = new Fibonacci(nr);
		fibo.genereazaSir();
	}

}
