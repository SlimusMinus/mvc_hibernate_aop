package m_h_aop.service;

import m_h_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public void saveEmployees(Employee employee);
    public Employee getEmp(int id);
    public void deleteEmployee(int id);
}
