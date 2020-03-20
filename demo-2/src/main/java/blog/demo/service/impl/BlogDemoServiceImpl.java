package blog.demo.service.impl;

import blog.demo.entity.BlogDemo;
import blog.demo.mapper.BlogDemoMapper;
import blog.demo.service.BlogDemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenluby
 * @since 2020-03-21
 */
@Service
public class BlogDemoServiceImpl extends ServiceImpl<BlogDemoMapper, BlogDemo> implements BlogDemoService {

}
