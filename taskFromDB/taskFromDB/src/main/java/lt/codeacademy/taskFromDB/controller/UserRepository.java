package lt.codeacademy.taskFromDB.controller;

import lt.codeacademy.taskFromDB.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
