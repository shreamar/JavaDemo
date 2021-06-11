class CourseManagement{
	public static void main(String args[]){
		int studentId = 1;
		char studentType = 'F';

		Student student = new Student();
		student.setStudentId(studentId);
		student.setStudentType(studentType);

		System.out.println("StudentId: "+student.getStudentId());
		System.out.println("StudentType: "+student.getStudentType());
	}
}