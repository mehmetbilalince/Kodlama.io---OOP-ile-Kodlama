package business;

import core.logging.ILoggerDal;
import dataAccess.IInstructorDao;
import entities.Instructor;

import java.util.HashSet;
import java.util.Set;

public class InstructorManager {
    private IInstructorDao instructorDao;
    private ILoggerDal[] loggers;
    private Set<String> instructors;

    public InstructorManager(IInstructorDao instructorDao, ILoggerDal[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructors = new HashSet<>();
    }

    public void add(Instructor instructor) throws Exception {
        if (instructors.contains(instructor.getName())) {
            throw new Exception("Bu eğitmen zaten mevcut: " + instructor.getName());
        }

        instructorDao.add(instructor);
        instructors.add(instructor.getName());

        for (ILoggerDal logger : loggers) {
            logger.Log(instructor.getName());
        }
    }
}
