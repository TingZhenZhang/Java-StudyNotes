//資一A 09156146 張庭禎
package HW05_09156146_1092;

import java.util.*;

public class HW05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");//指定使用者輸入
		String s = input.next();//接字串
		String sNum = "";//建一個放解果的字串
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				sNum += s.charAt(i);//若字元為符號，加上該符號的字元
			} else {
				sNum += getNumber(s.toLowerCase().charAt(i));//使用副程式將字元轉成對應的數字
			}
		}
		System.out.println(sNum);//印出結果
	}

	public static int getNumber(char lowChar) {
		int num = 0;
		//找出該字元對應的數字
		if (lowChar == '1') {
			num = 1;
		} else if (lowChar == '2' || lowChar == 'a' || lowChar == 'b' || lowChar == 'c') {
			num = 2;
		} else if (lowChar == '3' || lowChar == 'd' || lowChar == 'e' || lowChar == 'f') {
			num = 3;
		} else if (lowChar == '4' || lowChar == 'g' || lowChar == 'h' || lowChar == 'i') {
			num = 4;
		} else if (lowChar == '5' || lowChar == 'j' || lowChar == 'k' || lowChar == 'l') {
			num = 5;
		} else if (lowChar == '6' || lowChar == 'm' || lowChar == 'n' || lowChar == 'o') {
			num = 6;
		} else if (lowChar == '7' || lowChar == 'p' || lowChar == 'q' || lowChar == 'r' || lowChar == 's') {
			num = 7;
		} else if (lowChar == '8' || lowChar == 't' || lowChar == 'u' || lowChar == 'v') {
			num = 8;
		} else if (lowChar == '9' || lowChar == 'w' || lowChar == 'x' || lowChar == 'y' || lowChar == 'z') {
			num = 9;
		}
		return num;//回傳結果
	}
}
