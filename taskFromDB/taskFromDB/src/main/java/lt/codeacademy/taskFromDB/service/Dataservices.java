package lt.codeacademy.taskFromDB.service;

import lt.codeacademy.taskFromDB.controller.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class Dataservices {

    private final static Logger logger = LoggerFactory.getLogger(Dataservices.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectUserRoleRepository projectUserRoleRepository;

    @Autowired
    private UserBugsRepository userBugsRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WorkflowRepository workflowRepository;

    public void getProject (){
        logger.info("Get projects info");
        Query q = entityManager.createQuery("SELECT prj_id, wf_id FROM Project");

        List<Object[]> list = q.getResultList();

        for (Object value: list) {
            System.out.println("project: " + value);
        }
    }

}
