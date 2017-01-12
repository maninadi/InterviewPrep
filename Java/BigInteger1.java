package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInteger1 {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BigInteger n1=new BigInteger(in.nextLine());
        BigInteger n2=new BigInteger(in.nextLine());
        System.out.println(n1.add(n2).toString());
        System.out.println(n1.multiply(n2).toString());
    }
}
