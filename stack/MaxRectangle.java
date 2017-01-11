package stack;


import java.util.*;

public class MaxRectangle {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.println(maxRectangle(arr));
    }
    
    static int maxRectangle(int[] a){
        int maxRec=Integer.MIN_VALUE;
        Stack<Integer> s=new Stack<Integer>();
        int i=0;
        for(;i<a.length;){
            if(s.isEmpty() || a[s.peek()]<=a[i]){
                s.push(i++);
            }
            else {
                int top=s.pop();
                if(s.isEmpty()){
                  maxRec=Math.max(maxRec,a[top]*i);  
                }
                else{
                    maxRec=Math.max(maxRec,a[top]*(i-s.peek()-1));  
                }
           }         
        }
        while(!s.isEmpty()){
            int top=s.pop();
            if(s.isEmpty()){
                maxRec=Math.max(maxRec,a[top]*i);  
            }
            else{
                maxRec=Math.max(maxRec,a[top]*(i-s.peek()-1));  
            }
        }
      return maxRec;
    }
}
