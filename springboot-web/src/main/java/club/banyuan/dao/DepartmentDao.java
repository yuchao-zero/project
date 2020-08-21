package club.banyuan.dao;

import club.banyuan.entity.Department;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDao {

//  模拟数据库
  private static Map<Integer, Department> departmentMap = null;
  static {
    departmentMap = new HashMap<Integer,Department>();
    departmentMap.put(9527,new Department(9527,"保卫部"));
    departmentMap.put(9528,new Department(9528,"开发部"));
    departmentMap.put(9529,new Department(9529,"市场部"));
    departmentMap.put(9526,new Department(9526,"商务部"));
    departmentMap.put(9525,new Department(9525,"产品部"));
  }

//  CURD操作

  /**
   * 查询所有
   * @return
   */
  public Collection<Department> getDepartments(){
    return departmentMap.values();
  }

  /**
   * 通过ID获取部门信息
   * @param id
   * @return
   */
  public Department getDepartmentById(Integer id){
    return departmentMap.get(id);
  }




}
