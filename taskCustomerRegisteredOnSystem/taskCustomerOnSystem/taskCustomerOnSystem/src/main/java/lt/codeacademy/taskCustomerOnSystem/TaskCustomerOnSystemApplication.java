package lt.codeacademy.taskCustomerOnSystem;

import lt.codeacademy.taskCustomerOnSystem.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TaskCustomerOnSystemApplication {

    @Autowired
    private static DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(TaskCustomerOnSystemApplication.class, args);
//        demoService.init();
    }

}
