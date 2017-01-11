package Arrays;

public class LenThreeWithMaxProduct {

	public static void main(String[] args){
		//int[] arr={6, 7, 8, 1, 2, 3, 9, 10};
		int[] arr={1, 5, 10, 8, 9};
		int[] res=maxProduct(arr);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
	}
	
	static int[] maxProduct(int[] arr){
		
		int maxProdcut=Integer.MIN_VALUE;
		
		int[] left2ndMax=getLeft2ndMax(arr);
		int[] rightMax=getRightMax(arr);
		int[] res=new int[3];
		for(int i=0;i<arr.length;i++){
			int product=arr[i]*left2ndMax[i]*rightMax[i];
			if(product>maxProdcut){
				maxProdcut=product;
				res[0]=arr[i];
				res[1]=left2ndMax[i];
				res[2]=rightMax[i];
			}
				
		}
		
		return res;
	}

	private static int[] getRightMax(int[] arr) {
		int[] result=new int[arr.length];
		int max=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]>max)
				max=arr[i];
			result[i]=max>arr[i]?max:0;
		}
		return result;
	}

	private static int[] getLeft2ndMax(int[] arr) {
		int[] result=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int max=Integer.MIN_VALUE;
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i] && arr[j]>max)
					max=arr[j];
			}
			result[i]=max;
		}
		return result;
	}
}
