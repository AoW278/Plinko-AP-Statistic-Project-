import java.util.Random;
import java.util.Scanner;

public class PLINKOF {

	static int count100 = 0;
	static int count500 = 0;
	static int count1000 = 0;
	static int count0 = 0;
	static int count10000 = 0;
	static int count02 = 0;
	static int count10002 = 0;
	static int count5002 = 0;
	static int count1002 = 0;

	public static void PlinkoF() {

		Random rand = new Random();

		for (int i = 1; i <= 1000000; i++) {
			int peg1 = rand.nextInt(2);
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

			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 + peg9 + peg10 == 10) {
				peg11 = 0;
			}
			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 == 0) {
				peg7 = 1;
			}
			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 == 1) {
				peg7 = 1;
			}
			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 + peg9 + peg10 == 2) {
				peg11 = 1;
			}

			int totalLeft = peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 + peg9 + peg10 + peg11 + peg12;
// let right = 0, left = 1

			/**
			 * 
			 * 100 11 500 10 1000 9 0 8 L 10000 7 L 0 6 L 1000 5 500 4 100 3
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			if (totalLeft == 11) {
				count100 += 1;
			} else if (totalLeft == 10) {
				count500 += 1;
			} else if (totalLeft == 9) {
				count1000 += 1;
			} else if (totalLeft == 8) {
				count0 += 1;
			} else if (totalLeft == 7) {
				count10000 += 1;
			} else if (totalLeft == 6) {
				count02 += 1;
			} else if (totalLeft == 5) {
				count10002 += 1;
			} else if (totalLeft == 4) {
				count5002 += 1;
			} else if (totalLeft == 3) {
				count1002 += 1;
			}

		}

		System.out.println("Amount of 100's: " + count100);
		System.out.println("Amount of 500's: " + count500);
		System.out.println("Amount of 1000's: " + count1000);
		System.out.println("Amount of 0's: " + count0);
		System.out.println("Amount of 10,000's: " + count10000);
		System.out.println("Amount of 0's: " + count02);
		System.out.println("Amount of 1000's: " + count10002);
		System.out.println("Amount of 500's: " + count5002);
		System.out.println("Amount of 100's: " + count1002);
		System.out.println();

		System.out.println("Percentage of 100's: " + (double) count100 / 1000000);
		System.out.println("Percentage of 500's: " + (double) count500 / 1000000);
		System.out.println("Percentage of 1000's: " + (double) count1000 / 1000000);
		System.out.println("Percentage of 0's: " + (double) count0 / 1000000);
		System.out.println("Percentage of 10,000's: " + (double) count10000 / 1000000);
		System.out.println("Percentage of 0's: " + (double) count02 / 1000000);
		System.out.println("Percentage of 1000's: " + (double) count10002 / 1000000);
		System.out.println("Percentage of 500's: " + (double) count5002 / 1000000);
		System.out.println("Percentage of 100's: " + (double) count1002 / 1000000);

	}

	public static double percentage10000F() {
		return (double) count10000 / 1000000;
	}
}