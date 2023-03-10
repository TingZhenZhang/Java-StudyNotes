//import java.text.*;
import java.util.*;
public class CheckPoint13_2_1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Hi h1 = new Hi(4);
		Hi h2 = (Hi)h1.clone();
		System.out.println(h1+"\n"+h2+"\n"+h1.equals(h2));

//		double d = 5.9802;
//		DecimalFormat df = new DecimalFormat("0.0##");
//		System.out.print(df.format(d));
		
//		Calendar c = new GregorianCalendar(2013, 2, 1);
//		Calendar c1 = c;
//		Calendar c2 = (Calendar)c.clone();
//		
//		System.out.println(c+"\n"+c2+"\n"+c.equals(c2));
//		char s = '0';
//		int i = s-48;
//		System.out.println(i);
	}
}
class Hi implements Cloneable{
	private Integer i;
	Hi(int i){
		this.i = i;
	}
	String getI() {
		return i.toString();
	}
	public Object clone() {
		try {
			return super.clone();
		}catch(CloneNotSupportedException ex) {
			return null;
		}
	}
}