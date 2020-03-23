package blog.demo.controller;

import blog.demo.util.RedisUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Mr.chen on 2020/3/23. 14:54
 */
@RestController
public class TestController {

    @Resource
    private RedisUtils redisUtils;

    /**
     * 获取指定键的值
     *
     * @param key
     * @return
     */
    @GetMapping("getKey/{key}")
    public Object getKey(@PathVariable String key) {
        String value = redisUtils.get(key);
        return "值为" + value;
    }

    /**
     * 设置键值
     *
     * @param key   键
     * @param value 值
     */
    @GetMapping("setKey/{key}/{value}")
    public void setKey(@PathVariable String key, @PathVariable String value) {
        redisUtils.set(key, value);
    }
}
