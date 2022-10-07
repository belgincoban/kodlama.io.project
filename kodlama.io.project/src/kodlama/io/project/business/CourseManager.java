package kodlama.io.project.business;

import kodlama.io.project.core.logging.Logger;
import kodlama.io.project.dataAccess.CourseDao;
import kodlama.io.project.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course newCourse) throws Exception {
		
		Course[] courses = 
		{
				new Course(1,"Java ile Programlama","yetiştirme kampı",4000),
				new Course(1,"Linux-Beyaz yaka","Siber'in yeni geliştirme kampı",1500)
		};
		
		for (Course course : courses) {
			
			if (course.getName().equalsIgnoreCase(newCourse.getName())) {
				
				throw new Exception("Aynı isimde kurs ismi eklenemez!");
			}
		}
		
		if (newCourse.getPrice() < 0) {
			
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
		}
		
		courseDao.add(newCourse);
		
		for (Logger logger : loggers) {
			
			logger.log(newCourse.getName());
		}
	}
	
	
}
