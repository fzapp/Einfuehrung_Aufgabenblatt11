package h2;

public class H2_main {
	
	private static int[] fibonacciZahlen = new int[1000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		benchmark(1);
		benchmark(5);
		benchmark(10);
		benchmark(20);
		benchmark(40);

	}
	
	public static void benchmark(int n) {
		long before = System.nanoTime();
		fibonacci(n);
		long after = System.nanoTime();
		long duration = after - before;
		System.out.println("Die " + n + "-te FibonacciZahl ist: " + fibonacci(n) + " (fibonacci)");
		System.out.println("Elapsed nanoseconds (fibonacci): " + duration);
		before = System.nanoTime();
		fibonacciCached(n);
		after = System.nanoTime();
		duration = after - before;
		System.out.println("Die " + n + "-te FibonacciZahl ist: " + fibonacciCached(n) + " (fibonacciCached)");
		System.out.println("Elapsed nanoseconds (fibonacciCached): " + duration);
		before = System.nanoTime();
		fibonacciIterativ(n);
		after = System.nanoTime();
		duration = after - before;
		System.out.println("Die " + n + "-te FibonacciZahl ist: " + fibonacciIterativ(n) + " (fibonacciIterativ)");
		System.out.println("Elapsed nanoseconds (fibonacciIterativ): " + duration);
		
	}
	
	public static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int fibonacciCached(int n) {
		if(fibonacciZahlen[n-1] != 0) {
			return fibonacciZahlen[n-1];
		}
		else if(n == 1 || n == 2) {
			fibonacciZahlen[n-1] = 1;
			return 1;
		}
		fibonacciZahlen[n-1] = fibonacciCached(n-2) + fibonacciCached(n-1);
		return fibonacciZahlen[n-1];
	}
	
	public static int fibonacciIterativ(int n) {
		int small = 1;
		int big = 1;
		int temp;
		for(int i = 2; i<n; i++) {
			temp = big;
			big += small;
			small = temp;
		}
		return big;
	}
	
	

}
