package cn.mall.config;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.eventbus.EventBus;
import org.checkerframework.checker.units.qual.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/9 下午1:39
 * GitHub: https://github.com/buptwqz
 **/
@Configuration
public class GuavaConfig {
    @Bean(name = "weixinAccessToken")
    public Cache<String, String> weixinAccessToken() {
        return CacheBuilder.newBuilder()
                .expireAfterWrite(2, TimeUnit.HOURS)
                .build();
    }

    @Bean(name = "openidToken")
    public Cache<String, String> openidToken() {
        return CacheBuilder.newBuilder()
                .expireAfterWrite(1, TimeUnit.HOURS)
                .build();
    }

//    @Bean
//    public EventBus eventBusListener(OrderPaySuccessListener listener){
//        EventBus eventBus = new EventBus();
//        eventBus.register(listener);
//        return eventBus;
//    }

}
