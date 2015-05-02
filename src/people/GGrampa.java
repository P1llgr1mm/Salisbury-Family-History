package people;

import utils.PrintUtils;
import utils.Roller;

/**
 * This is a class that does something. We would normally write it here.
 * @author John
 *
 */
public class GGrampa {
	public int glory; // variable that will hold glory, initially is 0
	public int KNIGHT_BONUS_GLORY = 1000;

	/**
	 * This is the class constructor. It ALWAYS runs when we initialise the class.
	 */
	public GGrampa() {
		// we have to run the generator or else the variable will be 0!!!
		generateGGrampaGlory();
		
		new PrintUtils().print("--GGrampa has been initialised successfully.");
	}
	
	/**
	 * Generates the value of glory through complex calculations
	 */
	public void generateGGrampaGlory() {
		int d20modded = new Roller().roll(20, 0) * 100;
		glory = d20modded + KNIGHT_BONUS_GLORY;
	}

	/**
	 * Fetches glory
	 * @return integer value of glory
	 */
	public int getGlory() {
		return glory;
	}
	
	/**
	 * Calculates the glory bonus
	 * @return integer bonus value
	 */
	public int getGloryBonus() {
		return glory/10;
	}
}