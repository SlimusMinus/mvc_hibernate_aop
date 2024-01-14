package m_h_aop.config;

import m_h_aop.dao.EmployeeDAO;
import m_h_aop.entity.Employee;
import m_h_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyConfig {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> showAll = employeeService.getAllEmployee();
        model.addAttribute("peoples", showAll);
        return "showAll";
    }

    @RequestMapping("/saveEmp")
    public String saveEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("newEmp", employee);
        return "addNewEmployee";
    }

    @RequestMapping("/addEmp")
    public String addNewEmployee(@ModelAttribute("newEmp") Employee employee){
        employeeService.saveEmployees(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateInfo(@RequestParam("empId") int id, Model model){
        Employee employee = employeeService.getEmp(id);
        model.addAttribute("newEmp", employee);
        return "addNewEmployee";
    }

    @RequestMapping("deleteEmployees")
    public String deleteEmployees(@RequestParam("empId") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
