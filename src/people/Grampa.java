package people;

import utils.PrintUtils;
import utils.Roller;

public class Grampa {
	int glory;
	public int KNIGHT_BONUS_GLORY = 1000;
	int die1;
	int die2;
	int diesum;
	
	public Grampa() {
		// we have to run the generator or else the variable will be 0!!!
		generateGrampaGlory();

		new PrintUtils().print("--Grampa has been initialised successfully.");
	}

	public void generateGrampaGlory() {
		die1 = new Roller().roll(20, 0);
		die2 = new Roller().roll(20, 0);
		diesum = die1 + die2;
		glory = diesum + KNIGHT_BONUS_GLORY;
	}

	public int getGlory() {
		return glory;
	}

}
