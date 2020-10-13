package programsCCC;

import java.util.Scanner;

public class Sunflowers
{

	public static void main(String[] args)
	{
		// Initializer
		Scanner input = new Scanner(System.in);
		int dimension = input.nextInt();
		int[][] values = new int[dimension][dimension];
		
		// Take input
		for (int i = 0; i < dimension; i++)
		{
			for (int j = 0; j < dimension; j++)
			{
				values[i][j] = input.nextInt();
			}
		}
		
		// Check case where it is rotated 180 degrees
		if (values[0][0] > values[1][0] && values[0][0] > values[0][1])
		{
			System.out.println("Detected180");
			for (int i = dimension - 1; i >= 0; i--)
			{
				for (int j = dimension - 1; j >= 0; j--)
				{
					System.out.print(values[i][j] + " ");
				}
				
				System.out.println();
			}
		}
		// Check case where rotated 90 degrees left
		else if (values[0][0] > values[1][0])
		{
			System.out.println("Detected90L");
			for (int i = 0; i < dimension; i++)
			{
				for (int j = dimension - 1; j >= 0; j--)
				{
					System.out.print(values[j][i] + " ");
				}
				
				System.out.println();
			}
		}
		// Check case where rotated 90 degrees right
		else if (values[0][0] > values[0][1])
		{
			System.out.println("Detected90R");
			for (int i = dimension - 1; i >= 0; i--)
			{
				for (int j = 0; j < dimension; j++)
				{
					System.out.print(values[j][i] + " ");
				}
				
				System.out.println();
			}
		}
		// Case where it is not rotated
		else
		{
			for (int i = 0; i < dimension; i++)
			{
				for (int j = 0; j < dimension; j++)
				{
					System.out.print(values[i][j] + " ");
				}
				
				System.out.println();
			}
		}
		
	}

}
