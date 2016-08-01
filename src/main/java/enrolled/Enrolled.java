package enrolled;

import coursesOffered.CoursesOffered;

public class Enrolled {
	private int course_id;
	private int s_id;

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

	@Override
	public String toString() {
		return "student_id [student_id=" + s_id + ", course_id=" + course_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + s_id;
		result = prime * result + course_id;
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
		Enrolled other = (Enrolled) obj;
		if (s_id != other.s_id)
			return false;

		if (course_id != other.course_id)
			return false;
		return true;
	}

}
