import java.util.Random;

public class PLINKOI {

	static int count1000 = 0;
	static int count0 = 0;
	static int count10000 = 0;
	static int count02 = 0;
	static int count10002 = 0;
	static int count5002 = 0;
	static int count1002 = 0;
	

	public static void PlinkoI() {

		Random rand = new Random();

		for (int i = 1; i <= 1000000; i++) {

			int peg1 = 1;
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

			if (peg1 + peg2 == 1) {
				peg3 = 1;
			}
			if (peg1 + peg2 + peg3 + peg4 == 2) {
				peg5 = 1;
			}
			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 == 3) {
				peg7 = 1;
			}
			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 == 4) {
				peg9 = 1;
			}
			if (peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 + peg9 + peg10 == 5) {
				peg11 = 1;
			}

			int totalLeft = peg1 + peg2 + peg3 + peg4 + peg5 + peg6 + peg7 + peg8 + peg9 + peg10 + peg11 + peg12;
// let right = 0, left = 1

			if (totalLeft == 12) {
				count1000 += 1;
			} else if (totalLeft == 11) {
				count0 += 1;
			} else if (totalLeft == 10) {
				count10000 += 1;
			} else if (totalLeft == 9) {
				count02 += 1;
			} else if (totalLeft == 8) {
				count10002 += 1;
			} else if (totalLeft == 7) {
				count5002 += 1;
			} else if (totalLeft == 6) {
				count1002 += 1;
			}

		}

		System.out.println("Amount of 100's: " + 0);
		System.out.println("Amount of 500's: " + 0);
		System.out.println("Amount of 1000's: " + count1000);
		System.out.println("Amount of 0's: " + count0);
		System.out.println("Amount of 10,000's: " + count10000);
		System.out.println("Amount of 0's: " + count02);
		System.out.println("Amount of 1000's: " + count10002);
		System.out.println("Amount of 500's: " + count5002);
		System.out.println("Amount of 100's: " + count1002);
		System.out.println();

		System.out.println("Percentage of 100's: " + 0);
		System.out.println("Percentage of 500's: " + 0);
		System.out.println("Percentage of 1000's: " + (double) count1000 / 1000000);
		System.out.println("Percentage of 0's: " + (double) count0 / 1000000);
		System.out.println("Percentage of 10,000's: " + (double) count10000 / 1000000);
		System.out.println("Percentage of 0's: " + (double) count02 / 1000000);
		System.out.println("Percentage of 1000's: " + (double) count10002 / 1000000);
		System.out.println("Percentage of 500's: " + (double) count5002 / 1000000);
		System.out.println("Percentage of 100's: " + (double) count1002 / 1000000);

	}
	public static double percentage10000I() {
		return (double) count10000 / 1000000;
	}
}
