package club.banyuan.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/18 15:40
 */
@Controller
public class LoginController {

  @RequestMapping("/user/login")
  public String login(@RequestParam("username") String username,
      @RequestParam("password") String password, Model model, HttpSession session) {
    if (!StringUtils.isEmpty("username") && password.equals("123456")) {
      session.setAttribute("loginUsername",username);
      return "redirect:/main.html";
    }
    model.addAttribute("msg","用户名或密码错误");
    return "index";
  }

}
