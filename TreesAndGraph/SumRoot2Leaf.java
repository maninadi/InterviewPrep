package TreesAndGraph;

public class SumRoot2Leaf {
public static void main(String[] args){
		
		TreeNode root = new TreeNode();
		root.val=1;
		
		root.left=new TreeNode();
		root.left.val=2;
		root.right=new TreeNode();
		root.right.val=2;
				
				
		root.left.left=new TreeNode();
		root.left.left.val=3;
		root.right.right=new TreeNode();
		root.right.right.val=3;
		
		
		root.left.right=new TreeNode();
		root.left.right.val=4;
		root.right.left=new TreeNode();
		root.right.left.val=4;
		
		System.out.println(sumNumbers(root));
	}

	static int sumNumbers(TreeNode a) {
	    
	    return (int)sumNumbers(a,0)%1003;
	    
	}
	
	static long sumNumbers(TreeNode a, long sum){
	    
	    if(a==null)
	        return 0;
	    
	    sum*=10;
	    sum+=a.val;
	    sum%=1003;
	    if(a.left==null && a.right==null)
	        return sum;
	    
	    return (sumNumbers(a.left,sum)+sumNumbers(a.right,sum))%1003; 
	}

}
