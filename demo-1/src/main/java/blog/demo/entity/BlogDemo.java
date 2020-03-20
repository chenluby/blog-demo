package blog.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Mr.chen on 2020/3/20. 16:58
 */
@Data
public class BlogDemo {
    /**
     * 自增id
     */
    private Integer bdId;

    /**
     * 名称
     */
    private String bdName;
    /**
     * 添加时间
     */
    private Date bdAddTime;
    /**
     * 更新时间
     */
    private Date bdUpdateTime;
    /**
     * 逻辑删除1 表示删除，0 表示未删除
     */
    private Integer bdLogicDelete;
}