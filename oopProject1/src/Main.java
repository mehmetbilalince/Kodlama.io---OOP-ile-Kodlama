import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.ILoggerDal;
import dataAccess.HibernateDao;
import dataAccess.JdbcProductDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
    ILoggerDal[] loggers=new ILoggerDal[]{new DatabaseLogger(),new FileLogger(),new EmailLogger()};

        Instructor instructor1 = new Instructor(1, "Engin Demirog",  "engin@mail.com");
        Instructor instructor2 = new Instructor(2, "Halit Enes Kalaycı", "halitenes@mail.com");

        InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers);
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);

        Course course1 = new Course(1, "(2022) Yazılım Geliştirici Yetiştirme Kampı", "Engin Demiroğ",0);
        Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "Engin Demiroğ",0);

        CourseManager courseManager=new CourseManager(new JdbcProductDao(),loggers);
        courseManager.add(course1);

        Category category1 = new Category(1, "Tümü");
        Category category2 = new Category(2, "Programlama");

        CategoryManager categoryManager=new CategoryManager(new HibernateDao(),loggers);
    }
}