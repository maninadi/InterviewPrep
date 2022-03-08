package ctci;

import java.util.Scanner;

public class CountInversions {

	static int countInversions(int[] arr){
        int[] temp=new int[arr.length];
        return mergesort(arr,temp,0,arr.length-1);
    }
    
    
    public static int mergesort(int[] arr,int[] temp,int start,int end){
        if(start>=end)
            return 0;
        int middle=(start+end)/2;
        int swaps=0;
        swaps+=mergesort(arr,temp,start,middle);
        swaps+=mergesort(arr,temp,middle+1,end);
        return swaps+merge(arr,temp,start,middle,end);
    }
    
    public static int merge(int[] arr,int[] temp,int start,int middle,int end){
        int swaps=0;
        int index=start;
        int left=start;
        int right=middle+1;
        
        while(left<=middle && right<=end){
            if(arr[left]<=arr[right]){
                temp[index]=arr[left];
                left++;
            }
            else{
                temp[index]=arr[right];
                right++;
                swaps+=(middle+1-left);
            }
            index++;
        }
        
        System.arraycopy(arr, left, temp, index, middle-left+1);
        System.arraycopy(arr, right, temp, index, end-right+1);
        System.arraycopy(temp, start, arr, start, end-start+1);
        return swaps;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
            for(int i=0;i<arr.length;i++)
            	System.out.print(arr[i]+" ");
        }
    }
    
}
