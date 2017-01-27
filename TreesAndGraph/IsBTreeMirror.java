package TreesAndGraph;

public class IsBTreeMirror {

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
		
		System.out.println(isSymmetric(root));
	}
	
	static public boolean isSymmetric(TreeNode a) {
	    
	    return helper(a,a);
	}
	
	static boolean helper(TreeNode n1,TreeNode n2){
	    
	    
	   if(n1==null && n2==null)
	        return true;
	   
	   
	   if((n1!=null) && (n2!=null) && helper(n1.left,n2.right) && helper(n1.right,n2.left))
	    return true;
	   
	   return false;
	    
	}
}


class TreeNode{
	
	TreeNode left;
	TreeNode right;
	int val;
}