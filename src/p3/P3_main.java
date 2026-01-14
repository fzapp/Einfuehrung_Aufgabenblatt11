package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int kapitalNachN_Jahren(int kapital, int n) {
		if(n == 0) {
			return kapital;
		}
		return (kapitalNachN_Jahren(kapital, n-1) *5)/100;
	}

}
