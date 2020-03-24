package blog.demo.controller;

import blog.demo.cofig.ProducerConfig;
import blog.demo.constant.RedisConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.chen on 2020/3/24. 14:31
 */
@RestController
public class TestController {
    @Autowired
    private ProducerConfig producerConfig;

    @GetMapping("getMessage")
    public void getMessage() {
        producerConfig.sendChannelMessage(RedisConstant.TOPIC_ONE, "{\"test\":\"测试发布订阅1\"}");
        //RedisListenerConfig未添加addMessageListener监听，所以消费者不会消费TOPIC_TWO
        producerConfig.sendChannelMessage(RedisConstant.TOPIC_TWO, "{\"test\":\"测试发布订阅2\"}");
    }
}
