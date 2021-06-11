public class Student{
	private int studentId;
	private char studentType;

	public Student(){
		this.studentId = 10;
		this.studentType = 'F';
	}

	public void setStudentId(int id){
		studentId = id;
	}

	public void setStudentType(char type){
		studentType = type;
	}

	public int getStudentId(){
		return studentId;
	}

	public char getStudentType(){
		return studentType;
	}
}