//資一A 09156146 張庭禎
package HW06_09156146_1092;

public class Course {
	//data field
	private String courseName;
	private String[] students = new String[3];
	private int numberOfStudents;
	//constructors
	public Course(String courseName) {
		this.courseName = courseName;
	}
	//method
	public void addStudent(String student) {
		//若修課人數滿了，自動加大陣列長度(開一個新的陣列，長度為原本的兩倍。)
		if(numberOfStudents>=students.length) {
			String[] temp = new String[students.length*2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		//先將學生加入陣列
		students[numberOfStudents] = student;
		numberOfStudents++;//人數+1
		//測試新加入的學生是否先前已經加過了
		for(int i = 0; i<numberOfStudents-1; i++) {
			if(student.equals(students[i])) {
				System.out.println(student + " is already in " + courseName);
				students[numberOfStudents-1] = "";//若有，將新加入的移除
				numberOfStudents--;//人數-1
			}
		}
	}
	
	public String[] getStudents() {
		String[] temp = new String[numberOfStudents];//建長度剛好與學生人數一樣多的臨時陣列
		System.arraycopy(students, 0, temp, 0, numberOfStudents);
		students = temp;//將students陣列換成臨時陣列
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		int test = 0;//放測試不合的次數
		for(int i = 0; i<students.length; i++) {
			if(student.equals(students[i])) {
				students[i] = students[numberOfStudents-1];//將最後面的學生補到移除的學生的位置
				students[numberOfStudents-1] = "";//最後面的學生的位置清空
				numberOfStudents--; //人數-1
			}else {
				test++;//測試不合則+1
			}
		}
		if(test==students.length) {//若每個都測試不合
			System.out.println("Can not find " + student + " in " + courseName);
		}
	}
	
	public void clear() {
		students = new String[3];//指定新的陣列
		numberOfStudents = 0;//將人數歸零
		System.out.println("Remove all students from the " + courseName);
		System.out.println("Number of students in " + courseName + " : " + numberOfStudents);
	}

}
