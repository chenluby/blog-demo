package blog.demo.service.impl.send;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author Mr.chen on 2020/3/28. 23:16
 */
@Service
@Slf4j
@RocketMQMessageListener(topic = "ConvertAndSend", consumerGroup = "ConvertAndSend")
public class ConvertAndSendImpl implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        log.info("ConvertAndSendImpl:" +message);
    }

}
