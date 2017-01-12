import java.io.*;
import java.util.*;

public class Candies {

	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int res;
        
        int _score_size = Integer.parseInt(in.nextLine());
        int[] _score = new int[_score_size];
        int _score_item;
        for(int _score_i = 0; _score_i < _score_size; _score_i++) {
            _score_item = Integer.parseInt(in.nextLine());
            _score[_score_i] = _score_item;
        }
        
        res = distributeCandy(_score);
        System.out.println(res);
        in.close();
    }
	
	static int distributeCandy(int[] score) {
        int n=score.length;
        
        //safety check - As per constraint n>=1
        if(n==0) 
            return 0;
        
        int[] candies=new int[n];
        
         //First child always gets one candy
        candies[0]=1;
        
        //Do clockwise inorder distribution of candies
        for(int i=1;i<n;i++){
            if(score[i]>score[i-1])
                candies[i]=candies[i-1]+1;
            else
                candies[i]=1;
        }
        //Do anti clockwise distribution to cover descending order scores
        //If the candy distribution contradicts constraint increment the 
        //count of the candy by 1
        for(int i=n-2;i>=0;i--){
            if(score[i]>score[i+1] && candies[i]<=candies[i+1])
                candies[i]=Math.max(candies[i]+1,candies[i+1]+1);
        }
        int total=0;
        for(int i=0;i<n;i++)
            total+=candies[i];
        
        return total;
        
    }
}
