package utils;

public class Roller {
//���� ���� ����� dice roller �� range ������� ��� mod modifier ��� roll.
	public int roll(int range, int mod) {
		int random = (int )(Math.random() * range + 1) + mod;
		return random;
	}
}
