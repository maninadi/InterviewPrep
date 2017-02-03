/*
 * Given a binary tree, return the zigzag level order traversal of its nodes’ values. (ie, from left to right, then right to left for the next level and alternate between).

	Example : 
	Given binary tree
	
	    3
	   / \
	  9  20
	    /  \
	   15   7
	return
	
	[
	         [3],
	         [20, 9],
	         [15, 7]
	]
 */

package TreesAndGraph;

import java.util.*;

public class ZigZagTree {

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
	
		ArrayList<ArrayList<Integer>> res=zigzagLevelOrder(root);
		for(ArrayList<Integer> list:res){
			System.out.println(list.toString());
		}
		
	}
	
	static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
	    
	    Stack<TreeNode> s1=new Stack<TreeNode>();
	    Stack<TreeNode> s2=new Stack<TreeNode>();
	    ArrayList<ArrayList<Integer>> out=new ArrayList<ArrayList<Integer>>();
	    s1.add(a);
	    while(!s1.isEmpty()|| !s2.isEmpty()){
	        if(!s1.isEmpty()){
	            out.add(addNodes1(s1,s2));
	        }
	        else{
	            out.add(addNodes2(s2,s1));
	        }
	    }
	    
	    return out;
	}
	
	static ArrayList<Integer> addNodes1(Stack<TreeNode> read,Stack<TreeNode> write){
	    
	    
	    ArrayList<Integer> res=new ArrayList<Integer>();
	    
	    while(!read.isEmpty()){
	        
	        TreeNode n=read.pop();
	        res.add(n.val);
	        if(n.left!=null)
	            write.push(n.left);
	        if(n.right!=null)
	            write.push(n.right);
	    }
	    
	    return res;
	}
	
	static ArrayList<Integer> addNodes2(Stack<TreeNode> read,Stack<TreeNode> write){
	    
	    
	    ArrayList<Integer> res=new ArrayList<Integer>();
	    
	    while(!read.isEmpty()){
	        
	        TreeNode n=read.pop();
	        res.add(n.val);
	        if(n.right!=null)
	            write.push(n.right);
	        if(n.left!=null)
	            write.push(n.left);
	        
	    }
	    
	    return res;
	}
}
