package reportHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import exceptions.NonFatalException;
import marks.Marks;
import student.Student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import course.Course;
import coursesOffered.CoursesOffered;
import enrolled.Enrolled;
import university.University;

public class ReportHandler {
	private static final Logger LOG = LoggerFactory.getLogger(ReportHandler.class);

	static {
		LOG.debug("Loading MySQL driver");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			LOG.error("Could not load the driver", e);
		}
	}

	public boolean addUniversity(University university) throws NonFatalException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		boolean status = false;
		if (university == null) {
			throw new NonFatalException("univ passed is null");
		}

		if (university.getuniv_name() == null || university.getuniv_name().isEmpty()) {
			throw new NonFatalException("univ name is null");
		}

		try {
			// Get the connection object
			connection = DriverManager.getConnection("jdbc:mysql://localhost/university?user=root");
			// Prepare the statement
			pstmt = connection.prepareStatement("INSERT INTO univ (univ_id,univ_name) VALUES (?,?)");
			pstmt.setInt(1, university.getuniv_id());
			pstmt.setString(2, university.getuniv_name());

			// execute the operation
			status = pstmt.execute();
		} catch (SQLException e) {
			LOG.error("Exception while inserting univ", e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return status;
	}

	public boolean addCourse(Course course) throws NonFatalException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		boolean status = false;
		if (course == null) {
			throw new NonFatalException("Course passed is null");
		}
		if (course.getcourse_name() == null || course.getcourse_name().isEmpty()) {
			throw new NonFatalException("Trainee name is null");
		}

		try {
			// Get the connection object
			connection = DriverManager.getConnection("jdbc:mysql://localhost/university?user=root");
			// Prepare the statement
			pstmt = connection.prepareStatement("INSERT INTO course (course_id,course_name) VALUES (?,?)");
			pstmt.setInt(1, course.getcourse_id());
			pstmt.setString(2, course.getcourse_name());
			// execute the operation
			status = pstmt.execute();
		} catch (SQLException e) {
			LOG.error("Exception while inserting course", e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return status;
	}

	public boolean addCoursesOffered(CoursesOffered co) throws NonFatalException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		boolean status = false;
		if (co == null) {
			throw new NonFatalException("course passed is null");
		}

		try {
			// Get the connection object
			connection = DriverManager.getConnection("jdbc:mysql://localhost/university?user=root");
			// Prepare the statement
			pstmt = connection.prepareStatement("INSERT INTO coursesoffered (univ_id,course_id) VALUES (?,?)");
			pstmt.setInt(1, co.getuniv_id());
			pstmt.setInt(2, co.getcourse_id());
			// execute the operation
			status = pstmt.execute();
		} catch (SQLException e) {
			LOG.error("Exception while inserting course", e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return status;
	}

	public boolean addStudent(Student student) throws NonFatalException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		boolean status = false;
		if (student == null) {
			throw new NonFatalException("Student passed is null");
		}
		if (student.gets_name() == null || student.gets_name().isEmpty()) {
			throw new NonFatalException("student name is null");
		}

		try {
			// Get the connection object
			connection = DriverManager.getConnection("jdbc:mysql://localhost/university?user=root");
			// Prepare the statement
			pstmt = connection.prepareStatement("INSERT INTO student (s_id,s_name,univ_id) VALUES (?,?,?)");
			pstmt.setInt(1, student.gets_id());
			pstmt.setString(2, student.gets_name());
			pstmt.setInt(3, student.getuniv_id());

			// execute the operation
			status = pstmt.execute();
		} catch (SQLException e) {
			LOG.error("Exception while inserting student", e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return status;
	}

	public boolean addEnrolled(Enrolled enrolled) throws NonFatalException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		boolean status = false;
		if (enrolled == null) {
			throw new NonFatalException("enrolled is null");
		}

		try {
			// Get the connection object
			connection = DriverManager.getConnection("jdbc:mysql://localhost/university?user=root");
			// Prepare the statement
			pstmt = connection.prepareStatement("INSERT INTO enrolled (s_id,course_id) VALUES (?,?)");
			pstmt.setInt(1, enrolled.gets_id());
			pstmt.setInt(2, enrolled.getcourse_id());
			// execute the operation
			status = pstmt.execute();
		} catch (SQLException e) {
			LOG.error("Exception while inserting enrolled", e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return status;
	}

	public boolean addMarks(Marks marks) throws NonFatalException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		boolean status = false;
		if (marks == null) {
			throw new NonFatalException("marks passed is null");
		}

		try {
			// Get the connection object
			connection = DriverManager.getConnection("jdbc:mysql://localhost/university?user=root");
			// Prepare the statement
			pstmt = connection.prepareStatement("INSERT INTO marks (s_id,course_id,marks_1,marks_2) VALUES (?,?,?,?)");
			pstmt.setInt(1, marks.gets_id());
			pstmt.setInt(2, marks.getcourse_id());
			pstmt.setInt(3, marks.getmarks_1());
			pstmt.setInt(4, marks.getmarks_2());
			// execute the operation
			status = pstmt.execute();
		} catch (SQLException e) {
			LOG.error("Exception while inserting marks", e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return status;
	}

	public Marks getMarksReport(int s_id) {
		// Get the connection object
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		// Prepare the statement
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/university?user=root");
			pstmt = connection.prepareStatement("SELECT * FROM marks WHERE marks_1 > ? && marks_2 > ?");
			pstmt.setInt(1, 35);
			pstmt.setInt(2, 35);
			resultSet = pstmt.executeQuery();
			// Iterate the result set
			while (resultSet.next()) {
				LOG.info(resultSet.getInt(1) + " " + resultSet.getInt(2) + " " + resultSet.getInt(3) + " "
						+ resultSet.getInt(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}