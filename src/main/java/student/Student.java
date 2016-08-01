package student;

import university.University;

public class Student {
	private int s_id;
	private int univ_id;
	private String s_name;

	public int gets_id() {
		return s_id;
	}

	public void sets_id(int s_id) {
		this.s_id = s_id;
	}

	public String gets_name() {
		return s_name;
	}

	public void sets_name(String name) {
		this.s_name = name;
	}

	public int getuniv_id() {
		return univ_id;
	}

	public void setuniv_id(int univ_id) {
		this.univ_id = univ_id;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + s_id + ", name=" + s_name + ", university=" + univ_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + s_id;
		result = prime * result + ((s_name == null) ? 0 : s_name.hashCode());
		result = prime * result + univ_id;
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
		Student other = (Student) obj;
		if (s_name == null) {
			if (other.s_name != null)
				return false;
		} else if (!s_name.equals(other.s_name))
			return false;
		if (s_id != other.s_id)
			return false;

		if (univ_id != other.univ_id)
			return false;
		return true;
	}

}
