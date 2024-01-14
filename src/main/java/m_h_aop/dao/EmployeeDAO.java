package m_h_aop.dao;

import m_h_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployee();
    public void saveEmp(Employee employee);

    public Employee getEmp(int id);

    public void deleteEmployee(int id);
}
