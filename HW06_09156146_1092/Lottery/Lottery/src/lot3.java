import java.util.Scanner;

public class lot3 {
	public static int[] Data1 = { 49, 13, 75 };
	public static int[] Data2 = { 28, 52, 12 };

	public static void main(String args[]) {
		System.out.print("Please enter your key value : ");

		Scanner console = new Scanner(System.in);
		int KeyValue = console.nextInt();
		if (Search((int) KeyValue))
			System.out.println("恭喜你 你了中兩百元!!");
		else
			System.out.println("很抱歉 你沒有中獎!!");

	}

	public static boolean Search(int Key) {
		int[] test = (Key % 2 == 0) ? Data2 : Data1;
		for (int i = 0; i < test.length; i++) {
			if (Key == test[i]) {
				return true;
			}
		}
		return false;
	}
}
