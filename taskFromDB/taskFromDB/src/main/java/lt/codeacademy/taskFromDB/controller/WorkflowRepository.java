package lt.codeacademy.taskFromDB.controller;

import lt.codeacademy.taskFromDB.model.Workflow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkflowRepository extends JpaRepository <Workflow, Long> {
}
