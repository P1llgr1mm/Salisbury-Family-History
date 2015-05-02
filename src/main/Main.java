package main;

import johncompany.utils.PrintUtils;
import utils.Roller;
import people.GGrampa;
import people.Grampa;
import utils.PrintUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int testroll = new Roller().roll(6, 0);
		System.out.println("This is a test roll. You rolled " + testroll + ".");

		GGrampa GGramps = new GGrampa();
		PrintUtils printutils = new PrintUtils();
		GGramps = GGrampa.getGlory();
	}

}
