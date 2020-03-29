package blog.demo.mapper;

import blog.demo.entity.BlogDemo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author chenluby
 * @since 2020-03-21
 */
public interface BlogDemoMapper extends BaseMapper<BlogDemo> {
    /**
     * 自定义查询分页
     *
     * @param blogDemoPage 分页
     * @return
     */
    IPage<BlogDemo> getPage(Page<BlogDemo> blogDemoPage);
}
