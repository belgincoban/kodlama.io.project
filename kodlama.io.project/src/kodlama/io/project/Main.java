package kodlama.io.project;

import kodlama.io.project.business.CategoryManager;
import kodlama.io.project.business.CourseManager;
import kodlama.io.project.business.TeacherManager;
import kodlama.io.project.core.logging.DatabaseLogger;
import kodlama.io.project.core.logging.FileLogger;
import kodlama.io.project.core.logging.Logger;
import kodlama.io.project.core.logging.MailLogger;
import kodlama.io.project.dataAccess.HibernateCourseDao;
import kodlama.io.project.dataAccess.HibernateTeacherDao;
import kodlama.io.project.dataAccess.JdbcCategoryDao;
import kodlama.io.project.entities.Category;
import kodlama.io.project.entities.Course;
import kodlama.io.project.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {

		Teacher teacher=new Teacher(1,"Engin","Demiroğ");
		Logger[] loggers = {new DatabaseLogger(),new MailLogger(),new FileLogger()};
		
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(),loggers);
		teacherManager.add(teacher);
		
		
		//Category category= new Category(5,"Siber güvenlik");//aynı isimde kabul etmedi.
		Category category= new Category(5,"Veri Analisti");
		CategoryManager categoryManager= new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category);
		
		
		Course course = new Course(4,"C# ile programlama", "Temel seviyeden sektörün zirvelerine",5);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
	}

}
