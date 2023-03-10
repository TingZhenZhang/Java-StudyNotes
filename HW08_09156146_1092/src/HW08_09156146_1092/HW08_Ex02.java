//資一A 09156146 張庭禎
package HW08_09156146_1092;

import java.util.*;

public class HW08_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		String s2 = input.next();
		String[] t1 = s1.split(":");
		String[] t2 = s2.split(":");
		int[] n1 = new int[3];
		int[] n2 = new int[3];
		for (int i = 0; i < 3; i++) {
			n1[i] = Integer.parseInt(t1[i]);
			n2[i] = Integer.parseInt(t2[i]);
		}//將String轉成int

		int[] temp = n1;
		if (n1[0] < n2[0]) {
			n1 = n2;
			n2 = temp;
		} else if (n1[0] == n2[0] && n1[1] < n2[1]) {
			n1 = n2;
			n2 = temp;
		} else if (n1[0] == n2[0] && n1[1] == n2[1] && n1[2] < n2[2]) {
			n1 = n2;
			n2 = temp;
		}//n1陣列放時間較前的，n2陣列放時間較後的

		int[] ans = new int[3];
		if (n1[2] < n2[2]) {
			n1[1]--;
			ans[2] = n1[2] + 60 - n2[2];
		} else {
			ans[2] = n1[2] - n2[2];
		}//計算"秒"
		if (n1[1] < n2[1]) {
			n1[0]--;
			ans[1] = n1[1] + 60 - n2[1];
		} else {
			ans[1] = n1[1] - n2[1];
		}//計算"分"
		ans[0] = n1[0] - n2[0];//計算"時"

		System.out.printf("%02d:%02d:%02d", ans[0], ans[1], ans[2]);//印出時間格式

	}

}
