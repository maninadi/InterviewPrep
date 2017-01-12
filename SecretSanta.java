
import java.util.*;

public class SecretSanta {

	public static void main(String[] args){
		final String[] participants = new String[] { "Kyle", "Kenny", "Eric", "Stan",
				"Stewie", "Brian" };
		
		Scanner in=new Scanner(System.in);
		boolean exit=false;
		SSParent[] solution = new SSParent[2];
		solution[0]=new Solution1();
		solution[1]=new Solution2();
		while(!exit){
			int n=getQuery(in);
			if(n==-1) break;
			String[] assignments=solution[n].generateAssignments(participants);
			printSolution(participants,assignments);
		}
		in.close();
	}
	
	/**
	 * Prints a prompt for user
	 * @return option selected to run
	 */
	private static int getQuery(Scanner in) {
		System.out.println("Selection an option");
		System.out.println("%t 0- Exit");
		System.out.println("%t 1- Run Soluation 1");
		System.out.println("%t 2- Run Soluation 2");
		int n=in.nextInt();
		return n-1; 
	}

	/**
	 * Prints the output 
	 * @param participants - List of participants
	 * @param assignments - Corresponding assignments.
	 */
	static void printSolution(String[] participants,String[] assignments){
		for(int i=0;i<assignments.length;i++)
			System.out.format("%s --> %s\n",assignments[i],participants[i]);
		
		System.out.println("");
	}
}

interface SSParent{
	public String[] generateAssignments(final String[] participants);
}

/**
 * First solution - does random shuffling- 
 */
class Solution1 implements SSParent{
	
	/**
	* @param participants list of individuals participating in the draw.
	* @return the list of individuals paired with the participants where participants[0]
	is matched
	* with assignments[0], participants[1] is matched with assignments[1], and so on.
	*/
	public String[] generateAssignments(final String[] participants) {

		// cases where there is no shuffling possible
		if(participants==null || participants.length<=1)
			return participants;
		
		//Prep the assignments
		String[] assignments=participants.clone();
		
		//Do random Shuffle until we fins a valid solution
		while(!isValidShuffle(participants,assignments))
			doRandomShuffle(assignments);
		
		return assignments;

	}
	
	/**
	* @param participants list of individuals participating in the draw.
	* @param assignments list of assignments selected
	* @return true if it is valid assignment.
	*/
	boolean isValidShuffle(String[] participants,
			String[] assignments) {
		for(int i=0;i<participants.length;i++){
			if(participants[i].compareTo(assignments[i])==0)
				return false;
		}
		return true;
	}

	/**
	* @param assignments list of assignments selected
	*/
	void doRandomShuffle(String[] assignments){
		ArrayList<String> shuffler=new ArrayList<String>();
		for(String s:assignments)
			shuffler.add(assignments[s.hashCode()%assignments.length]);
		Collections.shuffle(shuffler);
		assignments=shuffler.toArray(assignments);
	}
}

/**
 * First solution - does random number generation 
 */
class Solution2 implements SSParent{
	
	/**
	* @param participants list of individuals participating in the draw.
	* @return the list of individuals paired with the participants where participants[0]
	is matched
	* with assignments[0], participants[1] is matched with assignments[1], and so on.
	*/
	public String[] generateAssignments(final String[] participants) {

		// cases where there is no shuffling possible
		if(participants==null || participants.length<=1)
			return participants;
		
		//Prep the assignments
		String[] assignments=participants.clone();
		
		//Do random Shuffle until we fins a valid solution
		while(!isValidShuffle(participants,assignments))
			doRandomShuffle(assignments);
		
		return assignments;

	}
	
	/**
	* @param participants list of individuals participating in the draw.
	* @param assignments list of assignments selected
	* @return true if it is valid assignment.
	*/
	boolean isValidShuffle(String[] participants,
			String[] assignments) {
		for(int i=0;i<participants.length;i++){
			if(participants[i].compareTo(assignments[i])==0)
				return false;
		}
		return true;
	}

	/**
	* @param assignments list of assignments selected
	*/
	void doRandomShuffle(String[] assignments){
		ArrayList<String> shuffler=new ArrayList<String>();
		for(String s:assignments)
			shuffler.add(s);
		Collections.shuffle(shuffler);
		assignments=shuffler.toArray(assignments);
	}
}
