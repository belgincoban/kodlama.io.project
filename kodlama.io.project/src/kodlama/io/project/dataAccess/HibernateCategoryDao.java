package kodlama.io.project.dataAccess;

import kodlama.io.project.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	public void add(Category category) {
		System.out.println(category.getName()+" Hibernate ile veritabanına eklendi.");
	}
}
