package club.banyuan.config;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/18 13:48
 */
public class MyLocaleResolver implements LocaleResolver {

  @Override
  public Locale resolveLocale(HttpServletRequest request) {
//    获取请求中的语言参数
    String language = request.getParameter("l");
    Locale locale = Locale.getDefault();//默认地区

    if (!StringUtils.isEmpty(language)){
      String[] split = language.split("_");
      return new Locale(split[0], split[1]);
    }
    return locale;
  }

  @Override
  public void setLocale(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse, Locale locale) {

  }
}
