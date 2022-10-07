package kodlama.io.project.dataAccess;

import kodlama.io.project.entities.Course;

public class HibernateCourseDao implements CourseDao {

	public void add(Course course) {
		System.out.println(course.getName() + " Hibarnate ile veritabanına eklendi");
	}

}
