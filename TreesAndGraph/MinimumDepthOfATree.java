package TreesAndGraph;

/*
 * Find Minimum Depth of a Binary Tree
	Given a binary tree, find its minimum depth. The minimum depth is the number of nodes along the shortest path from root node down to the nearest leaf node.
	
	For example, minimum height of below Binary Tree is 2.
	Example Tree
	
	Note that the path must end on a leaf node. For example, minimum height of below Binary Tree is also 2.
	
	          10
	        /    
	      5  
 */

import java.util.*;

public class MinimumDepthOfATree {

	public static void main(String[] args){
		
		TreeNode one=new TreeNode();
		TreeNode two=new TreeNode();
		TreeNode three=new TreeNode();
		TreeNode four=new TreeNode();
		TreeNode five=new TreeNode();
		
		one.left=two;
		one.right=three;
		
		two.left=four;
		two.right=five;
		
		System.out.println(minDepth(one));
		
	}
	
	static int minDepth(TreeNode root){
		
		if(root==null)
			return 0;
		
		Queue<QNode> q=new LinkedList<QNode>();
		
		QNode node=new QNode(root,1);
		q.add(node);
		
		while(!q.isEmpty()){
			node=q.poll();
			
			if(node.t.left==null && node.t.right==null)
				return node.d;
			
			if(node.t.left!=null){
				q.add(new QNode(node.t.left,node.d+1));
			}
			
			if(node.t.right!=null){
				q.add(new QNode(node.t.right,node.d+1));
			}
		}
		
		return 0;
	}
	
}

class QNode{
	TreeNode t;
	int d;
	QNode(TreeNode t,int d){
		this.t=t;
		this.d=d;
	}
}


