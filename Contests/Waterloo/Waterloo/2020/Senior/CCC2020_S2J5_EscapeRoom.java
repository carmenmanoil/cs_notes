// ccc2020_J5S2_EscapeRoom, Carmen Manoil, DFS or BFS, Stack, HashMap, Set, FactorsFinding
// used a HashMap to store a list pairs of factors for a number e.g. entry 8 - { (2,4), (4,2), (1, 8), (8,1)} 
// used a FactorsPair object. The seen Set and stack Stack are storing FcatorsPair objects
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
//3 - rows
//4 - columns
//3 10 8 14
//1 11 12 12 
//6 2 3 9

public class CCC2020_S2J5_EscapeRoom {
	//a hashMap with all the pairs of Factors found already for a given number - efficiency
	//e.g. entry 8 - { (2,4), (4,2), (1, 8), (8,1)} 
	static HashMap<Integer,Collection<FactorsPair>> memory = new HashMap<Integer, Collection<FactorsPair>>();
	public static void main(String[] args)	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m, n;
		int [][] grid;
		try {
			m = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			//nice way to read in a grid
			//creates the 2D array but not the lines arrays. m+1 to avoid index 0
			grid = new int [m+1][]; 
			for (int i=1; i<m+1; i++) {
				//quickly parses a String into an array. The "0 "+ trick is an wasy way to avoid index 0
				grid[i] = Arrays.stream(("0 " + br.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
                //System.out.println("i "+ Arrays.toString(grid[i]));
			}
			if (dfs(grid, m, n )) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		} catch (IOException e) {
			System.out.println("Error Encountered getting user input:"+ e.getMessage());
			e.printStackTrace();
		}
	}
	
	//dfs algoorithm 
	static boolean dfs (int [][] grid, int m, int n) {
		//this keeps track of cells already visited
		//Constructs a new, empty tree set
		Set<FactorsPair> seen = new HashSet<FactorsPair>();
		Stack<FactorsPair> stack = new Stack<FactorsPair>();
	    stack.addAll(factorsOf(m, n, grid[1][1]));
		while (stack.size()!=0) {
             FactorsPair check = stack.pop();
		     if (seen.contains(check))
				 continue;
		     seen.add(check);
			 stack.addAll(factorsOf(m, n, grid[check.n1][check.n2]));
			 if (check.n1 == m && check.n2 == m)
				  return true;
		}
		return false;
	}
	
	//returns a list of pair factors for a given no, e.g. factors (m, n, 8) returns
	//{ (2,4), (4,2), (1, 8), (8,1)} if 2, 4, 8 smaller than m, n
	static Collection<FactorsPair> factorsOf (int m, int n, int no){
	    // if n has already been added to memory HashMap just return its factors as a list
	    if (memory.containsKey(no))
	        return memory.get(no);
	    Collection<FactorsPair> factors = new ArrayList <FactorsPair>();
	    
	    for (int i=1; i <=((int)(Math.pow(no, 0.5)+1)); i++) {
	        if (no % i == 0) {
	            if (i <= m && no/i <= n)
	                factors.add(new FactorsPair(i, no/i));
	            if (i <= n && no/i <= m)
	                factors.add(new FactorsPair(no/i, i));
	        }
	    }
        memory.put(n, factors );
        return factors;
	}

}

class FactorsPair {
	  int n1, n2;
	  public FactorsPair(int n1, int n2){
	    this.n1 = n1;
	    this.n2 = n2;
	  }
	  
	  //for debugging
	  public String toString(){
	    return " n1:"+ n1+" n2:"+n2;
	  }
}
