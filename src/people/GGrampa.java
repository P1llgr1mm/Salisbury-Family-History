package people;

import utils.Roller;

public class GGrampa {
	public int glory; // variable that will hold glory, initially is 0
	public int KNIGHT_BONUS_GLORY = 1000;

	public GGrampa() {
		// we have to run the generator or else the variable will be 0!!!
		generateGGrampaGlory();
	}
	
	public void generateGGrampaGlory() {
		int d20modded = new Roller().roll(20, 0) * 100;
		glory = d20modded + KNIGHT_BONUS_GLORY;
	}



	
	public int getGlory() {
		// make sure that we have run the generator first!!!
		if (glory == 0) {
			generateGGrampaGlory();
		}
		return glory;
	}
	public int getGloryBonus() {
		return glory/10;
	}
}