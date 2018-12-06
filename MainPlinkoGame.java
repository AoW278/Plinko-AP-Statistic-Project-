
/***
 * AP Statistic Project
 * Programmer: Ao Wang
 * 
 * Plinko! In the same of Plinko on The Price is Right, a contestant gets to drop chips from
 * anywhere on the top of a board. The chip falls through the board until it lands in one of
 * the labeled slots at the bottom. The board consists of 13 rows of pegs. The player places
 * the chip between any two pegs of his or her choice on the first row, but then gravity (and chance)
 * determines the chip's path to the bottom. (To simplify communication, I've labeled the nine "slots"
 * formed by adjacent pegs A through I)
 * 
 * Assignment: Suppose you only care if the chip will fall in the center slot, "10,000." Design a simulation
 * for dropping a chip on the board and observinf whether it landed in this slot. Use my simulations to answer
 * the folloing questions. 
 * 
 * 1. In which slot of slots should you drop a Plinko Chip to have the MAXIMUM probability of landing in the $10,000
 * slot? Approximately what is the probability?
 * 
 * 2. In which slot or slots should you drop a Plinko Chip to have the MINIMUM probability of landing in the $10,000
 * slot? Approximately what is the probability? 
 *  
 *  
 */

import java.util.ArrayList;

public class PLINKO {

	public static void main(String[] args) {
		
		/**
		Prints out the methods of each Slot class that shows the probability of
		dropping to each of the 9 containers
		**/
		
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		PLINKOA.PlinkoA();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n");
		
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
		PLINKOB.PlinkoB();
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB\n");

		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
		PLINKOC.PlinkoC();
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\n");

		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
		PLINKOD.PlinkoD();
		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD\n");

		System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		PLINKOE.PlinkoE();
		System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE\n");

		System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
		PLINKOF.PlinkoF();
		System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\n");

		System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
		PLINKOG.PlinkoG();
		System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG\n");

		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		PLINKOH.PlinkoH();
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\n");

		System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		PLINKOI.PlinkoI();
		System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII\n");

		// arrays used to match the probability of each of the 9 slots with its corresponding letter
		
		double[] percentage10000 = { PLINKOA.percentage10000A(), PLINKOB.percentage10000B(), PLINKOC.percentage10000C(),
				PLINKOD.percentage10000D(), PLINKOE.percentage10000E(), PLINKOF.percentage10000F(),
				PLINKOG.percentage10000G(), PLINKOH.percentage10000H(), PLINKOI.percentage10000I() };
		String[] slots = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

		double max = percentage10000[0];
		double min = percentage10000[0];
		
		// determines the greatest probability from the 9 slots
		
		for (int i = 0; i < percentage10000.length; i++) {
			if (max < percentage10000[i]) {
				max = percentage10000[i];

			}
		}

		System.out.println("Maximum value: " + "Slot " + slots[findIndex(percentage10000, max)] + " has a " + max
				+ " chance of getting $10,000");
		
	// determines the lowest probability from the 9 slots
		
		for (int i = 0; i < percentage10000.length; i++) {
			if (min > percentage10000[i]) {
				min = percentage10000[i];
			}
		}
		System.out.println("Minimum value: " + "Slot " + slots[findIndex(percentage10000, min)] + " has a " + min
				+ " chance of getting $10,000");

	}
	
	// method used to match the specific probability with the slot that it was dropped from
	
	public static int findIndex(double[] percentage10000, double max) {
		if (percentage10000 == null) {
			return -1;
		}
		int len = percentage10000.length;
		int i = 0;
		while (i < len) {
			if (percentage10000[i] == max) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}
}
