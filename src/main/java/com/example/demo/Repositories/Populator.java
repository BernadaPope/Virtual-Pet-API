package com.example.demo.populator;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;

public class Populated {

@Component
public class populated implements CommandLineRunner{
    
    @Autowired 
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        final Logger logger = LoggerFactory.getLogger(Populator.class);

        // Create and save sample employees
        Employee employee1 = new Employee("John Doe");
        employeeRepository.save(employee1);

        Employee employee2 = new Employee("Jane Smith");
        employeeRepository.save(employee2);

        logger.info("Saved employee: {}", employee1);
        logger.info("Saved employee: {}", employee2);

    }
}
}
