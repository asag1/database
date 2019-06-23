
import com.github.javafaker.Faker;
import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Random;


public class Main {
    static Session session = createAndOpenSession();

    private static Session createAndOpenSession() {
        Configuration cfg = new Configuration()
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Company.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Branch.class)
                .addAnnotatedClass(Contact.class);

        return cfg.buildSessionFactory().openSession();
    }

    public static void main(String[] theory) throws Exception {

        session.getTransaction().begin();
//        Company company = new Company();
//        company.setName("Aistis");
//        session.save(company);
//        Employee employee = new Employee();
//        employee.setName("Tomas");
//        employee.setPosition("aaa");
//        session.save(employee);

//        deleteEmployeesFromId(2);
//        getCompanyName();
        creatListOfCompaies();
//        session.getTransaction().commit();
//        System.out.println("Company ID " + company.getId());
        session.close();

    }

    private static void deleteEmployeesFromId(int delete) {

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaDelete<Employee> employeeDelete = criteriaBuilder.createCriteriaDelete(Employee.class);
        Root<Employee> root = employeeDelete.from(Employee.class);
        employeeDelete.where(criteriaBuilder.le(root.get("id"), 2));
        session.createQuery(employeeDelete).executeUpdate();
        session.getTransaction().commit();
    }

    private static void getCompanyName() {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Company> query = criteriaBuilder.createQuery(Company.class);
        Root<Company> company = query.from(Company.class);
        query.select(company).where(company.get("address").isNull());
        List<Company> companiesList = session.createQuery(query).getResultList();
        companiesList.forEach(System.out::println);
        session.getTransaction().commit();
    }

    private static void creatListOfCompaies() {

        Company company = new Company();
        Address address = new Address();
        for (int i = 0; i < 10; i++) {
            Faker faker = new Faker(new Random(i));
            company.setName(faker.company().name());
            
            session.save(company);
            session.getTransaction().commit();
        }
    }

}