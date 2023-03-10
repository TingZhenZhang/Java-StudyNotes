import java.util.*;
public class PT1021_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		int k = input.nextInt();
		System.out.printf("%.2f", sFunction(x, k));
		

	}
	public static double sFunction(double x, int k) {
		double sum = 0;
		for(int i = 1; i<=2*k; i++) {
			if(i%2==1) {
				sum += x/i;
			}else {
				sum += i/x;
			}
		}
		return sum;
	}

}
