package marks;

import coursesOffered.CoursesOffered;

public class Marks {

	private int course_id;
	private int s_id;
	private int marks_1;
	private int marks_2;

	public int gets_id() {
		return s_id;
	}

	public void sets_id(int s_id) {
		this.s_id = s_id;
	}

	public int getcourse_id() {
		return course_id;
	}

	public void setcourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getmarks_1() {
		return marks_1;
	}

	public void setmarks_1(int marks_1) {
		this.marks_1 = marks_1;
	}

	public int getmarks_2() {
		return marks_2;
	}

	public void setmarks_2(int marks_2) {
		this.marks_2 = marks_2;
	}

	@Override
	public String toString() {
		return "marks [s_id=" + s_id + ", course_id=" + course_id + ", marks1=" + marks_1 + ",  marks_2=" + marks_2
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + s_id;
		result = prime * result + course_id;
		result = prime * result + marks_1;
		result = prime * result + marks_2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marks other = (Marks) obj;
		if (s_id != other.s_id)
			return false;

		if (course_id != other.course_id)
			return false;
		if (marks_1 != other.marks_1)
			return false;
		if (marks_2 != other.marks_2)
			return false;

		return true;
	}
}
