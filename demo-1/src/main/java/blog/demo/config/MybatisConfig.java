package blog.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis扫描配置类
 *
 * @author Mr.chen on 2020/3/21. 0:51
 */
@MapperScan("blog.demo.mapper")
@Configuration
public class MybatisConfig {
}
