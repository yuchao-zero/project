package club.banyuan.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/12 23:17
 */
public class GeneratorDisplay {

  public void generator() throws Exception {

    List<String> warnings = new ArrayList<String>();
    boolean overwrite = true;
    //指定逆向工程配置文件
    File configFile = new File("generator.xml");
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = cp.parseConfiguration(configFile);
    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
        callback, warnings);
    myBatisGenerator.generate(null);

  }

  public static void main(String[] args) throws Exception {
    try {
      GeneratorDisplay generatorSqlmap = new GeneratorDisplay();
      generatorSqlmap.generator();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
