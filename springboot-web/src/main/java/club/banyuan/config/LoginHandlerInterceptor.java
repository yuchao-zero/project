package club.banyuan.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/18 16:23
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    Object loginUsername = request.getSession().getAttribute("loginUsername");
    if (loginUsername == null){
      request.setAttribute("msg","没有权限，请先登录");
      request.getRequestDispatcher("/index.html").forward(request,response);
      return false;
    }
    return true;
  }
}
