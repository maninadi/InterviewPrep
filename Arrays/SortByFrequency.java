package Arrays;


/*
 * Print the elements of an array in the decreasing 
 * frequency if 2 numbers have same frequency then print the one which came first.

	Examples:
	
	Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
	Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}
	
	Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
	Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
 */

import java.util.*;

public class SortByFrequency {

	public static void main(String[] args){
		
		int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
		
		System.out.println(Arrays.toString(sortByFrequency(arr)));
		
	}
	
	static int[] sortByFrequency(int[] a){
		
		HashMap<Integer,Element> hm=new HashMap<Integer,Element>(); 
		
		for(int i:a){
			if(!hm.containsKey(i)){
				Element e=new Element();
				e.count=1;
				e.index=i;
				hm.put(i, e);
			}
			else{
				Element e=hm.get(i);
				e.count++;
				hm.put(i, e);
			}
		}
		
		hm=sortHashMap(hm);
		int i=0;
		for(int k:hm.keySet()){
			for(int j=0;j<hm.get(k).count;j++){
				a[i]=k;
				i++;
			}
		}
		
		return a;
	}
	
	static HashMap<Integer,Element> sortHashMap(HashMap<Integer,Element> hm){
		
		List<Map.Entry<Integer, Element>> list=
				new LinkedList<Map.Entry<Integer, Element>>(hm.entrySet());
		
		/*Collections.sort(list, new Comparator<Map.Entry<Integer, Element>>() {
			public int compare(Map.Entry<Integer, Element> o1,
			                    Map.Entry<Integer, Element> o2) {
			     if(o1.getValue().count!=o2.getValue().count)
			    	 return o2.getValue().count-o1.getValue().count;
			     else
			    	 return o1.getValue().index-o2.getValue().index;
			 }
		});
		
		*/
		hm.clear();
		
		for(Map.Entry<Integer, Element> e:list){
			hm.put(e.getKey(), e.getValue());
		}
		
		
		return hm;	
	}
}

class Element{
	int count=0;
	int index=0;
}
