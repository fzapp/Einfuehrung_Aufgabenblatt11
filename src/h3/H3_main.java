package h3;

import java.util.Arrays;

public class H3_main {

	public static void main(String[] args) {
		//int[] test = {2,12,3,7,-1,2};
		//System.out.println(Arrays.toString(mergeSort(test)));

		// TODO Auto-generated method stub

	}

	public static int[] mergeSort(int[] a) {
		if (a.length == 1) {
			return a;
		}

		int halbeArrayLength = a.length / 2;
		int zweiteHaelfteArrayLength = a.length - halbeArrayLength;
		int[] ersteHaelfte = new int[halbeArrayLength];
		int[] zweiteHaelfte = new int[zweiteHaelfteArrayLength];
		for (int i = 0; i < halbeArrayLength; i++) {
			ersteHaelfte[i] = a[i];
		}
		for (int i = 0; i < zweiteHaelfteArrayLength; i++) {
			zweiteHaelfte[i] = a[i + halbeArrayLength];
		}
		ersteHaelfte = mergeSort(ersteHaelfte);
		zweiteHaelfte = mergeSort(zweiteHaelfte);
		
		int[] result = new int[a.length];
		int pointerOne = 0;
		int pointerTwo = 0;
		for(int i = 0; i<a.length; i++) {
			if(pointerOne >= ersteHaelfte.length) {
				result[i] = zweiteHaelfte[pointerTwo];
				pointerTwo++;
			}
			else if(pointerTwo >= zweiteHaelfte.length) {
				result[i] = ersteHaelfte[pointerOne];
				pointerOne++;
			}
			else if(ersteHaelfte[pointerOne] <= zweiteHaelfte[pointerTwo]) {
				result[i] = ersteHaelfte[pointerOne];
				pointerOne++;
			}
			else if(ersteHaelfte[pointerOne] > zweiteHaelfte[pointerTwo]) {
				result[i] = zweiteHaelfte[pointerTwo];
				pointerTwo++;
			}
		}
		return result;
		

	}

}
