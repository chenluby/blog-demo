package blog.demo.service.impl.send;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * 顺序消息
 *
 * @author Mr.chen on 2020/3/29. 1:32
 */
@Service
@Slf4j
@RocketMQMessageListener(topic = "SyncSendOrderly", consumerGroup = "SyncSendOrderly")
public class SyncSendOrderlyImpl implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        log.info("SyncSendOrderlyImpl:{}", message);
    }
}
