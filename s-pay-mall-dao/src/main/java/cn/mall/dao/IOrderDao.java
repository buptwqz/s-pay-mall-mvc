package cn.mall.dao;

import cn.mall.domain.po.PayOrder;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/19 下午9:06
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
@Mapper
public interface IOrderDao {
    void insert(PayOrder payOrder);

    void updateOrderPayInfo(PayOrder payOrder);

    void changeOrderPaySuccess(PayOrder order);

    List<String> queryNoPayNotifyOrder();

    List<String> queryTimeoutCloseOrderList();

    boolean changeOrderClose(String orderId);

    PayOrder queryUnpayOrder(PayOrder payOrderReq);

}
