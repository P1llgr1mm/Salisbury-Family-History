package utils;

public class Roller {
//Ενας πολύ απλός dice roller με range πλευρές και mod modifier στο roll.
	public int roll(int range, int mod) {
		int random = (int )(Math.random() * range + 1) + mod;
		return random;
	}
}
