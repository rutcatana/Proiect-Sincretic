package pachet;

public class Fibonacci {
	private int nr;
	
	public Fibonacci(int nr) {
		this.nr = nr;
	}
	
	public void genereazaSir() {
		int a = 0, b = 0 , c = 1;
		
		for(int i = 1; i <= nr; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
	}
	
}
