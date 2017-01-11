package TreesAndGraph;


import java.util.*;

public class SwapAlgo {

	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		Node root=getTree(in);
		
		int T=in.nextInt();
				
		for(int i=0;i<T;i++){
			int K=in.nextInt();
			swap(root,K);
			print(root);
			System.out.println("");
		}
		in.close();
    }
	
	private static void swap(Node root, int k) {
		if(root==null)
			return;
		swap(root.left,k);
		swap(root.right,k);
		if(root.depth%k==0){
			Node temp=root.left;
			root.left=root.right;
			root.right=temp;
		}
		
	}
	
	static void print(Node root){
		if(root==null)
			return;
		print(root.left);
		System.out.print(root.value+" ");
		print(root.right);
	}

	static Node getTree(Scanner in){
		Node root=new Node(1,1);
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		
		int n=in.nextInt();
		int i=0;
		while(i<2*n){
			int left=in.nextInt();
			int right=in.nextInt();
			Node curr=q.poll();
			if(left>=0){
				curr.left=new Node(left,curr.depth+1);
				q.add(curr.left);
			}
				
			if(right>=0){
				curr.right=new Node(right,curr.depth+1);
				q.add(curr.right);
			}
			i+=2;	
		}
		return root;
	}
	
}

class Node{
	int value;
	Node left;
	Node right;
	int depth;
	Node(int value,int depth){
		this.value=value;
		this.depth=depth;
	}
}
