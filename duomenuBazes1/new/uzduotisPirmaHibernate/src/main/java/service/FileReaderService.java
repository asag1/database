package service;

import model.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Iterator;
import java.util.List;


public class FileReaderService {


    public void listPerson() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        Session session = em.unwrap(Session.class);
        em.getTransaction().begin();

        List employees = session.createQuery("FROM Person").list();
        for (Iterator iterator = employees.iterator(); iterator.hasNext(); ) {
            Person person = (Person) iterator.next();
            System.out.println("ID " + person.getId());
            System.out.println("Name " + person.getName());
            System.out.println("Age " + person.getAge());
        }
        em.getTransaction().commit();
    }
}
