package university;

public class University {

	private int univ_id;
	private String univ_name;

	public int getuniv_id() {
		return univ_id;
	}

	public void setuniv_id(int univ_id) {
		this.univ_id = univ_id;
	}

	public String getuniv_name() {
		return univ_name;
	}

	public void setuniv_name(String name) {
		this.univ_name = name;
	}

	@Override
	public String toString() {
		return "Univ_id [Univ_id=" + univ_id + ", Univ_name=" + univ_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((univ_name == null) ? 0 : univ_name.hashCode());
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
		University other = (University) obj;
		if (univ_name == null) {
			if (other.univ_name != null)
				return false;
		} else if (!univ_name.equals(other.univ_name))
			return false;
		if (univ_id != other.univ_id)
			return false;
		return true;
	}

}
