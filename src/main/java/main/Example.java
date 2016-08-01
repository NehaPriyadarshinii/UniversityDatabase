package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import course.Course;
import coursesOffered.CoursesOffered;
import enrolled.Enrolled;
import reportHandler.ReportHandler;
import student.Student;
import university.University;
import exceptions.NonFatalException;
import marks.Marks;

public class Example {
	private static final Logger LOG = LoggerFactory.getLogger(Example.class);

	public static void main(String[] args) {
		ReportHandler reportHandler = new ReportHandler();
		try {
			University university = new University();
			university.setuniv_id(1001);
			university.setuniv_name("Harvard");
			reportHandler.addUniversity(university);

			Course course = new Course();
			course.setcourse_id(2001);
			course.setcourse_name("science");
			reportHandler.addCourse(course);

			CoursesOffered co = new CoursesOffered();
			co.setcourse_id(2001);
			co.setuniv_id(1001);
			reportHandler.addCoursesOffered(co);

			Student student = new Student();
			student.sets_id(3001);
			student.sets_name("neha");
			student.setuniv_id(1001);
			reportHandler.addStudent(student);

			Enrolled enrolled = new Enrolled();
			enrolled.setcourse_id(2001);
			enrolled.sets_id(3001);
			reportHandler.addEnrolled(enrolled);

			Marks marks = new Marks();
			marks.setcourse_id(2001);
			marks.sets_id(3001);
			marks.setmarks_1(33);
			marks.setmarks_2(25);
			reportHandler.addMarks(marks);

			reportHandler.getMarksReport(3001);

		} catch (NonFatalException e) {
			LOG.error("Exception caught", e);
		}
	}

}
