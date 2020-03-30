package blog.demo.controller;

import blog.demo.entity.City;
import blog.demo.entity.Person;
import blog.demo.service.CityService;
import blog.demo.service.PersonService;
import blog.demo.vo.PersonManyVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.chen on 2020/3/30. 15:58
 */
@RestController
public class TestController {
    @Resource
    private CityService cityService;
    @Resource
    private PersonService personService;

    /**
     * 测试二级缓存
     *
     * @return
     */
    @GetMapping("getList")
    public List<City> getList() {
        return cityService.getList();
    }

    /**
     * 测试获取主键
     *
     * @param cName
     * @return
     */
    @PostMapping("addCity")
    public int addCity(String cName) {
        return cityService.addCity(cName);
    }

    /**
     * 一对多查询
     *
     * @return
     */
    @GetMapping("getOneToMany")
    public List<City> getOneToMany() {
        return cityService.getOneToMany();
    }

    /**
     * 一对多查询第二种方式
     *
     * @return
     */
    @GetMapping("getOneToManyTwo")
    public List<City> getOneToManyTwo() {
        return cityService.getOneToManyTwo();
    }

    /**
     * 多对一查询
     *
     * @return
     */
    @GetMapping("getManyToOne")
    public List<PersonManyVO> getManyToOne() {
        return personService.getManyToOne();
    }

    /**
     * 多对一查询第二种
     *
     * @return
     */
    @GetMapping("getManyToOneTwo")
    public List<PersonManyVO> getManyToOneTwo() {
        return personService.getManyToOneTwo();
    }

    /**
     * if和where的使用
     *
     * @param pName 名字
     * @return 符合名字的人
     */
    @GetMapping("getIfAndWhere")
    public List<Person> getIfAndWhere(String pName) {
        return personService.getIfAndWhere(pName);
    }

    /**
     * choose和trim的使用
     *
     * @param pSex  性别0女1男
     * @param pName 姓名
     * @return
     */
    @GetMapping("getChooseAndTrim")
    public List<Person> getChooseAndTrim(Integer pSex, String pName) {
        return personService.getChooseAndTrim(pSex, pName);
    }

    /**
     * set的用法
     *
     * @param person 对象
     * @return 影响行数
     */
    @PutMapping("updateSet")
    public int updateSet(Person person) {
        return personService.updateSet(person);
    }

    /**
     * foreach的用法
     *
     * @param pIdList 人的id集合
     * @return
     */
    @GetMapping("getForeach")
    public List<Person> getForeach(Integer[] pIdList) {
        List<Integer> pIdLists = new ArrayList<>();
        for (Integer integer : pIdList) {
            pIdLists.add(integer);
        }
        return personService.getForeach(pIdLists);
    }

}
