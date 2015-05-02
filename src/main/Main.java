package main;

import utils.Roller;
import people.GGrampa;
import people.Grampa;
import utils.PrintUtils;

public class Main {

	public static void main(String[] args) {
		// initialise the classes
		PrintUtils printUtils = new PrintUtils(); // this is the utility class for printing
		GGrampa ggGenerator = new GGrampa(); // this is the grampa object
		
		// try out a test roll - just because
		int testroll = new Roller().roll(6, 0);
		// print out the result
		printUtils.print("This is a test roll. You rolled " + testroll + ".");

		int grampaGlory; // this is the variable that will hold the glory of grampa
		grampaGlory = ggGenerator.getGlory();
		// print out the result
		printUtils.print("Grampa glory is " + grampaGlory + ".");
	}

}
