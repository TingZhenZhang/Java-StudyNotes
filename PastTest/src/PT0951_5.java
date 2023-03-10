import java.util.*;

public class PT0951_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int week = input.nextInt();
		int days = (12 - month + 1) * 30;
		for (int i = month; i < 12; i++) {
			switch (i) {
			case 1, 3, 5, 7, 8, 10, 12:
				days++;
				break;
			case 2:
				days -= 2;
				break;
			}
		}
		int myWeek = (7 - ((days - week) % 7)) % 7;
		String space = "";
		for (int i = 1; i <= myWeek; i++) {
			space += "   ";
		}

		System.out.println("  S  M  T  W  T  F  S");
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.print(space);
			for (int i = 1; i <= 31; i++) {
				System.out.printf("%3d", i);
				if ((i + myWeek) % 7 == 0)
					System.out.println();
			}
			break;
		case 4, 6, 9, 11:
			System.out.print(space);
			for (int i = 1; i <= 30; i++) {
				System.out.printf("%3d", i);
				if ((i + myWeek) % 7 == 0)
					System.out.println();
			}
			break;
		case 2:
			System.out.print(space);
			for (int i = 1; i <= 28; i++) {
				System.out.printf("%3d", i);
				if ((i + myWeek) % 7 == 0)
					System.out.println();
			}
			break;
		}

	}

}
