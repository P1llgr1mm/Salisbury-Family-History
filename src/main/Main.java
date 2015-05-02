package main;

import frame.UserFrame;
import people.GGrampa;
import utils.PrintUtils;
import utils.Roller;

public class Main {
	// reusable fields go up here
	static PrintUtils printUtils;
	static GGrampa ggGenerator;
	static UserFrame frame;// delete this if you do not want the frame

	/**
	 * This is the entry point of the program
	 * @param args These are not used but have to stay here!
	 */
	public static void main(String[] args) {
		// initialise the classes
		printUtils = new PrintUtils(); // this is the utility class for printing
		ggGenerator = new GGrampa(); // this is the grandpa generator class

		frame = new UserFrame();// delete this if you do not want the frame

		runProgram(); // delegate everything else to the next method
	}

	public static void runProgram() {
		// try out a test roll - just because
		int testroll = new Roller().roll(6, 0);
		// print out the result
		show("This is a test roll. You rolled " + testroll + ".");

		int grampaGlory; // this is the variable that will hold the glory of grandpa
		ggGenerator.generateGGrampaGlory(); // generate glory again
		grampaGlory = ggGenerator.getGlory();

		// print out the result
		show("Grampa glory is " + grampaGlory + ".");
	}

	/**
	 * This is a class for less writing!!!
	 * @param message
	 */
	public static void show(String message) {
		// print out the result
		printUtils.print(message);
		frame.sendMessageToFrame(message); // delete this if you do not want the frame
	}
}
