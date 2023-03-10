import java.util.*;
public class TryPage486 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
			System.out.println("1");
		}catch(Exception ex){
			
		}
		System.out.println("2");

	}
	public static void method1() {
		try {
			method2();
			System.out.println("3");
		}catch(Exception ex) {
			
		}
		System.out.println("4");
	}
	public static void method2() {
		Scanner input = new Scanner(System.in);
		try {
			int n = input.nextInt();
			System.out.println("5");
		}catch(Exception ex) {
			
		}
		System.out.println("6");
	}

}
