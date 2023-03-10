import java.text.*;
import java.util.*;

public class Final_04_original {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the student's score on the first quiz: ");
		int first = input.nextInt();
		System.out.print("Enter the student's score on the second quiz: ");
		int second = input.nextInt();
		System.out.print("Enter the student's score on the third quiz: ");
		int third = input.nextInt();
		System.out.print("Enter the student's score on the midterm: ");
		int mid = input.nextInt();
		System.out.print("Enter the student's score on the final: ");
		int fin = input.nextInt();
		Class c = new Class(first, second, third, mid, fin);
		
		DecimalFormat df = new DecimalFormat("0.##");
		String p = df.format(c.getOverall());
		System.out.println("Overall numeric grade: "+p);
		System.out.println("Letter Grade: " + c.getLetterGrade());

	}

}
class Class{
	private double quizz;
	private int mid;
	private int fin;
	private double overall;
	private char letterGrade;
	
	Class(){
		
	}
	Class(int one,int two, int three, int mid, int fin){
		quizz = ((one/10)+(two/10)+(three/10))*(25/3.0);//原本的算法
		this.mid = mid;
		this.fin = fin;
	}
	
	double getOverall() {
		overallN();
		return overall;
	}
	char getLetterGrade() {
		letter();
		return letterGrade;
	}
	
	void overallN() {
		 overall = quizz + (mid * 0.35) + (fin * 0.4);
	}
	
	void letter() {
		if(overall>=90) {
			letterGrade = 'A';
		}else if(overall>=80) {
			letterGrade = 'B';
		}else if(overall>=70) {
			letterGrade = 'C';
		}else if(overall>=60) {
			letterGrade = 'D';
		}else {
			letterGrade = 'F';
		}
	}
	
}