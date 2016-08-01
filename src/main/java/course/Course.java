package course;

import university.University;

public class Course {

	private int course_id;
	private String course_name;

	public int getcourse_id() {
		return course_id;
	}

	public void setcourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getcourse_name() {
		return course_name;
	}

	public void setcourse_name(String name) {
		this.course_name = name;
	}

	@Override
	public String toString() {
		return "Course_id [Course_id=" + course_id + ", Course_name=" + course_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course_name == null) ? 0 : course_name.hashCode());
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
		Course other = (Course) obj;
		if (course_name == null) {
			if (other.course_name != null)
				return false;
		} else if (!course_name.equals(other.course_name))
			return false;
		if (course_id != other.course_id)
			return false;
		return true;
	}

}
