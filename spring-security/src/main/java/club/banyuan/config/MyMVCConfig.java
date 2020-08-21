package club.banyuan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//实现了视图解析器的类就可以看成视图解析器
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

  @Bean
  public LocaleResolver localeResolver() {
    return new MyLocaleResolver();
  }


}
