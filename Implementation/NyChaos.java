package Implementation;
import java.util.*;


public class NyChaos {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }
        
	        int total=0;
	        for(int i=0;i<q.length;i++){
				int diff=q[i]-i;
				diff--;
				if(diff>2){
					System.out.println("Too chaotic");
				}
	        }
			for(int i=0;i<q.length;i++){
				int swaps=0;
				for(int j=0;j<q.length-1;j++){
					if(q[j]>q[j+1]){
						int temp=q[j];
						q[j]=q[j+1];
						q[j+1]=temp;
						swaps++;
					}
				}
				total+=swaps;
				if(swaps==0)
					break;
			}
			
			System.out.println(total);
        }
	}
	

	
}
