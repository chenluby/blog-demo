package blog.demo.cofig;

import blog.demo.constant.RedisConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * 消息处理
 *
 * @author Mr.chen on 2020/3/24. 13:23
 */
@Configuration
public class RedisListenerConfig {
    @Autowired
    private ConsumerConfig consumerConfig;

    /**
     * redis消息监听器容器
     *
     * @param connectionFactory
     * @return
     */
    @Bean
    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory) throws IllegalAccessException {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        //添加多个topic使用addMessageListener
        container.addMessageListener(topicOne(), new PatternTopic(RedisConstant.TOPIC_ONE));
        //  container.addMessageListener(topicTwo(), new PatternTopic(RedisConstant.TOPIC_TWO));
        return container;
    }

    @Bean
    MessageListenerAdapter topicOne() {
        //传入ConsumerConfig一个消息接受的处理器，利用反射的方法调用“topicOne”
        return new MessageListenerAdapter(consumerConfig, "topicOne");
    }

    @Bean
    MessageListenerAdapter topicTwo() {
        // 传入ConsumerConfig一个消息接受的处理器，利用反射的方法调用“topicTwo”
        return new MessageListenerAdapter(consumerConfig, "topicTwo");
    }
}
