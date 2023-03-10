import java.util.*;

public class PT1021_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(f(n));
	}

	//遞迴函數
	public static int f(int n) {
		if (n < 2) {
			return n;
		} else {
			return 3 * f(n - 2) + f(n - 1) + 1;
		}
	}

}
