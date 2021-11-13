package week3.day1;

public class Students {

	public void getStudentsInfo(int id) {

		System.out.println("Student ID is " + id);

	}

	public void getStudentsInfo(int id, String name) {

		System.out.println("Student ID is " + id);
		System.out.println("Student name is " + name);

	}

	public void getStudentsInfo(String email, long phone) {

		System.out.println("Student ID is " + email);
		System.out.println("Student name is " + phone);

	}

	public static void main(String[] args) {
		
		Students stu = new Students();
		stu.getStudentsInfo(548421);
		stu.getStudentsInfo(258963, "Sathya");
		stu.getStudentsInfo("Sathya@gmail.com", 1234567890);

	}

}
