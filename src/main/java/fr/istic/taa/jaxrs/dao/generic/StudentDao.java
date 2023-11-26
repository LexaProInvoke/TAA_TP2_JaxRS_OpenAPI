package fr.istic.taa.jaxrs.dao.generic;


import fr.istic.taa.jaxrs.domain.Student;


public class StudentDao extends AbstractJpaDao<Long, Student> {

    public StudentDao() {
        super(Student.class);
    }
}
