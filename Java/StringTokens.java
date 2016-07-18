package Java;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        String[] splits=s.split("[ !,?._'@]+");
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<splits.length;i++)
        	if(splits[i].length()>0){
        		count++;
        		sb.append(splits[i]);
        		sb.append("\n");
        	}
        System.out.println(count);
        System.out.println(sb.toString());
    }
}

