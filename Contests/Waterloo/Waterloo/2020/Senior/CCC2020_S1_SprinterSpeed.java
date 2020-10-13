//ccc 2020 s1 - Sprinters Speed OOP, ArrayList, Sorting - Carmen Manoil
//data - pairs of time-distance values, we need to find max velocity - finding a max algo
//3
//0 100
//20 50
//10 120
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

class Point implements Comparable{
  int t, d;
  public Point(int t, int d){
    this.t = t;
    this.d = d;
  }
  
  //for debugging
  public String toString(){
    return " t:"+ t+" d:"+d;
  }
  
  //compare first the score, if the score is equal compare scoregfp as a String
  //comparing scoregfp as a String compares g first, then f, then p
  public int compareTo(Object other) {
	  Point another = (Point)other;
	  int toReturn = 0;
	  if (t > another.t){
		  toReturn = 1;
	  }
	  if (t < another.t){
		  toReturn = -1;
	  }
	  if (t == another.t){
		  toReturn = 0;
	  }
	  return toReturn;
  }
}
public class CCC2020_S1_SprinterSpeed {
	public static void main(String[] args)	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		ArrayList<Point> points = new ArrayList<Point>(); 
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			String [] input = br.readLine().split(" ");
			points.add(new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
		}
		Collections.sort(points);
		System.out.println(points);
		//find max slope
		double maxvel = 0;
		for (int i=0; i<n-1; i++) {
			double t = points.get(i).t - points.get(i+1).t;
			double d = points.get(i).d - points.get(i+1).d;
			double vel = d/t;
			if (Math.abs(vel) > maxvel) {
				maxvel = Math.abs(vel);
			}
		}
		System.out.println(maxvel);
		} catch (IOException e) {
			System.out.println("Error Encountered getting user input:"+ e.getMessage());
			e.printStackTrace();
		}
		
	}
}
