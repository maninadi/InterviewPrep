package stack;


import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        Stack<Node> s=new Stack<Node>();
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int op=in.nextInt();
            if(op==1){
                int val=in.nextInt();
                Node cur=new Node();
                cur.data=val;
                max=s.isEmpty()?Integer.MIN_VALUE:s.peek().max;
                max=Math.max(max,val);
                cur.max=max;
                s.push(cur);
            }
            else if(op==2){
                s.pop();
            }
            else{
                Node cur=s.peek();
                System.out.println(cur.max);
            }
        }
        
        in.close();
    }
}

class Node{
    int data;
    int max;
}