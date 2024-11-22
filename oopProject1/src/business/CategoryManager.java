package business;

import core.logging.ILoggerDal;
import dataAccess.ICategoryDao;
import entities.Category;

import java.util.HashSet;
import java.util.Set;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private ILoggerDal[] loggers;
    private Set<String> categories;

    public CategoryManager(ICategoryDao categoryDao, ILoggerDal[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = new HashSet<String>();
    }
    public void add(Category category) throws Exception {
        if (categories.contains(category.getName())) {
            throw new Exception("Bu kategori zaten mevcut : " + category.getName());
        }

        categoryDao.add(category);
        categories.add(category.getName());

        for (ILoggerDal logger : loggers) {
            logger.Log(category.getName());
        }
    }
}
