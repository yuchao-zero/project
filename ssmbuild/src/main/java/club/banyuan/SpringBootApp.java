package club.banyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author :yu
 * @description : springboot启动类
 * @date :2020/8/12 23:15
 */
@SpringBootApplication
@MapperScan(basePackages = "club.banyuan.mapper")
public class SpringBootApp {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootApp.class);
  }
}
