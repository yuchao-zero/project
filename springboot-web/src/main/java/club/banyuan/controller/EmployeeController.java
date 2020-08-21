package club.banyuan.controller;

import club.banyuan.dao.EmployeeDao;
import club.banyuan.entity.Employee;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/18 18:25
 */
@Controller
public class EmployeeController {

  @Autowired
  private EmployeeDao employeeDao;

  @RequestMapping("/empList")
  public String userList(Model model){
    Collection<Employee> employees = employeeDao.getAll();
    return "/emp/list";
  }
}
