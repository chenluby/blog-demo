package blog.demo.entity;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author Mr.chen on 2020/3/24. 16:10
 */
@Data
public class BlogDemo {
    /**
     * Integer验证
     */
    @NotNull(message = "number不能为空")
    private Integer number;
    /**
     * 特殊的需要两个注解，一个验证格式化，一个验证非空
     */
    @Email(message = "邮箱不符合格式")
    @NotBlank(message = "邮箱不能为空")
    public String email;

    /**
     * 价格验证
     */
    @NotNull(message = "价格不能为空！")
    @DecimalMin(message = "价格不能小于1", value = "1")
    private BigDecimal price;
}
