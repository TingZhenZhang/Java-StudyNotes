import java.util.Scanner;

public class lot1 {
	public static int[] Data = { 49, 27, 13, 75, 52 };

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
		for (int i = 0; i < Data.length; i++) {
			if (Key == Data[i]) {
				return true;
			}
		}
		return false;
	}
}
