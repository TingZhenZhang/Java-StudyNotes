//資一A 09156146 張庭禎
package HW06_09156146_1092;

public class TestCourse_09156146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建新的物件
		Course course1 = new Course("Data Structure");
		Course course2 = new Course("Database System");
		//幫學生加退選，下列為樣本一
		course1.addStudent("Peter");
		course1.addStudent("Brian");
		course1.addStudent("Anne");
		course1.addStudent("Jenny");
		course1.addStudent("Chris");
		course1.dropStudent("Brian");
		course1.addStudent("Terry");
		course1.addStudent("Ricky");
		course1.dropStudent("Jenny");
		course1.dropStudent("Cindy");
		course1.addStudent("Ricky");
		
		course2.addStudent("Peter");
		course2.addStudent("Steve");
		course2.addStudent("John");
		course2.addStudent("Ben");
		course2.dropStudent("Peter");
		course2.addStudent("Jack");
		course2.addStudent("Peter");
		course2.dropStudent("Steve");
		course2.dropStudent("Ben");
		course2.addStudent("Peter");
		course2.dropStudent("Pig");
		//呼叫課程的人數以及修課名單
		System.out.println("Number of students in " + course1.getCourseName()+ " : " + course1.getNumberOfStudents());
		String[] students1 = course1.getStudents();
		for(int i = 0; i<students1.length-1; i++) {
			System.out.print(students1[i] + ",");
		}
		System.out.println(students1[students1.length-1]);//最後一位學生後面不加","
		
		System.out.println("Number of students in " + course2.getCourseName() + " : " + course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for(int i = 0; i<students2.length-1; i++) {
			System.out.print(students2[i] + ",");
		}
		System.out.println(students2[students2.length-1]);//最後一位學生後面不加","
		//移除課程的每位學生，且告知已移除以及所剩學生人數
		course1.clear();
		course2.clear();

	}

}
