//資一A 09156146 張庭禎
package HW08_09156146_1092;

import java.util.*;
import java.text.*;

public class HW08_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();//用int接輸入的正整數
		String binary = Integer.toString(n, 2);//將數字轉成二進制的String
		int length = binary.length();//長度
		int countONE = 0;
		for (int i = 0; i < length; i++) {
			if (binary.charAt(i) == '1') {
				countONE++;//計算出現1的次數
			}
		}
		DecimalFormat df = new DecimalFormat("0.0##");//數字格式，四捨五入到小數點後三位

		System.out.println("二進位：" + binary);
		System.out.println("總長 " + length + " 個位元，位元 1 有 " + countONE + " 個");
		System.out.println("漢明密度：" + df.format((double) countONE / length));

	}

}
