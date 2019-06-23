

import model.Person;
import model.Salary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;
import java.util.List;

public class Main {

    public static void main(String[] theory) {
        Configuration cfg = new Configuration()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Salary.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();


        Query query = session.createQuery("from Person");

        List<Person> list = query.list();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }

        session.disconnect();
    }
}
