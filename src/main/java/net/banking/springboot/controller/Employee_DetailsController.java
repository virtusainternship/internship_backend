package net.banking.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.banking.springboot.exception.ResourceNotFoundException;
import net.banking.springboot.model.Employee_Details;
import net.banking.springboot.repository.Employee_DetailsRepository;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees_details")
public class Employee_DetailsController {

    @Autowired
    private Employee_DetailsRepository employee_DetailsRepository;

    @GetMapping
    public List<Employee_Details> getAllEmployees(){
        return employee_DetailsRepository.findAll();
    }

    // build create employee REST API
    @PostMapping
    public Employee_Details createEmployee(@RequestBody Employee_Details employee) {
    	System.out.println("ctrl into createEployee" + employee.toString());
    	Employee_Details emp = new Employee_Details();
    	try {
    		emp = employee_DetailsRepository.save(employee);
    	} catch (Exception e) {
    		System.out.println("Exception in saving to db" + e);
    	}
    	return emp;
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee_Details> getEmployeeById(@PathVariable  long id){
        Employee_Details employee_Details = employee_DetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(employee_Details);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee_Details> updateEmployee(@PathVariable long id,@RequestBody Employee_Details employeeDetails) {
        Employee_Details updateEmployee = employee_DetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
        System.out.println("inside put method " + id);
        System.out.println("inside put method " + employeeDetails.getGapInformation() + " XPer - " + employeeDetails.getXPercentage()
        +	" course : " + employeeDetails.getCourse());
        updateEmployee.setGapInformation(employeeDetails.getGapInformation());
        updateEmployee.setXPercentage(employeeDetails.getXPercentage());
        updateEmployee.setCourse(employeeDetails.getCourse());
        updateEmployee.setProgram(employeeDetails.getProgram());
        updateEmployee.setCollegeNameandAddress(employeeDetails.getCollegeNameandAddress());
        updateEmployee.setUniversityNameandAddress(employeeDetails.getUniversityNameandAddress());
        updateEmployee.setPercentage(employeeDetails.getPercentage());
        updateEmployee.setXCourse(employeeDetails.getXCourse());
        updateEmployee.setXProgram(employeeDetails.getXProgram());
        updateEmployee.setXCollegeNameandAddress(employeeDetails.getXCollegeNameandAddress());

        employee_DetailsRepository.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){

        Employee_Details employee = employee_DetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        employee_DetailsRepository.delete(employee);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
