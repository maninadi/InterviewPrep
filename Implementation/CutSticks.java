package Implementation;

import java.util.*;

public class CutSticks {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(hm.containsKey(arr[arr_i]))
            	hm.put(arr[arr_i], hm.get(arr[arr_i])+1);
            else
            	hm.put(arr[arr_i], 1);
        }
        Arrays.sort(arr);
        int len=arr.length;
        int j=0;
        for(int i=0;i<hm.size();i++){
        	System.out.println(len);
        	int cnt=hm.get(arr[j]);
        	len-=cnt;
        	j+=cnt;
        }
    }
}
