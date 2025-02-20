package cn.mall.test.service;

import cn.mall.domain.req.ShopCartReq;
import cn.mall.domain.res.PayOrderRes;
import cn.mall.service.IOrderService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/20 下午12:21
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Resource
    private IOrderService orderService;

    @Test
    public void test() throws Exception {
        ShopCartReq shopCartReq = new ShopCartReq();
        shopCartReq.setUserId("1");
        shopCartReq.setProductId("1");
        PayOrderRes payOrderRes = orderService.createOrder(shopCartReq);
        log.info("测试结果:{}", JSON.toJSONString(payOrderRes));

    }
}
