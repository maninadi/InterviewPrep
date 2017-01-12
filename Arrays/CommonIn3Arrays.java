	package Arrays;


public class CommonIn3Arrays {
	
	public static void main(String[] args){
		 int a[] = {1, 4, 5, 10, 20, 40, 80};
	     int b[] = {2, 3, 4, 20, 80, 100};
	     int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
	     commonElements(a, b, c);
	}

	
	static void commonElements(int[] a,int[] b,int[] c){
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length && k<c.length){
			
			if(a[i]==b[j] && b[j]==c[k]){
				System.out.print(a[i]+" ");
				i++;j++;k++;
			}
			else{
				int min=Math.min(Math.min(a[i], b[j]), c[k]);
				
				if(min==a[i])
					i++;
				else if(min==b[j])
					j++;
				else
					k++;	
			}
			
		}
		
	}
	
}
