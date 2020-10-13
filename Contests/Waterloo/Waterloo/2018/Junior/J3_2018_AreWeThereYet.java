import java.util.Scanner;
public class J3_2018_AreWeThereYet{
	public static void main(String[] args) {
	// Initializers
	Scanner scan = new Scanner(System.in);
	int[] input = { 0, scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt() };
	int[][] output = new int [5][5];
	for (int cityStart =0; cityStart<5; cityStart++) {
		for (int cityTo =0; cityTo<5; cityTo++) {
			int distance =0;
			//cityTo<cityStart
			if (cityTo < cityStart){
				for (int i = cityTo; i<=cityStart; i++) {
					distance = distance + input[i];
				}
			}
			if (cityTo == cityStart) {
				distance = 0;
			}
			if (cityTo > cityStart){
				for (int i = cityStart + 1; i<=cityTo; i++) {
					distance = distance + input[i];
				}
			}
		System.out.print(distance + " ");
		}
		
		System.out.println();
	
	}
	}
}
