import java.util.*;

public class PT1031_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> guess = new ArrayList<>();
		while (guess.size() < 3) {
			int run = (int) (Math.random() * 13 + 1);
			if (run != 7)
				guess.add(run);
		}

		for (int i = 1; i <= 3; i++) {
			System.out.println("第 " + i + " 關：");
			System.out.println("請選擇(1)比 7 大(2)比 7 小");
			if (input.nextInt() == 2) {
				if (guess.get(i - 1) < 7) {
					if (i == 3) {
						System.out.println("結果是 " + guess.get(i - 1) + " 比 7 小");
						System.out.println("恭喜您獲得獎金50000元!");
					} else {
						System.out.println("結果是 " + guess.get(i - 1) + " 比 7 小");
						System.out.println("恭喜您進入下一關!");
					}
				} else {
					System.out.println("結果是 " + guess.get(i - 1) + " 比 7 大");
					System.out.println("對不起您猜錯了,挑戰失敗!");
					break;
				}
			} else {
				if (guess.get(i - 1) > 7) {
					if (i == 3) {
						System.out.println("結果是 " + guess.get(i - 1) + " 比 7 大");
						System.out.println("恭喜您獲得獎金50000元!");
					} else {
						System.out.println("結果是 " + guess.get(i - 1) + " 比 7 大");
						System.out.println("恭喜您進入下一關!");
					}
				} else {
					System.out.println("結果是 " + guess.get(i - 1) + " 比 7 小");
					System.out.println("對不起您猜錯了,挑戰失敗!");
					break;
				}
			}
		}
		System.out.print("本次猜大小數值為：" + guess.get(0) + " " + guess.get(1) + " " + guess.get(2));

	}

}
