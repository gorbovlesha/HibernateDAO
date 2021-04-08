package DAO;

import company.Employee;
import org.hibernate.Session;
import util.HibernateSessionFactory;

import java.util.List;

public class EmployeeDAOImpl implements DAO{
    public void add(Employee employee) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();

    }

    public void update(Employee employee) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
        session.close();

    }

    public void delete(Employee employee) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();
        session.close();

    }

    public List<Employee> findAll() {
        List<Employee> employees = (List<Employee>) HibernateSessionFactory
                .getSessionFactory()
                .openSession()
                .createQuery("from Employee").list();
        return employees;
    }

    public Employee findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(Employee.class, id);
    }
}
