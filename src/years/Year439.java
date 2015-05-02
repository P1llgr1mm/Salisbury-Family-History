package years;

import utils.PrintUtils;
import utils.Roller;

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
		if (EventRoll = 1) {
			YearEvent = ("You rolled a 1 = Died (see “Miscellaneous Causes of Death” sidebar).");
		}

	}
}
