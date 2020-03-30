package blog.demo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Mr.chen on 2020/3/31. 0:21
 */
@Data
public class PersonManyVO implements Serializable {
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

    private CityManyVO cityManyVO;
}
