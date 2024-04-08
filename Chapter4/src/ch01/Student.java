package ch01;

public class Student implements Cloneable {
	
	private int studentNum;
	private String studentName;
	
	
	public void setStudentName(String name) {
		
		this.studentName = name;
	}
	@Override
	public int hashCode() {
		
		
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNum==std.studentNum) {
				return true;
			}
			return false;//주소는 다르지만 논리적으로는 같다
		}	
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	
	public String toString() {
		return studentNum + " ,"+ studentName;
	}
	

}
