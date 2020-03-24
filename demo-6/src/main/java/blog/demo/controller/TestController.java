package blog.demo.controller;


import blog.demo.entity.BlogDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Mr.chen on 2020/3/24. 15:56
 */
@RestController
public class TestController {
    @GetMapping("getTest")
    public Object getTest(@Valid BlogDemo blogDemo) {
        //制造一个被除数为0的异常
        int num = 1 / 0;
        return blogDemo;
    }
}
