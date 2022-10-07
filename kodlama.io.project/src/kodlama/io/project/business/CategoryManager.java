package kodlama.io.project.business;

import kodlama.io.project.core.logging.Logger;
import kodlama.io.project.dataAccess.CategoryDao;
import kodlama.io.project.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {

		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}
	
	public void add(Category newCategory) throws Exception {
		Category[] categories = 
		{
				new Category(1,"Programlama"),
				new Category(2,"Siber Güvenlik"),
				new Category(3,"Tester")
		};
		
		for (Category category : categories) {
			
			if (newCategory.getName().equalsIgnoreCase(category.getName())) {
				
				throw new Exception("Aynı isimde kategori eklenemez!");
			}
			
		}
		
		categoryDao.add(newCategory);
		
		for (Logger logger : loggers) {
			
			logger.log(newCategory.getName());
		}
	}
	
}
