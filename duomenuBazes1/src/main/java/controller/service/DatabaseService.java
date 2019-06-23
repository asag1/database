package controller.service;

import model.Person;

import java.sql.*;
import java.util.List;

public class DatabaseService {
    Connection connection;
    final String INSERT_PERSON = "insert into  person(name, age) values (?, ?)";

    public DatabaseService() {
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/playground?useSSL=false", "Akvile", "akvile");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(List<Person> persons) {
        for (Person person : persons) {
            save(person);
        }
    }

    public void save(Person person) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PERSON);
            preparedStatement.setString(1, person.getName());
            preparedStatement.setInt(2, person.getAge());
            int executionResult = preparedStatement.executeUpdate();
            if (executionResult == 0) {
                throw new SQLDataException("Could not incert " + person.getName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
        }
    }
}
