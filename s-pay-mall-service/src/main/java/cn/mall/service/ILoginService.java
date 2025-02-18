package cn.mall.service;

import java.io.IOException;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/9 下午1:45
 * GitHub: https://github.com/buptwqz
 **/
public interface ILoginService {
    String createQrCodeTicket() throws IOException;

    String checkLogin(String ticket);

    void saveLoginState(String ticket, String openId);
}
