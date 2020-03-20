package blog.demo.service.impl;

import blog.demo.entity.BlogDemo;
import blog.demo.mapper.BlogDemoMapper;
import blog.demo.service.BlogDemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.chen on 2020/3/20. 16:58
 */
@Service
public class BlogDemoServiceImpl implements BlogDemoService {

    @Resource
    private BlogDemoMapper blogDemoMapper;


    /**
     * 查询所有
     *
     * @return 结果集
     */
    @Override
    public List<BlogDemo> selectByAll() {
        return blogDemoMapper.selectByAll();
    }
}
