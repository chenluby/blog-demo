package blog.demo.cofig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 生产者
 *
 * @author Mr.chen on 2020/3/24. 13:25
 */
@Component
@Slf4j
public class ProducerConfig {
    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 向通道发送消息的方法
     *
     * @param channel 通道
     * @param message 消息
     */
    public void sendChannelMessage(String channel, String message) {
        log.info("生产通道：{},生产信息：{}", channel, message);
        redisTemplate.convertAndSend(channel, message);
    }
}
