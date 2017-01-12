package TreesAndGraph;

public class BTreeDiameter {

	public static void main(String[] args){

		BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);
        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);
		
        
        System.out.println(diameter(root));
        
        new BTNode(10);
	}

	static int diameter(BTNode root){
		
		
		if(root==null)
			return 0;
		
		int lHeight=height(root.left);
		int rHeight=height(root.right);
		
		int lDiameter=diameter(root.left);
		int rDiameter=diameter(root.right);
		
		return Math.max(1+lHeight+rHeight, Math.max(lDiameter, rDiameter));
	}

	private static int height(BTNode node) {
		
		if(node==null)
			return 0;
		return 1+Math.max(height(node.left), height(node.right));
	}
	
}
