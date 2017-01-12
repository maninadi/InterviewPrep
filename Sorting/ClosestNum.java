package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ClosestNum {
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt();
		}
		in.close();
		Arrays.sort(ar);
		ArrayList<Integer> nums=findSmalldiff(ar);
		print(nums);
	}
	

	private static void print(ArrayList<Integer> nums) {
		for(int i=0;i<nums.size();i++){
			System.out.print(nums.get(i)+" ");
		}
	}


	static ArrayList<Integer> findSmalldiff(int[] ar){
		
		int diff=Integer.MAX_VALUE;
		ArrayList<Integer> nums=new ArrayList<Integer>(); 
		for(int i=0;i<ar.length-1;i++){
			int temp=(ar[i+1]-ar[i]);
			if(temp<diff){
				diff=(ar[i+1]-ar[i]);
				nums.clear();
				nums.add(ar[i]);
				nums.add(ar[i+1]);
			}else if(temp==diff){
				nums.add(ar[i]);
				nums.add(ar[i+1]);
			}
		}
		
		return nums;
	}

}
