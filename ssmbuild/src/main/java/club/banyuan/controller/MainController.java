package club.banyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/14 15:04
 */
@Controller
public class MainController {

  @RequestMapping("/")
  public String toMain(){
    return "index";
  }
}
