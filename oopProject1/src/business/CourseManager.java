package business;

import core.logging.ILoggerDal;
import dataAccess.ICourseDao;
import entities.Course;

import java.util.HashSet;
import java.util.Set;

public class CourseManager {
    private ICourseDao courseDao;
    private ILoggerDal[] loggers;
    private Set<String> courses;

    public CourseManager(ICourseDao courseDao, ILoggerDal[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = new HashSet<String>();
    }

    public void add(Course course) throws Exception {
        if(course.getPrice()<0){
            throw new Exception("Ürün fiyatı 0 dan küçük olamaz");
        }
        if(courses.contains(course.getName())){
            throw new Exception("Bu kurs zaten mevcut : " + course.getName());
        }
        courseDao.add(course);
        courses.add(course.getName());

        for (ILoggerDal logger : loggers){ //[db,mail,file]
            logger.Log(course.getName());
        }
    }
}
