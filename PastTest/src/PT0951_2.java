import java.util.*;
public class PT0951_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.next();
		while(s.contains("(")) {
			int left = s.indexOf("(");
			int right = s.indexOf(")");
			if(s.substring(left+1, right).contains("(")) {
				left = s.indexOf("(", left+1);
			}
			s = s.substring(0, left)+s.substring(right+1);
		}
		System.out.print(s);

	}

}
