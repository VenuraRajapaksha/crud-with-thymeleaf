package service;

import model.EmployeeModel;

import java.util.List;

public interface Employee {
    List<EmployeeModel> getAllEmployees();

    void saveEmployee(EmployeeModel employee);

    EmployeeModel getEmployeeById(long id);

    void deleteEmployeeById(long id);

}
