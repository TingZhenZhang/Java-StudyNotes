//資一A 09156146 張庭禎
package HW02_09156146_1092;

public class HW02_0901_09156146_1092 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Rectangle r1 = new Rectangle(4, 40);//將數值傳入建構子
		Rectangle r2 = new Rectangle(3.5, 35.9);//將數值傳入建構子
		//印出各組數值帶入方法後的回傳值
		System.out.println("The area of a rectangle with width "+r1.width+" and height "+r1.height+" is "+r1.getArea());
		System.out.println("The perimeter of a rectangle is "+r1.getPerimeter());
		System.out.println("The area of a rectangle with width "+r2.width+" and height "+r2.height+" is "+r2.getArea());
		System.out.println("The perimeter of a rectangle is "+r2.getPerimeter());

	}

}
class Rectangle{
	//data fields(給預設值)
	double width = 1;
	double height = 1;
	//建構子
	Rectangle(){
	}
	Rectangle(double w, double h){
		width = w;
		height = h;
	}
	//方法
	double getArea(){
		return width*height;
	}
	double getPerimeter(){
		return (width+height)*2;
	}
}