package programsCCC;

import java.util.Scanner;

public class J2_2018_OccupyParking
{

	public static void main(String[] args)
	{
		// Initializers
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int counter = 0;
		
		String[] parking = new String[length];
		parking[0] = input.next();
		parking[1] = input.next();
		
		for (int i = 0; i < length; i++)
		{
			if (parking[0].charAt(i) == 'C' && parking[0].charAt(i) == parking[1].charAt(i))
				counter++;
		}
		
		System.out.println(counter);
		
	}

}
