package cn.mall.domain.res;

import lombok.Data;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/9 上午10:52
 * GitHub: https://github.com/buptwqz
 **/
@Data
public class WeixinQrCodeRes {
    private String ticket;
    private Long expire_seconds;
    private String url;
}
