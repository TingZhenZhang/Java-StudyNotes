//資一A 09156146 張庭禎
package HW09_09156146_1092;
import java.util.*;
public class HW09_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five double values: ");
		ArrayList<Double> in = new ArrayList<>();
		in.add(input.nextDouble());
		in.add(input.nextDouble());
		in.add(input.nextDouble());
		in.add(input.nextDouble());
		in.add(input.nextDouble());//將輸入的5個值加到陣列
		
		System.out.println("The sum is " + sum(in));//印出總和

	}
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for(int i = 0; i<list.size(); i++) {
			sum += list.get(i);//將陣列裡的值加到總和
		}
		return sum;//回傳總和
	}

}
