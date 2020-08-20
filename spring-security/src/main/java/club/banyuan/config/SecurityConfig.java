package club.banyuan.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/12 09:27
 */
// 开启WebSecurity模式
@EnableWebSecurity
//WebSecurityConfigurerAdapter 自定义security策略
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
//    请求授权的规则
//    Authorization:授权，判断用户拥有什么权限，可以访问什么资源。
//    首页所有人可以访问，但是功能页需要权限才能访问
//    充分体现aop横切思想
    http.authorizeRequests().antMatchers("/").permitAll()
        .antMatchers("/level1/**").hasRole("vip1")
        .antMatchers("/level2/**").hasRole("vip2")
        .antMatchers("/level3/**").hasRole("vip3");

//    没有权限，默认开启登录页面
//    跳转自定义页面
    http.formLogin().loginPage("/toLogin");
//    http.formLogin();

    http.csrf().disable();//关闭csrf功能:跨站请求伪造,默认只能通过post方式提交logout请求
//    注销成功后返回首页
    http.logout().logoutSuccessUrl("/");

    http.rememberMe().rememberMeParameter("remember");
  }

  //  AuthenticationManagerBuilder：自定义认证策略
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    明文密码不安全，强制前端传过来的密码进行加密bcrypt，防止反编译
//    Authentication:认证，就是用户登录。
    auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
        .withUser("yu").password(new BCryptPasswordEncoder().encode("123456"))
        .roles("vip1", "vip2", "vip3")
        .and()
        .withUser("customer").password(new BCryptPasswordEncoder().encode("123456"))
        .roles("vip1");
//    auth.jdbcAuthentication().dataSource()可以去数据库进行验证
  }
}
