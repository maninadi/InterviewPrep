package Strings;

import java.util.*;

public class RichieRich {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        in.close();
        char[] nums=number.toCharArray();
        boolean[] numsb=new boolean[nums.length];
        int l=0;
        int r=n-1;
        while(l<=r && k>0){
        	if(nums[l]!=nums[r]){
        		char c=nums[l]>nums[r]?nums[l]:nums[r];
        		numsb[l]=(nums[l]==c);
        		numsb[r]=(nums[r]==c);
        		nums[l]=c;
        		nums[r]=c;
        		k--;
        	}
        	l++;
        	r--;
        }
        l=0;
        r=n-1;
        while(l<=r && k>0){
        	if(nums[l]!='9'){
        		if((numsb[l]||numsb[r]) || (l==r)){
        			nums[l]='9';
            		nums[r]='9';
            		k--;
        		}
        		else if(k>=2){
        			nums[l]='9';
            		nums[r]='9';
            		k-=2;
        		}
        	}
        	l++;
        	r--;
        }
        StringBuilder sb=new StringBuilder(new String(nums));
        String s1=sb.toString();
        String s2=sb.reverse().toString();
        if(s1.compareTo(s2)!=0)
        	System.out.println("-1");
        else
        	System.out.println(s1);
    }
}
