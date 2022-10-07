package kodlama.io.project.dataAccess;

import kodlama.io.project.entities.Course;

public class JdbcCourseDao implements CourseDao {

	public void add(Course course) {
		System.out.println(course.getName() + " Jdbc ile veritabanına eklendi");
	}

}
