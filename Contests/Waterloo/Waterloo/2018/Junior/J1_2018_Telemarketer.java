package programsCCC;

import java.util.Scanner;

public class J1_2018_Telemarketer
{

	public static void main(String[] args)
	{
		// Initializer
		Scanner input = new Scanner(System.in);
		int[] numbers = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		
		if ( (numbers[0] == 8 || numbers[0] == 9) && (numbers[3] == 8 || numbers[3] == 9) && numbers[1] == numbers[2])
		{
			System.out.println("ignore");
		}
		else
			System.out.print("answer");
	}

}
