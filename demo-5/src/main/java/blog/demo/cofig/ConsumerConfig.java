package blog.demo.cofig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 消费者
 *
 * @author Mr.chen on 2020/3/24. 13:26
 */
@Component
@Slf4j
public class ConsumerConfig {

    public void topicOne(String message) {
        //拿到信息后实现业务逻辑
        log.info("topicOne消费者信息:{}", message);
    }

    public void topicTwo(String message) {
        //拿到信息后实现业务逻辑
        log.info("topicTwo消费者信息:{}", message);
    }
}
