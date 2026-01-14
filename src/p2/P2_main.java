package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int zweierLogarithmusRekursiv(int a) {
		if(a == 1) {
			return 0;
		}
		return 1+zweierLogarithmusRekursiv(a/2);
	}
	
	public int zweierLogarithmusIterativ(int a) {
		int result = 0;
		while(a != 1) {
			result++;
			a = a/2;
		}
		return result;
	}

}
