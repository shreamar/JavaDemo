public class PassByValue{

	public static void main(String args[]){
		int sId = 25;
		Student student = new Student();
		student.setStudentId(sId);

		PassByValue val = new PassByValue();
		System.out.println(student.getStudentId());
		val.passTheValueMethod(student);
		System.out.println("The sId are " + student.getStudentId());
	}

	public void passTheValueMethod(Student std){
		std.setStudentId(10);
		System.out.println("The sId are " + std.getStudentId());
	}
}