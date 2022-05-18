package net.banking.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.banking.springboot.model.Employee_Details;

public interface Employee_DetailsRepository extends JpaRepository<Employee_Details, Long> {
    // all crud database methods
}



