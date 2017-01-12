package ctci;


import java.util.*;

public class Contacts {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ContactNode root=new ContactNode();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.compareTo("add")==0)
            	root.add(contact, 0);
            else
            	System.out.println(root.getPartials(contact,0));
        }
        in.close();
    }
}

class ContactNode{
	ContactNode[] children=new ContactNode[26];
	int count=0;
	public void add(String s, int i){
		if(i==s.length())
			return;
		char c=s.charAt(i);
		if(children[c-'a']==null)
			children[c-'a']=new ContactNode();
		
		children[c-'a'].count++;
		children[c-'a'].add(s, i+1);
	}
	public int getPartials(String partial,int i) {
		if(i==partial.length()-1)
			return children[partial.charAt(i)-'a']==null?0:children[partial.charAt(i)-'a'].count;
		
		if(children[partial.charAt(i)-'a']!=null)
			return children[partial.charAt(i)-'a'].getPartials(partial,i+1);
		
		return 0;
			
	}
}