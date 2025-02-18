package cn.mall.domain.res;

import lombok.Data;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/9 上午9:56
 * GitHub: https://github.com/buptwqz
 **/
@Data
public class WeixinTokenRes {
    private String access_token;
    private int expires_in;
    private String errcode;
    private String errmsg;
}
