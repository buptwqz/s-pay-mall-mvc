package cn.mall.listener;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.C;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/20 下午4:21
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
@Slf4j
@Component
public class OrderPaySuccessListener {
    @Subscribe
    public void handleEvent(String paySuccessMessage) {
        log.info("收到支付消息");
    }
}
