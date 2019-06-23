package controller;

import controller.service.DatabaseService;
import controller.service.FileReaderService;
import lombok.AllArgsConstructor;
import model.Person;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class PersonController {
    private static final String CSV_REGEX = ",";
    private List<Person> model;

    public void readAndSavePersons(String personFileDir) {
        readPesons(personFileDir);
        savePersons();
    }

    private void readPesons(String personFileDir) {
        List<String> personLines = FileReaderService.readFile(personFileDir);
        for (String lines : personLines) {
            String[] splitLines = lines.split(CSV_REGEX);
            model.add(new Person(splitLines[0], Integer.valueOf(splitLines[1])));
        }
    }

    private void savePersons() {
        if (!model.isEmpty()) {
            DatabaseService databaseService = new DatabaseService();
            databaseService.save(model);
            databaseService.closeConnection();
        } else {
            throw new RuntimeException("no model found");
        }
    }
}
