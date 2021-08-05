package service;

import model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements Employee {


    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<EmployeeModel> getAllEmployees() {
        return employeeRepository.findAll();

    }

    @Override
    public void saveEmployee(EmployeeModel employee) {

        employeeRepository.save(employee);

    }

    @Override
    public EmployeeModel getEmployeeById(long id) {
        Optional<EmployeeModel> optional = employeeRepository.findById(id);
        EmployeeModel employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException("Employee not found for given id" +" " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {

    }
}
