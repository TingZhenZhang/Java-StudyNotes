import java.util.*;

public class PT1061_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		do {
			int n = input.nextInt();
			sum += n;
			count++;
		} while (sum != 0);
		System.out.println(count);
	}

}
