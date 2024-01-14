package m_h_aop.service;

import m_h_aop.dao.EmployeeDAO;
import m_h_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;
    @Override
    public List<Employee> getAllEmployee() {
        return employeeDAO.getAllEmployee();
    }

    @Override
    public void saveEmployees(Employee employee) {
        employeeDAO.saveEmp(employee);
    }

    @Override
    public Employee getEmp(int id) {
        return employeeDAO.getEmp(id);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
