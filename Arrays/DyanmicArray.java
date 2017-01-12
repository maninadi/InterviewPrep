package Arrays;

import java.util.*;

public class DyanmicArray {
	static ArrayList<Integer>[] seqList=null;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int Q=in.nextInt();
        
        seqList=(ArrayList<Integer>[])new ArrayList[N];
        int lastAnswer=0;
        for(int i=0;i<Q;i++){
        	int op=in.nextInt();
        	int x=in.nextInt();
        	int y=in.nextInt();
        	ArrayList<Integer> seq=getList(x,lastAnswer,N);
        	if(op==1){
        		seq.add(y);
        	}
        	else{
        		int size=seq.size();
        		if(size>0){
        			y%=size;
        			lastAnswer=seq.get(y);
        			System.out.println(lastAnswer);
        		}
        	}
        }
        in.close();
    }
	private static ArrayList<Integer> getList(int x, int lastAnswer, int n) {
		int i=(x^lastAnswer)%n;
		if(seqList[i]==null)
			seqList[i]=new ArrayList<Integer>();
		return seqList[i];
	}
}
