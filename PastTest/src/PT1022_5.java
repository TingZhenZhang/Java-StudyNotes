import java.util.*;
import java.io.*;

public class PT1022_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File data = new File("C:/5IN.TXT");
		Scanner input = new Scanner(data);
		ArrayList<String> date = new ArrayList<>();
		ArrayList<Integer> eachMaxScore = new ArrayList<>();
		int count = 0;
		while (input.hasNext()) {
			date.add(input.next());
			int times = input.nextInt();
			eachMaxScore.add(0);
			for (int i = 0; i < times; i++) {
				int in = input.nextInt();
				if (in > eachMaxScore.get(count)) {
					eachMaxScore.set(count, in);
				}
			}
			count++;
		}
		input.close();

		int highestScore = 0;
		String earliestDate = "999/12/31";
		for (int i = 0; i < date.size(); i++) {
			if (eachMaxScore.get(i) > highestScore) {
				highestScore = eachMaxScore.get(i);
				earliestDate = date.get(i);
			} else if (eachMaxScore.get(i) == highestScore) {
				if (Integer.parseInt(date.get(i).substring(4, 6) + date.get(i).substring(7, 9)) < Integer
						.parseInt(earliestDate.substring(4, 6) + earliestDate.substring(7, 9))) {
					earliestDate = date.get(i);
				}
			}
		}
		System.out.println("最高紀錄：" + highestScore);
		System.out.println("日期：" + earliestDate);
	}

}
