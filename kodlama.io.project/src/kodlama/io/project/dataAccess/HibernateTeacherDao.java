package kodlama.io.project.dataAccess;

import kodlama.io.project.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	public void add(Teacher teacher) {
		System.out.println(teacher.getFirstName()+" "+teacher.getLastName()+" Hibernate ile veritabanına eklendi");
	}

}
