package vmware;

import java.util.*;

public class FlipBits {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		findLen(a);
		in.close();
	}

	private static void  findLen(int[] a) {
		int maxDiff = 0;
		int flipStartIndex = 0;
		int flipEndIndex = 0;
		int ones = 0;
		int totalNumberOfOnes = 0;
		int zeroes=0;

		int currentDiff = 0;
		int currentStart = 0;
		int currentOnesToFlip = 0;
		int currentZeroesToFlip=0;

		for (int i = 0; i < a.length; i++) {
		    if (a[i] == 0) {
				currentDiff++;
				currentZeroesToFlip++;
		    } else {
				currentDiff--;
				currentOnesToFlip++;
				totalNumberOfOnes++;
		    }
		    if (currentDiff > maxDiff) {
				maxDiff = currentDiff;
				flipStartIndex = currentStart;
				flipEndIndex = i;
				ones = currentOnesToFlip;
				zeroes=currentZeroesToFlip;
		    } else if (currentDiff <= 0) {
				currentDiff = 0;
				currentStart = i + 1;
				currentOnesToFlip = 0;
				currentZeroesToFlip=0;
		    }
		}
		System.out.println(totalNumberOfOnes - ones+ zeroes);
	}
}
