package years;

import utils.PrintUtils;
import utils.Roller;
import utils.MiscDeathMale;

public class Year439 {
	int EventRoll;
	String YearEvent;

	public Year439() {
		generate439event();

		new PrintUtils()
				.print("--Event roller for Year 439 has been initialised successfully.");

	}

	private void generate439event() {
		EventRoll = new Roller().roll(20, 0);
		if (EventRoll == 1) {
			YearEvent = ("Miscellaneous Death! => " + CauseOfDeath);
		} else if (EventRoll < 7) {
			YearEvent = ("Nothing signifi cant occurred.");
		} else { YearEvent = ("Fought at the Battle of Carlion.");
		GetBattleResult();
		}

	}
}
