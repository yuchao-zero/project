package club.banyuan.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/17 20:40
 */
@Data
@NoArgsConstructor
public class Employee {

  private Integer id;
  private String name;
  private String email;
  //0表示女 1表示男
  private Integer gender;
  private Department department;
  private Date birth;

  public Employee(Integer id, String name, String email, Integer gender,
      Department department) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.gender = gender;
    this.department = department;
    this.birth = new Date();
  }
}
