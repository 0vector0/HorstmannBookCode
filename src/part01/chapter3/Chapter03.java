package part01.chapter3;

public class Chapter03 {
	// перечислимые типы enum
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRA_LARGE
	}

	public static void main(String[] args) {

		// Возврат меньшего
		int x = 10;
		int y = 5;
		int min = x < y ? x : y;
		System.out.println(min);

		// TODO Глава 5 читать.
		// перечислимые типы enum
		Size s = Size.MEDIUM;
		System.out.println(s);

		// Массивы
		int[] mass = new int[5];

		// Цикл for each
		for (int i : mass) {
			mass[i] = i;
			System.out.println(mass[i]);
		}

		// Копирование массива
		int[] smallPrimes = { 2, 3, 4, 7, 11, 13, 15 };
		int[] luckyNumbers = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
		System.arraycopy(smallPrimes, 2, luckyNumbers, 3, 4);

		for (int i = 0; i < luckyNumbers.length; i++) {
			System.out.println(i + ": " + luckyNumbers[i]);
		}
	}

}
