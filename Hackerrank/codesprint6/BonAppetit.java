package codesprint6;

import java.util.*;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int bActual=0;
		for(int i=0;i<n;i++){
			int b=in.nextInt();
			if(i!=k)
				bActual+=b;
		}
		bActual/=2;
		int bCharged=in.nextInt();
		if((bCharged-bActual)==0)
			System.out.println("Bon Appetit");
		else
			System.out.println(bCharged-bActual);
    }
}
