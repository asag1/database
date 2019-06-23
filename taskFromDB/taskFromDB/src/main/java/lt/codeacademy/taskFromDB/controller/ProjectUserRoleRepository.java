package lt.codeacademy.taskFromDB.controller;

import lt.codeacademy.taskFromDB.model.Project_User_Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectUserRoleRepository extends JpaRepository <Project_User_Role, Long> {
}
