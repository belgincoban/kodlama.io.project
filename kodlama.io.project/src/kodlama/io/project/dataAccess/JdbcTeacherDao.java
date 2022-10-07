package kodlama.io.project.dataAccess;

import kodlama.io.project.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{
	
	public void add(Teacher teacher) {
		System.out.println(teacher.getFirstName()+" "+teacher.getLastName()+" Jsbc ile veritabanına eklendi");
	}

}
