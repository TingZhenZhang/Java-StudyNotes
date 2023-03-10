//資一A 09156146 張庭禎
package HW04_09156146_1092;

import java.util.*;
import java.io.*;

public class HW04_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File data = new File("C:/0326IN.TXT");//建檔案名稱
		Scanner inData = new Scanner(data);//接收檔案
		String[][] file = new String[100][2];//建接資料的陣列
		Prize prize;//自建的class
		for (int i = 0; i < file.length; i++) {//將資料傳入class內
			prize = new Prize(inData.next(), i, 0);
			prize = new Prize(inData.next(), i, 1);

			if (inData.hasNext())//判斷是否還有資料
				continue;
			else
				break;
		}
		inData.close();//關檔案

		Scanner input = new Scanner(System.in);//建鍵盤輸入名稱
		String in = input.next();//輸入要查詢的會員編號
		
		if (get(in) == 0) {//用method計算抽中的張數
			System.out.println("沒中獎");
		} else {
			System.out.println("抽中" + get(in) + "張抵用券，共" + get(in) * 50 + "元");
		}
	}

	//計算抽中張數的method
	public static int get(String in) {
		int count = 0;//用count儲存抽中的張數
		String[][] file = Prize.getFile();//接class的資料

		for (int i = 0; i < file.length; i++) {
			if (in.equals(file[i][1]))
				count++;//若抽中，count要加1
			else
				continue;
		}
		
		return count;//回傳抽中的張數
	}
}

//放資料的class
class Prize {
	//data field
	static String[][] file = new String[100][2];
	int row;
	int column;
	//constructors
	Prize() {
	}
	Prize(String inData, int r, int c) {
		file[r][c] = inData;
	}
	//method
	static String[][] getFile() {
		return file;
	}
}