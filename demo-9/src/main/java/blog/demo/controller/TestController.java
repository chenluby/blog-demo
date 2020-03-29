package blog.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.chen on 2020/3/30. 2:58
 */
@RestController
public class TestController {
    @GetMapping("getDocker")
    public Object getDocker() {
        return "这是Docker运行的";
    }
}
