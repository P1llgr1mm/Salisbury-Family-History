package utils;

import utils.PrintUtils;
import utils.Roller;

public class MiscDeathMale {
	int MiscDeathRoll;
	String CauseOfDeath;

	public MiscDeathMale() {
		generateMiscDeathMale();
		new PrintUtils().print(CauseOfDeath);
	}

	private void generateMiscDeathMale() {
		generateMiscDeathRoll();
		if (MiscDeathRoll < 3) {
			CauseOfDeath = ("In battle — personal feud.");
		} else if (MiscDeathRoll < 6) {
			CauseOfDeath = ("In battle — neighboring land.");
		} else if (MiscDeathRoll < 8) {
			CauseOfDeath = ("In battle — foreign invaders.");
		} else if (MiscDeathRoll < 10) {
			CauseOfDeath = ("Hunting accident.");
		} else if (MiscDeathRoll < 12) {
			CauseOfDeath = ("Other accident.");
		} else if (MiscDeathRoll < 17) {
			CauseOfDeath = ("Natural causes (old age, illness, etc.)");
		} else {
			CauseOfDeath = ("Unknown cause (disappeared, never came home, etc.)");
		}
	}

	private void generateMiscDeathRoll() {
		MiscDeathRoll = new Roller().roll(20, 0);

	}
}
