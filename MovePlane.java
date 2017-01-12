
import java.io.*;
import java.security.InvalidParameterException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovePlane {

	
	static String movePlane2(String command) {
		try{
			  String regex="(\\d*)(\\D)";
		      Pattern p=Pattern.compile(regex);
	          Matcher m=p.matcher(command);
	          Coordinates coord=new Coordinates();
	          int prevOffset=0;
			  char prevdir = 0;
		      while(m.find()){
		    	 int offset=offsetConv(m.group(1));
			   	 char dir=m.group(2).charAt(0);
			  
				 if(dir=='X' && prevdir==0) continue;
				 if(dir=='X'){
					 offset=-prevOffset;
					 dir=prevdir;
				 }
				 coord=move(coord,offset,dir);
				 prevOffset=offset;
				 prevdir=dir;
				 
		      }
		      return String.format("(%d, %d)", coord.x,coord.y);
		}catch(Exception e){
			
		}
		  
	    return "(999, 999)";
	}
	
	 static String movePlane(String command) {
		 try{
			 Coordinates coord=new Coordinates();
			 int prevOffset=0;
			 char prevdir = 0;
			 for(int i=0;i<command.length();i++){
					 
				 int[] out=getOffset(command,i);
				 int offset=0;
				 offset=out[0];
				 i=out[1];
				 char dir=command.charAt(i);
					 				 
				 if(dir=='X' && prevdir==0) continue;
				 if(dir=='X'){
					 offset=-prevOffset;
					 dir=prevdir;
				 }
				 
				 coord=move(coord,offset,dir);
				 prevOffset=offset;
				 prevdir=dir;
			 }
			 return String.format("(%d, %d)", coord.x,coord.y);
		 }catch(Exception e){
			 return "(999, 999)";
		 }
	}
	static int[] getOffset(String s,int index){

		int multiplier=1;
		String value="";
		int i=index;
		for(;i<s.length();i++){
			if(Character.isDigit(s.charAt(i)))
				value+=s.charAt(i);
			else if(s.charAt(i)=='-')
				multiplier=-1;
			else
				break;
		}

		
		int[] out=new int[2];
		if(value.length()==0){
			out[0]=1;
			out[1]=i;	
			return out;
		}
			
		
		try{
			out[0]=Integer.parseInt(value)*multiplier;
			out[1]=i;
		}catch(Exception e){
			
		}
		
		return out;
	}
	 
	private static Coordinates move(Coordinates coord, int offset, char dir) throws Exception {
		switch(dir){
			case 'U':
				coord.y+=offset;
				break;
			case 'D':
				coord.y-=offset;
				break;
			case 'R':
				coord.x+=offset;
				break;
			case 'L':
				coord.x-=offset;
				break;
			default:
				throw new Exception();
			
		}
		return coord;
	}
	
	static class Coordinates{
		int x=0;
		int y=0;
	}
	
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String res;
        String _command;
        try {
            _command = in.nextLine();
        } catch (Exception e) {
            _command = null;
        }
        
        res = movePlane2(_command);
        System.out.println(res);
    }
	
	static int offsetConv(String s){
		if(s.length()==0)
			return 1;
		return Integer.parseInt(s);
	}
		
}


