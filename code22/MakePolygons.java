package code22;

import java.util.Scanner;

public class MakePolygons {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double a[] = new double[n];
        double sum=0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            sum+=a[a_i];
        }
        in.close();
        sum/=2;
        int count=0;
        for(int a_i=0; a_i < n; a_i++){
            if(a[a_i]>= sum){
            	count+=(a[a_i]/sum);
            }
        }
        System.out.println(count);
        
    }
}
