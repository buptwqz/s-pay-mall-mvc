package cn.mall.controller.dto;

import lombok.Data;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/20 下午4:01
 * GitHub: https://github.com/buptwqz
 * Description:
 **/
@Data
public class CreatePayRequestDTO {

    // 用户ID 【实际产生中会通过登录模块获取，不需要透彻】
    private String userId;
    // 产品编号
    private String productId;

}

