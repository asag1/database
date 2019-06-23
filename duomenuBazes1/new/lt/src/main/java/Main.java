import model.Person;
import model.Salary;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Main {
    public static void main(String[] theory) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        Session session = em.unwrap(Session.class);
        em.getTransaction().begin();

        Person person = new Person("Jonas", 32);
        session.save(person);

        Salary salary =  new Salary(1003);
        salary.setId(person.getId());
        person.setSalary(salary);
        session.save(person);
        em.getTransaction().commit();

        Salary foundSalary = session.find(Salary.class, 26L);
        System.out.println(foundSalary.getId()+ " " + foundSalary.getPay());
        em.close();
    }
}
