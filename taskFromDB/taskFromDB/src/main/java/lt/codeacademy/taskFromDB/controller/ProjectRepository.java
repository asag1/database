package lt.codeacademy.taskFromDB.controller;

import lt.codeacademy.taskFromDB.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Long> {
}
