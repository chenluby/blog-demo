package blog.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * 城市表
 *
 * @author Mr.chen on 2020/3/30. 16:02
 */
@Data
public class City implements Serializable {
    /**
     * 自增主键
     */
    private Integer cId;
    /**
     * 城市名称
     */
    private String cName;

    private Set<Person> person;
}
