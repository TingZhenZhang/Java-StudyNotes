
public class PT0971_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 1, c = 1;
		for (int i = 1; i <= 81; i++) {

			System.out.printf("%dx%d=%2d\t", r, c, r * c);
			r++;
			if ((r - 1) % 3 == 0) {
				System.out.print('\n');// putChar('\n');
				r = 1 + 3 * (i / 27);
				c++;
			}
			if (i % 27 == 0) {
				c = 1;
			}
		}

	}

}
