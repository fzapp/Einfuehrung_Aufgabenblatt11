package p1;

public class P1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public double potenzenRekursiv(double a, int b) {
		if(b == 0) {
			return 1D;
		}
		if(b < 0) {
			return 1D/potenzenRekursiv(a, -b);
		}
		if(b == 1) {
			return a;
		}
		return a * potenzenRekursiv(a, b-1);
	}
	
	public double potenzenIterativ(double a, int b) {
		if(b == 0) {
			return 1D;
		}
		if(b < 0) {
			a = 1D/a;
		}
		while(b > 1) {
			a = a*a;
			b--;
		}
		return a;
	}

}
