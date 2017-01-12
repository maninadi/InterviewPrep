package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

public class CalculateVolume {
	public static void main(String[] args) {
		   DoNotTerminate.forbidExit();
		   try {
		    Calculate cal = new Calculate();
		    int T = cal.get_int_val();
		    while (T--> 0) {
		     double volume = 0.0;
		     int ch = cal.get_int_val();
		     if (ch == 1) {
		      int a = cal.get_int_val();
		      volume = Calculate.do_calc().get_volume(a);
		     } else if (ch == 2) {
		      int l = cal.get_int_val();
		      int b = cal.get_int_val();
		      int h = cal.get_int_val();
		      volume = Calculate.do_calc().get_volume(l, b, h);

		     } else if (ch == 3) {
		      double r = cal.get_double_val();
		      volume = Calculate.do_calc().get_volume(r);

		     } else if (ch == 4) {
		      double r = cal.get_double_val();
		      double h = cal.get_double_val();
		      volume = Calculate.do_calc().get_volume(r, h);

		     }
		     cal.output.display(volume);
		    }

		   } catch (NumberFormatException e) {
		    System.out.print(e);
		   } catch (IOException e) {
		    e.printStackTrace();
		   } catch (DoNotTerminate.ExitTrappedException e) {
		    System.out.println("Unsuccessful Termination!!");
		   }


		  } //end of main
}

class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {}

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	}

class Calculate{
    
    public MyCalc output=null;
    private Scanner in=null;
    
    public Calculate(){
        output=new MyCalc();
        in=new Scanner(System.in);
    }
    
    public int get_int_val() throws IOException {
        return in.nextInt();
    }
    public double get_double_val() throws IOException {
        return in.nextDouble();
    }
    
    public static MyCalc do_calc(){
        return new MyCalc();
    }
    
}

class MyCalc{
    public double get_volume(int a){
        if(a<1)
            throw new NumberFormatException("All the values must be positive");
        return Math.pow(a,3);
    }
    public double get_volume(int l,int b,int h){
        if(l<1 || b<1 ||h<1)
            throw new NumberFormatException("All the values must be positive");
        return l*b*h;
    }
    public double get_volume(double r){
        if(r<1)
            throw new NumberFormatException("All the values must be positive");
        return (Math.PI*r*2)/3;
    }
    public double get_volume(double r,double h){
        if(r<1 || h<1)
            throw new NumberFormatException("All the values must be positive");
        return (Math.PI*Math.pow(r,2)*h);
    }
    
    public void display(double volume){
        System.out.format("%.3f\n", volume);
    }
    
}
