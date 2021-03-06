import java.util.Random;

public class PLINKOA {
	// The containers (only containing 7 because Slot A cannot reach the 100 and 500 containers on the right)
	static int count100 = 0;
	static int count500 = 0;
	static int count1000 = 0;
	static int count0 = 0;
	static int count10000 = 0;
	static int count02 = 0;
	static int count10002 = 0;
	
	public static void PlinkoA() {

		Random rand = new Random();

		// A million Plinko chips dropped from Slot A.
		// left = 1, right = 0
		
		for (int i = 1; i <= 1000000; i++) {
			
		// The first peg will have to go right, as there is a wall to the left
			
			int peg1 = 0;
			int peg2 = rand.nextInt(2);
			int peg3 = rand.nextInt(2);
			int peg4 = rand.nextInt(2);
			int peg5 = rand.nextInt(2);
			int peg6 = rand.nextInt(2);
			int peg7 = rand.nextInt(2);
			int peg8 = rand.nextInt(2);
			int peg9 = rand.nextInt(2);
			int peg10 = rand.nextInt(2);
			int peg11 = rand.nextInt(2);
			int peg12 = rand.nextInt(2);
			
			/**
			Below took regard of the walls. When adding the first two pegs, if the sum is 1, the chip
			hits a wall. If so, the third peg will have to go right. 
			**/
			
			if (peg1 + peg2 == 1) {
				peg3 = 0;
			}
			if (peg1 + peg2 + peg3 + peg4 == 2) {
				peg5 = 0;
			}
			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 == 3) {
				peg7 = 0;
			}
			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 == 4) {
				peg9 = 0;
			}
			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 + peg9 + peg10 == 5) {
				peg11 = 0;
			}
			
			// pattern of reaching to each of the containers 
			
			int totalLeft = peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 + peg9 + peg10 + peg11 + peg12;

			if (totalLeft == 6) {
				count100 += 1;
			} else if (totalLeft == 5) {
				count500 += 1;
			} else if (totalLeft == 4) {
				count1000 += 1;
			} else if (totalLeft == 3) {
				count0 += 1;
			} else if (totalLeft == 2) {
				count10000 += 1;
			} else if (totalLeft == 1) {
				count02 += 1;
			} else if (totalLeft == 0) {
				count10002 += 1;

			}

		}
		
		// count of the chips for each container
		
		System.out.println("Amount of 100's: " + count100);
		System.out.println("Amount of 500's: " + count500);
		System.out.println("Amount of 1000's: " + count1000);
		System.out.println("Amount of 0's: " + count0);
		System.out.println("Amount of 10,000's: " + count10000);
		System.out.println("Amount of 0's: " + count02);
		System.out.println("Amount of 1000's: " + count10002);
		System.out.println("Amount of 500's: " + 0);
		System.out.println("Amount of 100's: " + 0);
		System.out.println();
		
		// probability of the chips for each container

		System.out.println("Percentage of 100's: " + (double) count100 / 1000000);
		System.out.println("Percentage of 500's: " + (double) count500 / 1000000);
		System.out.println("Percentage of 1000's: " + (double) count1000 / 1000000);
		System.out.println("Percentage of 0's: " + (double) count0 / 1000000);
		System.out.println("Percentage of 10,000's: " + (double) count10000 / 1000000);
		System.out.println("Percentage of 0's: " + (double) count02 / 1000000);
		System.out.println("Percentage of 1000's: " + (double) count10002 / 1000000);
		System.out.println("Percentage of 500's: " + 0);
		System.out.println("Percentage of 100's: " + 0);

	}
	// method that allows the main class to compare the probability of getting 10,000 from the other 8 classes
	public static double percentage10000A() {
		return (double) count10000 / 1000000;
	}

}
