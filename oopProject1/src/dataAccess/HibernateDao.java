package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateDao implements ICourseDao,ICategoryDao,IInstructorDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate ile veritabanına eklendi : "+course.getName());
    }

    @Override
    public void add(Category category) {
        System.out.println("Kategori Hibernate ile veritabanına eklendi : "+category.getName());
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen Hibernate ile veritabanına eklendi : "+instructor.getName());
    }
}
