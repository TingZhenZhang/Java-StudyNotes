package PE;
import java.util.GregorianCalendar;
public class E0905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar c = new GregorianCalendar();
		c.setTimeInMillis(1234567898765L);
		System.out.println("Current year: "+c.get(GregorianCalendar.YEAR));
		System.out.println("Current month: "+c.get(GregorianCalendar.MONTH));
		System.out.println("Current day: "+c.get(GregorianCalendar.DAY_OF_MONTH));

	}

}
