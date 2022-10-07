package kodlama.io.project.dataAccess;

import kodlama.io.project.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	public void add(Category category) {
		System.out.println(category.getName()+" Jdbc ile veritabanına eklendi.");
	}

}
