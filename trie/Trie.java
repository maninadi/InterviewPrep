package trie;

class Node{
    Node[] children=new Node[26];
    boolean end=false;

    public void insert(String word,int i){
        int c=word.charAt(i)-'a';
        if(children[c]==null)
            children[c]=new Node();
        if(i==word.length()-1){
            children[c].end=true;
            return;
        }
        children[c].insert(word,i+1);
    }
    
    public boolean search(String word,int i){
        
        int c=word.charAt(i)-'a';
        if(children[c]==null)
            return false; 
        if(i==word.length()-1){
            return children[c].end;
        }
        return children[c].search(word,i+1);
    }
    
    public boolean startsWith(String prefix,int i){
        int c=prefix.charAt(i)-'a';
        if(children[c]==null)
            return false; 
        if(i==prefix.length()-1)
            return true;
        return children[c].startsWith(prefix,i+1);
    }
}

public class Trie {

	public static void main(String[] args){
		
		Trie t=new Trie();
		t.insert("hello");
		System.out.println(t.startsWith("hell"));
	}
	
    /** Initialize your data structure here. */
    Node root=new Node();
    public Trie() {
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word==null|| word.length()==0)
            return;
        root.insert(word,0);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word==null|| word.length()==0)
            return false; 
        return root.search(word,0); 
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix==null || prefix.length()==0)
            return false;
        return root.startsWith(prefix,0);
    }

}

