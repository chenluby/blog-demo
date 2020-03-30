package blog.demo.service.impl;

import blog.demo.entity.Person;
import blog.demo.mapper.PersonMapper;
import blog.demo.service.PersonService;
import blog.demo.vo.PersonManyVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.chen on 2020/3/30. 18:28
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonMapper personMapper;

    /**
     * 多对一查询
     *
     * @return 所有人
     */
    @Override
    public List<PersonManyVO> getManyToOne() {
        return personMapper.getManyToOne();
    }

    /**
     * 多对一
     *
     * @return 所有人
     */
    @Override
    public List<PersonManyVO> getManyToOneTwo() {
        return personMapper.getManyToOneTwo();
    }

    /**
     * if和where的使用
     *
     * @param pName 名字
     * @return 符合名字的人
     */
    @Override
    public List<Person> getIfAndWhere(String pName) {
        return personMapper.getIfAndWhere(pName);
    }

    /**
     * choose和trim的使用
     *
     * @param pSex  性别0女1男
     * @param pName 姓名
     * @return
     */
    @Override
    public List<Person> getChooseAndTrim(Integer pSex, String pName) {
        return personMapper.getChooseAndTrim(pSex, pName);
    }

    /**
     * set的用法
     *
     * @param person 对象
     * @return 影响行数
     */
    @Override
    public int updateSet(Person person) {
        return personMapper.updateSet(person);
    }

    /**
     * foreach的用法
     *
     * @param pIdList 人的id集合
     * @return
     */
    @Override
    public List<Person> getForeach(List<Integer> pIdList) {
        return personMapper.getForeach(pIdList);
    }
}
