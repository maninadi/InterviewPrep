package Java;

import java.util.*;
public class ExcepTryCatch {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try{
        	int x=in.nextInt();
        	int y=in.nextInt();
        	System.out.println(x/y);
        }
        catch(InputMismatchException e){
        	System.out.println(e.getClass().getName());
        }
        catch(Exception e){
        	System.out.println(e);
        }
        in.close();
    }
}
