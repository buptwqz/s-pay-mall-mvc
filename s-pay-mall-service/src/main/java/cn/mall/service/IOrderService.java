package cn.mall.service;

import cn.mall.domain.po.PayOrder;
import cn.mall.domain.req.ShopCartReq;
import cn.mall.domain.res.PayOrderRes;

import java.util.List;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/19 下午9:12
 * GitHub: https://github.com/buptwqz
 * Description: 订单服务接口
 **/
public interface IOrderService {
    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

    void changeOrderPaySuccess(String orderId);

    List<String> queryNoPayNotifyOrder();

    List<String> queryTimeoutCloseOrderList();

    boolean changeOrderClose(String orderId);

}
