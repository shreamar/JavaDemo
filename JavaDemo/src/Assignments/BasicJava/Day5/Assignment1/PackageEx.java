package courseregistration;

class Student{
	protected int studentID;
	protected char studentType;
	protected String studentName;
	public void setStudentID(int id){
		this.studentID = id;
	}
	public void setStudentType(char type){
		this.studentType = type;
	}
	public void setStudentName(String name){
		this.studentName = name;
	}
	public void getDetails(){
		System.out.println("Student ID: "+studentID);
		System.out.println("Student type: "+studentType);
		System.out.println("Student name: "+studentName);
	}
}

class PackageEx{
	public static void main(String args[]){
		Student student = new Student();
		student.setStudentID(1001);
		student.setStudentType('D');
		student.setStudentName("Reiner Braun");
		student.getDetails();
	}
}