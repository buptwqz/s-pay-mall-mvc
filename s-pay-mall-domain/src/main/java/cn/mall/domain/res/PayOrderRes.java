package cn.mall.domain.res;

import cn.mall.common.constants.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/19 下午9:12
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayOrderRes {
    private String userId;
    private String orderId;
    private String payUrl;
    private Constants.OrderStatusEnum orderStatusEnum;
}
