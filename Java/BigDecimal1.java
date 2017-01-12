package Java;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimal1 {
	public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n-1;j++)
            {
        		BigDecimal n1=new BigDecimal(s[j]);
        		BigDecimal n2=new BigDecimal(s[j+1]);
                if(n2.compareTo(n1)>0){
                	String temp=s[j];
                	s[j]=s[j+1];
                	s[j+1]=temp;
                }
            }   
        }
      
        //Output
        for(int i=0;i<n;i++)
            System.out.println(s[i]);
    }
}
