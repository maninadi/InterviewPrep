package TreesAndGraph;

public class InorderSuccessor {

	public static void main(String[] args){
		
		TreeNode root = new TreeNode();
		root.val=4;
		
		root.left=new TreeNode();
		root.left.val=2;
		root.right=new TreeNode();
		root.right.val=8;
				
				
		root.left.left=new TreeNode();
		root.left.left.val=1;
		root.left.right=new TreeNode();
		root.left.right.val=3;
		
		
		root.right.left=new TreeNode();
		root.right.left.val=7;
		root.right.right=new TreeNode();
		root.right.right.val=9;
		
		
		InorderSuccessor o=new InorderSuccessor();
		
		TreeNode p=o.inorderSuccessor(root, root.right.left);
		System.out.println(p!=null?p.val:null);
	}
	
	TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root==null)
            return null;
        
        if(p.right!=null)
            return min(p.right);
        
        TreeNode succ=null;
        while(root!=null){
            if(root==p)
                return succ;
            if(p.val<root.val){
                succ=root;
                root=root.left;
            }
            else
                root=root.right;
        }
        
        return null;
    }
    
    TreeNode min(TreeNode n){
        
        while(n.left!=null)
            n=n.left;
        
        return n;
    }
}
