import java.util.*;

public class PT0992_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String A = s.substring(0, s.indexOf("#"));
		String B = "[" + A.trim() + "]";
		System.out.println(B);

	}

}
