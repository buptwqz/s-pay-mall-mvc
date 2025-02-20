package cn.mall.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/20 上午11:27
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
@Data
public class ProductVO {
    private String productId;
    private String productName;
    private String productDesc;
    private BigDecimal price;
}
