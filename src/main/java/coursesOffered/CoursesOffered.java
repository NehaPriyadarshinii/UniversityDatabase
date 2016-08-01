package coursesOffered;

import course.Course;

public class CoursesOffered {
	private int course_id;
	private int univ_id;

	public int getcourse_id() {
		return course_id;
	}

	public void setcourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getuniv_id() {
		return univ_id;
	}

	public void setuniv_id(int univ_id) {
		this.univ_id = univ_id;
	}

	@Override
	public String toString() {
		return "Course_id [Course_id=" + course_id + ", Univ_id=" + univ_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + univ_id;
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
		CoursesOffered other = (CoursesOffered) obj;
		if (univ_id != other.univ_id)
			return false;

		if (course_id != other.course_id)
			return false;
		return true;
	}

}
