package blog.demo.service.impl;

import blog.demo.entity.BlogDemo;
import blog.demo.mapper.BlogDemoMapper;
import blog.demo.service.BlogDemoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author chenluby
 * @since 2020-03-21
 */
@Service
public class BlogDemoServiceImpl extends ServiceImpl<BlogDemoMapper, BlogDemo> implements BlogDemoService {

    /**
     * 自定义查询分页
     *
     * @param current 设置当前页
     * @param size    设置每页显示条数
     * @return
     */
    @Override
    public IPage<BlogDemo> getPage(long current, long size) {
        return baseMapper.getPage(new Page<>(current, size));
    }
}
