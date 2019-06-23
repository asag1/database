package lt.codeacademy.taskFromDB.controller;

import lt.codeacademy.taskFromDB.model.Users_Bugs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBugsRepository extends JpaRepository <Users_Bugs, Long> {
}
