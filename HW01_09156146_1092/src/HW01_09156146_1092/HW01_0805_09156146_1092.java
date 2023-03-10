//資一A 09156146 張庭禎
package HW01_09156146_1092;

import java.util.*;

public class HW01_0805_09156146_1092 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter matrix1: ");
		double[][] a = new double[2][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextDouble();//依序輸入數值到陣列1
			}
		}
		System.out.print("Enter matrix2: ");
		double[][] b = new double[2][2];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = input.nextDouble();//依序輸入數值到陣列2
			}
		}
		System.out.println("兩個矩陣相加如下：");
		System.out.println(a[0][0] + " " + a[0][1] + "   " + b[0][0] + " " + b[0][1] + "   " + addMatrix(a, b)[0][0]
				+ " " + addMatrix(a, b)[0][1]);//呼叫副程式
		System.out.println(a[1][0] + " " + a[1][1] + " + " + b[1][0] + " " + b[1][1] + " = " + addMatrix(a, b)[1][0]
				+ " " + addMatrix(a, b)[1][1]);//呼叫副程式
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] add = new double[2][2];//副程式的陣列
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add[i].length; j++) {
				add[i][j] = a[i][j] + b[i][j];//逐個相加
			}
		}
		return add;//回傳副程式的陣列
	}

}
