//資一A 09156146 張庭禎
package HW07_09156146_1092;

import java.util.*;

public class HW07_Ex1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();//接輸入值
		int temp = in;
		int factor = 2;//最小質因數2
		StackOfIntegers primeFactors = new StackOfIntegers();//建立放質因數的物件
		while (in != 1) {//當值不等於1時，跑迴圈
			if (in % factor == 0) {
				primeFactors.push(factor);//當餘數為0，將質因數加入物件的陣列內
				in /= factor;//將值除以質因數
			} else {
				factor++;//質因數+1
			}
		}
		System.out.println("The factors for " + temp + " is");
		while (!primeFactors.empty()) {//當物件的陣列不是空的時，印出最上面的值
			System.out.print(primeFactors.pop() + " ");
		}

	}

}
