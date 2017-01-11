
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JsonTest {

	public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int info=0;
        int warn=0;
        int maxSS=Integer.MIN_VALUE;
        HashSet<String> snSet=new HashSet<String>();
        HashSet<String> siSet=new HashSet<String>();
        while(in.hasNextLine()){
            String s=in.nextLine();
            if(s.length()==0)
            	break;
            if(s.substring(0,4).compareToIgnoreCase("INFO")==0)
                info++;
            if(s.substring(0,4).compareToIgnoreCase("WARN")==0)
                warn++;
            
            String a=getStr(s,"sn");
            if(a.length()>0) snSet.add(a);
            a=getStr(s,"si");
            if(a.length()>0) siSet.add(a);
            a=getStr(s,"ss");
            if(a.length()>0) maxSS=Math.max(maxSS,getInt(a));
        }
        System.out.println(info);
        System.out.println(warn);
        System.out.println(snSet.size());
        System.out.println(siSet.size());
        System.out.println(maxSS);
        in.close();
    }
    
    static String getStr(String s,String toFind){
        int index=s.indexOf(toFind);
        int iComma=s.indexOf(',',index);
        if(index<0 ||iComma<0)
        	return "";
        String subStr=s.substring(index+toFind.length(),iComma);
        subStr=subStr.replace("\"", "");
        subStr=subStr.replace(":", "");
        return subStr.trim();
    }
    
    static int getInt(String s){
        int val=Integer.MIN_VALUE;
        try{
            val=Integer.parseInt(s.trim());
        }catch(Exception e){
            
        }
        return val;
    }
}
