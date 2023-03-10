import java.util.*;

public class PT1032_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> correspond = new ArrayList<>();
		int hour = input.nextInt();
		while (hour != -1) {
			correspond.add(time(hour));
			@SuppressWarnings("unused")
			int minute = input.nextInt();
			hour = input.nextInt();
		}
		for (int i = 0; i < correspond.size(); i++) {
			System.out.println(correspond.get(i));
		}
	}

	public static String time(int hour) {
		String t = "子丑寅卯辰巳午未申酉戌亥";
		String a = "鼠牛虎兔龍蛇馬羊猴雞狗豬";
		return Character.toString(t.charAt((hour + 1) % 24 / 2))
				+ Character.toString(a.charAt((hour + 1) % 24 / 2));
	}

}
