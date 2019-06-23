package lt.codeacademy.taskCustomerOnSystem.controller;

import lt.codeacademy.taskCustomerOnSystem.model.CustomerSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerSummaryRepository extends JpaRepository<CustomerSummary, Long> {

//    Collection<List> getCustomerSummary();
}
