package blog.demo.service.impl.send;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author Mr.chen on 2020/3/29. 0:47
 */
@Service
@Slf4j
@RocketMQMessageListener(topic = "SyncSend", consumerGroup = "SyncSend")
public class SyncSendImpl implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        log.info("SyncSendImpl:{}"+ message);
    }
}
