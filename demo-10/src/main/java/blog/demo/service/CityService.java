package blog.demo.service;

import blog.demo.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.chen on 2020/3/30. 18:27
 */
public interface CityService {
    /**
     * 查询所有数据
     *
     * @return
     */
    List<City> getList();

    /**
     * 添加一个城市
     *
     * @param cName 城市名称
     * @return 自增主键
     */
    int addCity(@Param("cName") String cName);

    /**
     * 一对多查询
     *
     * @return
     */
    List<City> getOneToMany();

    /**
     * 一对多查询,第二种方式，用于分页，不过会有N+1问题，数据量大慎用
     *
     * @return
     */
    List<City> getOneToManyTwo();
}
