package blog.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author chenluby
 * @since 2020-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("blog_demo")
public class BlogDemo extends Model<BlogDemo> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "bd_id", type = IdType.AUTO)
    private Integer bdId;

    /**
     * 名称
     */
    @TableField("bd_name")
    private String bdName;

    /**
     * 添加时间
     */
    @TableField(value = "bd_add_time", fill = FieldFill.INSERT)
    private Date bdAddTime;

    /**
     * 更新时间
     */
    @TableField(value = "bd_update_time", fill = FieldFill.UPDATE)
    private Date bdUpdateTime;

    /**
     * 逻辑删除1 表示删除，0 表示未删除
     */
    @TableField("bd_logic_delete")
    @TableLogic
    private Integer bdLogicDelete;


    @Override
    protected Serializable pkVal() {
        return this.bdId;
    }

}
