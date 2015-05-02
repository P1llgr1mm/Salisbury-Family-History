package people;

import utils.Roller;

public class GGrampa {
	public int glory;
	public int KnightBonusGlory = 1000;

	public void generateGGrampaGlory() {
		int d20modded = new Roller().roll(20, 0) * 100;
		glory = d20modded + KnightBonusGlory;

	}

	int GGrampaGlory = new Roller().roll(20, 0) * 100;
	{
	}
	
	public int getGlory() {
		return glory;
	}
	public int getGloryBonus() {
		return glory/10;
	}
	System.out
}