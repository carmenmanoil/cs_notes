package programsCCC;

import java.util.Scanner;

public class AreWeThereYet_Recursion
{

	public static void main(String[] args)
	{
		// Initializer
		Scanner input = new Scanner(System.in);
		
		int[] numberDiff = {0, input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		
		for (int i = 0; i < 5; i++)
		{			
			for (int j = 0; j < 5; j++)
			{
				System.out.print(GetDistance(numberDiff, i, j) + " ");
			}
			
			System.out.println();
		}
	}
	
	static int GetDistance(int[] numbers, int currentIndex, int upcomingIndex)
	{
		if (currentIndex == upcomingIndex)
			return 0;
		else if (upcomingIndex > currentIndex)
			return numbers[currentIndex + 1] + GetDistance(numbers, currentIndex + 1, upcomingIndex);
		else
			return numbers[currentIndex] + GetDistance(numbers, currentIndex - 1, upcomingIndex);
	}

}
