package blog.demo.service.impl;

import blog.demo.entity.City;
import blog.demo.mapper.CityMapper;
import blog.demo.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.chen on 2020/3/30. 18:27
 */
@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;


    /**
     * 查询所有数据
     *
     * @return
     */
    @Override
    public List<City> getList() {
        return cityMapper.getList();
    }

    /**
     * 添加一个城市
     *
     * @param cName 城市名称
     * @return 自增主键
     */
    @Override
    public int addCity(String cName) {
        City city = new City();
        city.setCName(cName);
        cityMapper.addCity(city);
        //添加成功后自动将获取返回的主键给cId
        return city.getCId();
    }

    /**
     * 一对多查询
     *
     * @return
     */
    @Override
    public List<City> getOneToMany() {
        return cityMapper.getOneToMany();
    }

    /**
     * 一对多查询,第二种方式，用于分页，不过会有N+1问题，数据量大慎用
     *
     * @return
     */
    @Override
    public List<City> getOneToManyTwo() {
        return cityMapper.getOneToManyTwo();
    }

}
