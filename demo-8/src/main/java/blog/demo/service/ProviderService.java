package blog.demo.service;

import org.apache.rocketmq.client.producer.SendResult;

/**
 * 生产者业务类
 *
 * @author Mr.chen on 2020/3/28. 23:15
 */
public interface ProviderService {
    /**
     * 发送消息
     *
     * @param msg 消息内容
     * @return true成功，false失败
     */
    boolean convertAndSend(String msg);

    /**
     * 发送消息
     *
     * @param msg 消息内容
     * @return
     */
    SendResult syncSend(String msg);

    /**
     * 发送即时消息
     *
     * @param msg 消息内容
     * @return true成功，false失败
     */
    boolean sendOneWay(String msg);

    /**
     * 发送顺序消息
     *
     * @param msg 消息内容
     * @return
     */
    SendResult syncSendOrderly(String msg);

    /**
     * 发送异步消息
     *
     * @param msg 消息内容
     * @return  true成功，false失败
     */
    boolean asyncSend(String msg);
}
