import java.util.*;
public class CheckPoint13_6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = {new ComparablePerson(3), new ComparablePerson(4), new ComparablePerson(1)};
		Arrays.sort(persons);
		System.out.print(persons[0].getId()+"\n"+persons[1].getId()+"\n"+persons[2].getId());
	}
}
class Person{
	private int id;
	
	Person(int id){
		this.id = id;
	}
	
	int getId() {
		return this.id;
	}
}
class ComparablePerson extends Person implements Comparable<ComparablePerson>{
	ComparablePerson(int id){
		super(id);
	}
	
	public int compareTo(ComparablePerson o) {
		if(getId()>o.getId())
			return 1;
		else if(getId()<o.getId())
			return -1;
		else
			return 0;
	}
}