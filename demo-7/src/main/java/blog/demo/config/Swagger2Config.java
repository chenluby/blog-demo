package blog.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 文档配置，仅在local环境生效
 *
 * @author Mr.chen on 2020/3/24. 18:05
 */
@EnableSwagger2
@Configuration
@Profile({"local"})
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .select()
                //控制器包名
                .apis(RequestHandlerSelectors.basePackage("blog.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //详细信息设置
                .title("接口列表 v1.0.0")
                .description("接口文档")
                //官方ui使用前面的，第三方使用后面的
                .termsOfServiceUrl("http://127.0.0.1:8086/blog/swagger-ui.html").termsOfServiceUrl("http://127.0.0.1:8086/blog/doc.html")
                .contact("chenluby.github.io")
                .version("1.0.0")
                .build();
    }
}

