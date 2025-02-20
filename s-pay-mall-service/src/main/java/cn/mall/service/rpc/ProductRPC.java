package cn.mall.service.rpc;

import cn.mall.domain.vo.ProductVO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/20 上午11:26
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
@Service
public class ProductRPC {
    public ProductVO queryProductByProductId(String productId) {
        ProductVO productVO = new ProductVO();
        productVO.setProductId(productId);
        productVO.setProductName("ceshi");
        productVO.setProductDesc("ceshi");
        productVO.setPrice(new BigDecimal("100.00"));

        return productVO;
    }
}
