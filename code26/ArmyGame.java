package code26;

import java.util.*;

public class ArmyGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        n=(n/2)+(n%2);
        m=(m/2)+(m%2);
        System.out.println(n*m);
    }
    
}
