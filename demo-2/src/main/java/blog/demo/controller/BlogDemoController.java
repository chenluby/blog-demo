package blog.demo.controller;

import blog.demo.entity.BlogDemo;
import blog.demo.service.BlogDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        //null为没有构造条件，即查询全部的，因为3.3.0版本以上会自动配置逻辑删除(实体必须有 @TableLogic注解)，所以只查等于0的数据处理。
        return blogDemoService.getBaseMapper().selectList(null);
    }

    /**
     * 新增数据，测试新增填充
     *
     * @param blogDemo
     */
    @PostMapping("addBlogDemo")
    public void addBlogDemo(BlogDemo blogDemo) {
        blogDemoService.save(blogDemo);
    }

    /**
     * 修改数据，测试修改填充
     *
     * @param blogDemo
     */
    @PutMapping("updateBlogDemo")
    public void updateBlogDemo(BlogDemo blogDemo) {
        blogDemo.setBdId(1).setBdName("小陈童鞋");
        blogDemoService.updateById(blogDemo);
    }
}
