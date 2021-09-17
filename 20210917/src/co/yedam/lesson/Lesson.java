package co.yedam.lesson;

public class Lesson {
	private Teacher teacher;
	private String group; // 3-1
	private Student[] students;

	public Lesson() {
		students = new Student[3];
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void addStudent(Student student) {
		for (int i = 0; 1 < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}
	
	public Teacher getTeacher() {
		return this.teacher;
	}
	
	public String getGroup() {
		return this.group;
	}
	
	public void showStudents() {
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				System.out.println("이름: " + students[i].getStudentName()
									+ "연락처: " + students[i].getStudentPhone()
									+ "주소: " + students[i].getStudentAddress());
			}
		}
	}
	
}
