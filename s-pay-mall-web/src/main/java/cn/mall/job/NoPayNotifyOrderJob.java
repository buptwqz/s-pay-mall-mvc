package cn.mall.job;

import cn.mall.service.IOrderService;
import com.alipay.api.AlipayClient;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/20 下午4:28
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
public class NoPayNotifyOrderJob {
    @Resource
    private IOrderService orderService;
    @Resource
    private AlipayClient alipayClient;

    @Scheduled(cron = "0")
    public void exec() {

    }
}
