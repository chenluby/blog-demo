package blog.demo.mapper;

import blog.demo.entity.Person;
import blog.demo.vo.PersonManyVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.chen on 2020/3/30. 18:25
 */
public interface PersonMapper {
    /**
     * 多对一
     *
     * @return 所有人
     */
    List<PersonManyVO> getManyToOne();


    /**
     * 多对一
     *
     * @return 所有人
     */
    List<PersonManyVO> getManyToOneTwo();

    /**
     * if和where的使用
     *
     * @param pName 名字
     * @return 符合名字的人
     */
    List<Person> getIfAndWhere(@Param("pName") String pName);

    /**
     * choose和trim的使用
     *
     * @param pSex  性别0女1男
     * @param pName 姓名
     * @return
     */
    List<Person> getChooseAndTrim(@Param("pSex") Integer pSex, @Param("pName") String pName);

    /**
     * set的用法
     *
     * @param person 对象
     * @return 影响行数
     */
    int updateSet(@Param("person") Person person);

    /**
     * foreach的用法
     *
     * @param pIdList 人的id集合
     * @return
     */
    List<Person> getForeach(@Param("pIdList") List<Integer> pIdList);
}
