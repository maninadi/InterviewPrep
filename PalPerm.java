import java.util.ArrayList;
import java.util.HashMap;


public class PalPerm {
	public static void main(String args[]){
		ArrayList<String> result=getPerms("man");
	}
	
	static boolean ispalPerm(String s){
		
		HashMap<Character , Integer> hm = new HashMap<Character , Integer>();
		
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
			if(hm.containsKey(s.charAt(i))){
				int val=hm.get(s.charAt(i));
				val++;
				hm.remove(s.charAt(i));
				hm.put(s.charAt(i), val);
			}
			else{
				hm.put(s.charAt(i), 1);
			}
		}
		boolean isOdd=false;
		for(Character c : hm.keySet()){
			
			if(hm.get(c)%2==1 && !isOdd){
				isOdd=true;
			} else if(hm.get(c)%2==1){
				return false;
			}
		}
		
		return true;
	}
	
	static ArrayList<String> getPerms(String s){
		ArrayList<String> result=new ArrayList<String>();
		getPermHelper("",s,result);
		return result;
	}
	
	static void getPermHelper(String prefix,String remainder,ArrayList<String> result){
		if(remainder.length()==0) result.add(prefix);
		
		for(int i=0;i<remainder.length();i++){
			String before=remainder.substring(0, i);
			String after=remainder.substring(i+1, remainder.length());
			char c=remainder.charAt(i);
			getPermHelper(prefix+c, before+after, result);
		}
		
	}
	
	static void rotate(int[][] matrix,int n){
		
		for(int layer=0;layer<n/2;layer++){
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;i++){
				
				int offset=i-first;
				
				int top=matrix[first][i];
				
				//left->top
				matrix[first][i]=matrix[last-offset][first];
				//bottom->left
				matrix[last-offset][first]=matrix[last][last-offset];
				//right->bottom
				matrix[last][last-offset]=matrix[i][last];
				//top ->right
				matrix[i][last]=top;
				
			}
		}
	}
	
}
