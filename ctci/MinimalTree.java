package ctci;

public class MinimalTree {

	public static void main(String[] args){
		
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		TreeNode head=createBST(arr,0,arr.length-1);
		inorder(head);
	}
	
	static TreeNode createBST(int[] arr,int start,int end){
		if(start>end)
			return null;
		int mid=(start+end)/2;
		TreeNode newNode=new TreeNode();
		newNode.data=arr[mid];
		newNode.left=createBST(arr,start,mid-1);
		newNode.right=createBST(arr,mid+1,end);
		return newNode;
	}
	
	static void inorder(TreeNode head){
		if(head==null)
			return;
		inorder(head.left);
		System.out.print(head.data+" ");
		inorder(head.right);
	}
}

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
}
