package blog.demo.controller;

import blog.demo.aspect.UserAccess;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.chen on 2020/3/23. 17:35
 */
@RestController
public class TestController {
    /**
     * 测试除后置异常所有Aop类型
     *
     * @return
     */
    @GetMapping("getAop")
    @UserAccess(desc = "这是自定义注解")
    public Object getAop() {
        return "测试Aop";
    }

    /**
     * 用于测试后置异常类型Aop
     *
     * @return
     */
    @GetMapping("getAfterThrowing")
    public Object getAfterThrowing() {
        throw new RuntimeException("这是测试异常通知");
    }
}
