package blog.demo.service;

import blog.demo.entity.BlogDemo;

import java.util.List;

/**
 * @author Mr.chen on 2020/3/20. 17:09
 */
public interface BlogDemoService {
    /**
     * 查询所有
     *
     * @return 结果集
     */
    List<BlogDemo> selectByAll();
}
