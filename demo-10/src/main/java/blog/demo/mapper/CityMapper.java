package blog.demo.mapper;

import blog.demo.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 这个mapper开启二级缓存
 *
 * @author Mr.chen on 2020/3/30. 18:25
 */
public interface CityMapper {
    /**
     * 查询所有数据
     *
     * @return
     */
    List<City> getList();

    /**
     * 添加一个城市
     *
     * @param city 城市信息
     * @return 自增主键
     */
    int addCity(@Param("city") City city);

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
