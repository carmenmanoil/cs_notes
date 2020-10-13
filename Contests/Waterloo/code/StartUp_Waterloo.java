//ccc 2020 s... - name - type of problem - Carmen Manoil
//description - pairs of time-distance values, we need to find max velocity - finding a max algo
//data in sample

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

// Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray()

class CCC2020_S1_named {
	public static void main(String[] args)	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		   
			
			
		} catch (IOException e) {
			System.out.println("Error Encountered getting user input:"+ e.getMessage());
			e.printStackTrace();
		}
		
	}
}

class APoint implements Comparable{
	  int x, y;
	  public APoint(int x, int y){
	    this.x = x;
	    this.y = y;
	  }
	  
	  //for debugging
	  public String toString(){
	    return " x:"+ x+" y:"+y;
	  }
	  
	  //compare first the score, if the score is equal compare scoregfp as a String
	  //comparing scoregfp as a String compares g first, then f, then p
	  //Collections.sort(points);
	  public int compareTo(Object other) {
		  APoint another = (APoint)other;
		  int toReturn = 0;
		  if (x > another.x){
			  toReturn = 1;
		  }
		  if (x < another.x){
			  toReturn = -1;
		  }
		  if (x == another.x){
			  toReturn = 0;
		  }
		  return toReturn;
	  }
	}