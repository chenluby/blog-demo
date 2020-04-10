package blog.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.chen on 2020/4/11. 0:31
 */
@RestController
public class TestController {
    @GetMapping("getLogs")
    public Object getLogs() {
        //制造被除数为0的异常。
        int count = 1 / 0;
        return "Logstash测试";
    }
}
