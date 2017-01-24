package DynamicProgramming;

import java.util.ArrayList;

public class PowerSet {

	public static void main(String[] args){
		
		ArrayList<Integer> set=new ArrayList<Integer>();
		
		set.add(1); 
		set.add(2); 
		set.add(3); 
		//set.add(4);
		//set.add(5);
		
		ArrayList<ArrayList<Integer>> powerSet=getPowerSet(set, 0);
		
		
		for(ArrayList<Integer> itr:powerSet){
			
			for(int i:itr){
				
				System.out.format("%d ", i);
			}
			
			System.out.println("");
		}
	}
	
	
	static ArrayList<ArrayList<Integer>> getPowerSet(ArrayList<Integer> set,
			int index){
		
		ArrayList<ArrayList<Integer>> output= new ArrayList<ArrayList<Integer>>();
		
		if(index==set.size()){
			output.add(new ArrayList<Integer>());
		}
		else{
		
			output=getPowerSet(set, index+1);
			int val=set.get(index);
			ArrayList<ArrayList<Integer>> tempPowerSet= new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> itr:output){
				ArrayList<Integer> tempItr=new ArrayList<Integer>();
				tempItr.addAll(itr);
				tempItr.add(val);
				tempPowerSet.add(tempItr);
			}
			output.addAll(tempPowerSet);
		}
		
		return output;
		
	}
	
	
	
}
