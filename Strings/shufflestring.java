package Strings;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class shufflestring {
	public static void main(String args[]){
		  try{
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            String input=br.readLine();
	            System.out.println(ShuffleString(input));
	            
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	}

	private static String ShuffleString(String s) {
		int[] cnt=new int[256];
		for(int i=0;i<s.length();i++){
			cnt[s.charAt(i)]++;
		}
		PriorityQueue<Count> pq =new PriorityQueue<Count>(26,new myCompare());
		char[] c=new char[s.length()];
		for(int i=0;i<cnt.length;i++){
			if(cnt[i]>0){
				pq.add(new Count((char)i,cnt[i]));
			}
		}
		int i=0;
		while(!pq.isEmpty()){
			Count a=pq.poll();
			while(a.i>0){
				c[i]=a.c;
				i+=2;
				if(i>=s.length())
					i=1;
				a.i--;
			}
		}
		
		return String.copyValueOf(c);
	}
	
	
}

class Count{
	public char c;
	public int i;
	public Count(char c,int i){
		this.c=c;
		this.i=i;
	}
}

class myCompare implements Comparator<Count>
{
    @Override
    public int compare(Count x, Count y)
    {
        return y.i-x.i;
    }
}