//資一A 09156146 張庭禎
package HW10_09156146_1092;

import java.util.*;

public class HW10_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] s1 = input.next().split("/");//接字串，以"/"分割
		String[] s2 = input.next().split("/");//接字串，以"/"分割
		int[] date1 = new int[3];
		int[] date2 = new int[3];
		for (int i = 0; i < 3; i++) {
			date1[i] = Integer.parseInt(s1[i]);
			date2[i] = Integer.parseInt(s2[i]);
		}//將字串轉為整數
		
		int[] temp = date1;
		if (date1[1] < date2[1]) {
			date1 = date2;
			date2 = temp;
		} else if (date1[1] == date2[1] && date1[2] < date2[2]) {
			date1 = date2;
			date2 = temp;
		}//讓date1比date2大

		int count = ((date1[1] - date2[1]) * 30) + date1[2] - date2[2];//先以每月30天計算
		for (int i = date2[1]; i < date1[1]; i++) {
			switch (i) {
			case 1, 3, 5, 7, 8, 10, 12:
				count++;//這些月份有31天
				break;
			case 2:
				if (isLeapYear(date1[0]))
					count -= 1;//閏年二月29天
				else
					count -= 2;//平年二月28天
				break;
			}
		}

		System.out.println(count + " days");//印出相差天數

	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);//判斷是否為閏年
	}

}
