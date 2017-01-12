package vmware;

import java.util.Arrays;
import java.util.Scanner;

public class Stairs {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        StairCase(_n);
        
    }
	
    static void StairCase(int n) {
        
        char[] s=new char[n];
        Arrays.fill(s,' ');
        for(int i=1;i<=n;i++){
            s[n-i]='#';
            System.out.println(new String(s));
        }

    }
}
