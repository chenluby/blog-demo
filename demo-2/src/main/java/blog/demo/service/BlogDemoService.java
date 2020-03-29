package blog.demo.service;

import blog.demo.entity.BlogDemo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author chenluby
 * @since 2020-03-21
 */
public interface BlogDemoService extends IService<BlogDemo> {
    /**
     * 自定义查询分页
     *
     * @param current 设置当前页
     * @param size    设置每页显示条数
     * @return
     */
    IPage<BlogDemo> getPage(long current, long size);
}
