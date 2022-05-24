package javaclass;

class student
{
	int id;
	String name;
	String course;
	String email;
	int phnno;
	student(int id, String name, String course, String email, int phnno)
	{
		this.id=id;
		this.name = name;
		this.course = course;
		this.email = email;
		this.phnno = phnno;
	}
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + ", phnno=" + phnno
				+ "]";
	}
	
	
}

public class constructordemo {

	public static void main(String[] args) {
		student s1 = new student(1,"yasmin","btech","asdf@gmail.com",987654321);
		System.out.println(s1);
		student s2 = new student(2,"kalam");
		System.out.println(s2);

	}

}
