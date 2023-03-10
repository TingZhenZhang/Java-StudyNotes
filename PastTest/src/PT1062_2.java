import java.util.*;
public class PT1062_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		StringBuilder fix = new StringBuilder(input.nextLine());
		for(int i = 0; i<fix.length(); i++) {
			if(fix.charAt(i)=='e') {
				for(int j = i+1; j<fix.length(); j++) {
					if(fix.charAt(j)=='e') {
						break;
					}else if(fix.charAt(j)=='t') {
						fix.delete(i, j+1);
						i--;
						break;
					}
				}
			}
		}
		System.out.println(fix.toString());
	}

}
