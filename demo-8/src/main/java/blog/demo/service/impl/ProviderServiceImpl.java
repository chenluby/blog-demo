package blog.demo.service.impl;

import blog.demo.service.ProviderService;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Mr.chen on 2020/3/28. 23:15
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 发送消息
     *
     * @param msg 消息内容
     * @return true成功，false失败
     */
    @Override
    public boolean convertAndSend(String msg) {
        try {
            rocketMQTemplate.convertAndSend("ConvertAndSend", msg);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 发送消息
     *
     * @param msg 消息内容
     * @return true成功，false失败
     */
    @Override
    public SendResult syncSend(String msg) {
        SendResult sendResult = rocketMQTemplate.syncSend("SyncSend", msg);
        return sendResult;
    }

    /**
     * 发送即时消息
     *
     * @return
     */
    @Override
    public boolean sendOneWay(String msg) {
        try {
            rocketMQTemplate.sendOneWay("SendOneWay", msg);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 发送顺序消息
     *
     * @param msg 消息内容
     * @return
     */
    @Override
    public SendResult syncSendOrderly(String msg) {
        return rocketMQTemplate.syncSendOrderly("SyncSendOrderly", msg, "code-inn.gitee.io");
    }

    /**
     * 发送异步消息
     *
     * @param msg 消息内容
     * @return true成功，false失败
     */
    @Override
    public boolean asyncSend(String msg) {
        try {
            rocketMQTemplate.asyncSend("AsyncSend", MessageBuilder.withPayload(msg).build(), new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
                }

                @Override
                public void onException(Throwable e) {

                }
            });
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
