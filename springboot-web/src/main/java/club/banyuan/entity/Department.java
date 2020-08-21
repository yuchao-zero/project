package club.banyuan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/17 20:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

  private Integer id;
  private String departmentName;
}
