package Implementation;

import java.util.*;
public class Library {

	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		int eD=in.nextInt();
		int eM=in.nextInt();
		int eY=in.nextInt();
		
		int sD=in.nextInt();
		int sM=in.nextInt();
		int sY=in.nextInt();
		
		in.close();
		
		int fine=0;
		if(eY-sY>0)
			fine+=10000;
		else if((eY==sY) && eM-sM>0)
			fine+=((eM-sM)*500);
		else if((eY==sY) && (eM==sM) && eD-sD>0)
			fine+=((eD-sD)*15);
		
		System.out.println(fine);
	}
}
