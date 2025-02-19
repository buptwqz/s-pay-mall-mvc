package cn.mall.domain.req;

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
public class ShopCartReq {
    private String userId;
    private String productId;
}
