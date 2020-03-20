package blog.demo.mapper;

import blog.demo.entity.BlogDemo;

import java.util.List;

/**
 * @author Mr.chen on 2020/3/20. 17:00
 */
public interface BlogDemoMapper {
    /**
     * 查询所有
     *
     * @return 结果集
     */
    List<BlogDemo> selectByAll();
}
