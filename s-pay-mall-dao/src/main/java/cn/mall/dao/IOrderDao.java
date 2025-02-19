package cn.mall.dao;

import cn.mall.domain.po.PayOrder;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/19 下午9:06
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
public interface IOrderDao {
    void insert(PayOrder order);

    PayOrder queryUnpayOrder(PayOrder payOrderReq);

}
