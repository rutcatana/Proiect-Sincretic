package pachet;

import java.util.ArrayList;
import org.junit.Assert;

/**
 * Clasa de test unde am definit mai multe teste care verifica daca generarea sirului lui Fibonacci se face bine
 * @author Rut
 *
 */
public class Test {

	/**
	 * Cazul1: verificam cand avem 0 numere in sir
	 */
	@org.junit.Test
	public void test() {
		
		ArrayList<Integer> rezultatAsteptat = new ArrayList<Integer>();
		
		Fibonacci fibo = new Fibonacci(0);
		ArrayList<Integer> rezultat = fibo.genereazaSir();
		
		Assert.assertEquals(rezultatAsteptat, rezultat);
	}
	
	/**
	 * Cazul1: verificam cand avem 1 numere in sir
	 */
	@org.junit.Test
	public void test1() {
		
		ArrayList<Integer> rezultatAsteptat = new ArrayList<Integer>();
		rezultatAsteptat.add(0);
		
		Fibonacci fibo = new Fibonacci(1);
		ArrayList<Integer> rezultat = fibo.genereazaSir();
		
		Assert.assertEquals(rezultatAsteptat, rezultat);
	}
	
	/**
	 * Cazul1: verificam cand avem 3 numere in sir
	 */
	@org.junit.Test
	public void test2() {
		
		ArrayList<Integer> rezultatAsteptat = new ArrayList<Integer>();
		rezultatAsteptat.add(0);
		rezultatAsteptat.add(1);
		rezultatAsteptat.add(1);
		
		Fibonacci fibo = new Fibonacci(3);
		ArrayList<Integer> rezultat = fibo.genereazaSir();
		
		Assert.assertEquals(rezultatAsteptat, rezultat);
	}
	
	/**
	 * Cazul1: verificam cand avem 5 numere in sir
	 */
	@org.junit.Test
	public void test3() {
		
		ArrayList<Integer> rezultatAsteptat = new ArrayList<Integer>();
		rezultatAsteptat.add(0);
		rezultatAsteptat.add(1);
		rezultatAsteptat.add(1);
		rezultatAsteptat.add(2);
		rezultatAsteptat.add(3);
		
		Fibonacci fibo = new Fibonacci(5);
		ArrayList<Integer> rezultat = fibo.genereazaSir();
		
		Assert.assertEquals(rezultatAsteptat, rezultat);
	}
	
	/**
	 * Cazul1: verificam cand avem 6 numere in sir
	 */
	@org.junit.Test
	public void test4() {
		
		ArrayList<Integer> rezultatAsteptat = new ArrayList<Integer>();
		rezultatAsteptat.add(0);
		rezultatAsteptat.add(1);
		rezultatAsteptat.add(1);
		rezultatAsteptat.add(2);
		rezultatAsteptat.add(3);
		rezultatAsteptat.add(5);
		
		Fibonacci fibo = new Fibonacci(6);
		ArrayList<Integer> rezultat = fibo.genereazaSir();
		
		Assert.assertEquals(rezultatAsteptat, rezultat);
	}
	
	/**
	 * Cazul1: verificam cand avem 8 numere in sir
	 */
	@org.junit.Test
	public void test5() {
		
		ArrayList<Integer> rezultatAsteptat = new ArrayList<Integer>();
		rezultatAsteptat.add(0);
		rezultatAsteptat.add(1);
		rezultatAsteptat.add(1);
		rezultatAsteptat.add(2);
		rezultatAsteptat.add(3);
		rezultatAsteptat.add(5);
		rezultatAsteptat.add(8);
		rezultatAsteptat.add(13);
		
		Fibonacci fibo = new Fibonacci(8);
		ArrayList<Integer> rezultat = fibo.genereazaSir();
		
		Assert.assertEquals(rezultatAsteptat, rezultat);
	}
	
	/**
	 * Cazul1: verificam cand avem 10 numere in sir
	 */
	@org.junit.Test
	public void test6() {
		
		ArrayList<Integer> rezultatAsteptat = new ArrayList<Integer>();
		rezultatAsteptat.add(0);
		rezultatAsteptat.add(1);
		rezultatAsteptat.add(1);
		rezultatAsteptat.add(2);
		rezultatAsteptat.add(3);
		rezultatAsteptat.add(5);
		rezultatAsteptat.add(8);
		rezultatAsteptat.add(13);
		rezultatAsteptat.add(21);
		rezultatAsteptat.add(34);
		
		Fibonacci fibo = new Fibonacci(10);
		ArrayList<Integer> rezultat = fibo.genereazaSir();
		
		Assert.assertEquals(rezultatAsteptat, rezultat);
	}

}
