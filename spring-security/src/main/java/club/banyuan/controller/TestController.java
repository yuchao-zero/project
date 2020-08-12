package club.banyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/12 00:08
 */
@Controller
public class TestController {

  @RequestMapping({"/","/index"})
  public String index(){
    return "index";
  }

  @RequestMapping("/toLogin")
  public String toLogin(){
    return "views/login";
  }

  @RequestMapping("/level1/{id}")
  public String level1(@PathVariable(value = "id") int id){
    return "views/level1/" + id;
  }

  @RequestMapping("/level2/{id}")
  public String level2(@PathVariable(value = "id") int id){
    return "views/level2/" + id;
  }

  @RequestMapping("/level3/{id}")
  public String level3(@PathVariable(value = "id") int id){
    return "views/level3/" + id;
  }
}
