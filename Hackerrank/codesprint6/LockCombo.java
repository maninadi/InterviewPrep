package codesprint6;

import java.util.*;

public class LockCombo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] a=new int[5];
		int[] b=new int[5];
		for(int i=0;i<5;i++)
			a[i]=in.nextInt();
		for(int i=0;i<5;i++)
			b[i]=in.nextInt();
		in.close();
		int count=0;
		for(int i=0;i<5;i++){
			int k=Math.abs(b[i]-a[i]);
			if(k<=5)
				count+=k;
			else
				count+=(10-k);
		}
		System.out.println(count);
    }
}
