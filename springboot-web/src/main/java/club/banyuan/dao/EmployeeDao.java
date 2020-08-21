package club.banyuan.dao;

import club.banyuan.entity.Department;
import club.banyuan.entity.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/17 20:56
 */
@Repository
public class EmployeeDao {

  @Autowired
  private DepartmentDao departmentDao;
  //  模拟数据库
  private static Map<Integer, Employee> employeeMap = null;

  static {
    employeeMap = new HashMap<Integer, Employee>();
    employeeMap.put(101,
        new Employee(101, "张三", "123@qq.com", 0, new DepartmentDao().getDepartmentById(9525)));
    employeeMap.put(102,
        new Employee(102, "李四", "123@qq.com", 1, new DepartmentDao().getDepartmentById(9526)));
    employeeMap.put(103,
        new Employee(103, "王五", "123@qq.com", 1, new DepartmentDao().getDepartmentById(9527)));
    employeeMap.put(104,
        new Employee(104, "赵六", "123@qq.com", 0, new DepartmentDao().getDepartmentById(9529)));
    employeeMap.put(105,
        new Employee(105, "枸杞", "123@qq.com", 1, new DepartmentDao().getDepartmentById(9528)));
  }

  //  主键自增
  private static Integer initId = 1006;

  //  增加员工
  public void addEmployee(Employee employee) {
    if (employee.getId() == null) {
      employee.setId(initId);
    }
    employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
    employeeMap.put(employee.getId(),employee);
  }

//  查询全部员工信息
  public Collection<Employee> getAll(){
    return employeeMap.values();
  }

//  通过ID查询员工信息
  public Employee findByID(Integer id){
    return employeeMap.get(id);
  }

//  通过ID删除员工
  public void deleteById(Integer id){
    employeeMap.remove(id);
  }


}
