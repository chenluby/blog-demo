package blog.demo.controller;

import blog.demo.entity.BlogDemo;
import blog.demo.service.BlogDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试的控制器
 *
 * @author Mr.chen on 2020/3/20. 17:12
 */
@RestController
public class BlogDemoController {
    @Resource
    private BlogDemoService blogDemoService;

    /**
     * 查询所有数据
     *
     * @return json结果集
     */
    @GetMapping("getList")
    public List<BlogDemo> getList() {
        return blogDemoService.selectByAll();
    }
}
