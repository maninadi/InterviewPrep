package CodeSprint4;

import java.util.Scanner;

public class EqualStacks {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int sum1=0,sum2=0,sum3=0;
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            sum1+=h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            sum2+=h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            sum3+=h3[h3_i];
        }
        System.out.println(findMaxHeight(h1,h2,h3,sum1,sum2,sum3));
    }

	private static long findMaxHeight(int[] h1, int[] h2, int[] h3, int sum1,
			int sum2, int sum3) {
		
		int min=Math.min(sum1, Math.min(sum2,sum3));
		int i1=0,i2=0,i3=0;
		while(true){
			res s1=findNextMin(h1,i1,sum1,min);
			sum1=s1.sum;
			i1=s1.i;
			min=sum1;
			res s2=findNextMin(h2,i2,sum2,min);
			sum2=s2.sum;
			i2=s2.i;
			min=sum2;
			res s3=findNextMin(h3,i3,sum3,min);
			sum3=s3.sum;
			i3=s3.i;
			if((sum1==sum2)&&(sum2==sum3))
				break;
			min=Math.min(sum1, Math.min(sum2,sum3));
		}
		
		return min;
	}
	
	private static res findNextMin(int[] a,int start,int sum,int min){
		if(start>=a.length)
			return new res(0,0);
		
		while(sum>min){
			sum-=a[start];
			start++;
		}
		return new res(Math.min(sum, min),start);
		
	}

}

class res{
	int sum=0;
	int i=0;
	res(int sum,int i){
		this.sum=sum;
		this.i=i;
	}
}
