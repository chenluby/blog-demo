package blog.demo.service.impl.send;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * 异步消息
 *
 * @author Mr.chen on 2020/3/29. 1:35
 */
@Service
@Slf4j
@RocketMQMessageListener(topic = "AsyncSend", consumerGroup = "AsyncSend")
public class AsyncSendImpl implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        log.info("AsyncSendImpl: {}", message);
    }
}
