//資一A 09156146 張庭禎
package HW03_09156146_1092;

import java.util.*;

public class HW03_0911_09156146_1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);// 建input
		System.out.print("Enter a, b, c, d, e, f: ");// 指定使用者輸入
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		LinearEquation l = new LinearEquation(a, b, c, d, e, f);// 將輸入值傳給class

		if (l.isSolvable()) {// 判斷是否有解
			System.out.println("x is " + l.getX() + " and y is " + l.getY());
		} else {
			System.out.println("The equation has no solution");
		}

	}

}

class LinearEquation {
	// data fields
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// constructor
	LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF) {
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}

	// getter methods
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// methods
	boolean isSolvable() {
		return (a * d - b * c) != 0;
	}

	double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}