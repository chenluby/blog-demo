package blog.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 人的信息
 *
 * @author Mr.chen on 2020/3/30. 18:20
 */
@Data
public class Person implements Serializable {
    /**
     * 自增主键
     */
    private Integer pId;

    /**
     * 自增主键
     */
    private String pName;
    /**
     * 0女1男
     */
    private Integer pSex;
    /**
     * 城市表(city)主键
     */
    private Integer cId;

}
