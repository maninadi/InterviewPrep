package Java;

import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<Integer>());
            int d=in.nextInt();
            for(int j=0;j<d;j++)
                al.get(i).add(in.nextInt());
        }
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            if(x<=al.size() && y<=al.get(x-1).size())
            	System.out.println(al.get(x-1).get(y-1));
            else
            	System.out.println("ERROR!");
        }
        in.close();
    }
}
