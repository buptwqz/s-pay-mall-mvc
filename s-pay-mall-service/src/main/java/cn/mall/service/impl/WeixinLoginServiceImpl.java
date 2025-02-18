package cn.mall.service.impl;

import cn.mall.domain.vo.WeixinTemplateMessageVO;
import cn.mall.domain.req.WeixinQrCodeReq;
import cn.mall.domain.res.WeixinQrCodeRes;

import cn.mall.domain.res.WeixinTokenRes;
import cn.mall.service.ILoginService;
import cn.mall.service.weixin.IWeixinApiService;
import com.google.common.cache.Cache;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import retrofit2.Call;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/9 下午1:47
 * GitHub: https://github.com/buptwqz
 **/
@Service
public class WeixinLoginServiceImpl implements ILoginService {

    @Value("${weixin.config.app-id}")
    private String appid;
    @Value("${weixin.config.app-secret}")
    private String appSecret;
    @Value("${weixin.config.template-id}")
    private String template_id;

    @Resource
    private Cache<String, String> weixinAccessToken;

    @Resource
    private Cache<String,String> openidToken;

    @Resource
    private IWeixinApiService weixinApiService;
    @Override
    public String createQrCodeTicket() throws IOException {
        // 1.获取accessToken 本地缓存
        // TODO: 把存储修改为Redis
        String accessToken = weixinAccessToken.getIfPresent(appid);
        if(accessToken == null) {
            Call<WeixinTokenRes> call = weixinApiService.getToken("client_credential", appid, appSecret);
            WeixinTokenRes weixinTokenRes = call.execute().body();
            assert weixinTokenRes != null;
            accessToken = weixinTokenRes.getAccess_token();
            weixinAccessToken.put(appid, accessToken);
        }

        WeixinQrCodeReq weixinQrCodeReq = WeixinQrCodeReq.builder()
                .expire_seconds(2592000)
                .action_name(WeixinQrCodeReq.ActionNameTypeVO.QR_SCENE.getCode())
                .action_info(WeixinQrCodeReq.ActionInfo.builder()
                        .scene(WeixinQrCodeReq.ActionInfo.Scene.builder()
                                .scene_id(100601)
                                .build())
                        .build())
                .build();

        Call<WeixinQrCodeRes> call = weixinApiService.createQrCode(accessToken, weixinQrCodeReq);
        WeixinQrCodeRes weixinQrCodeRes = call.execute().body();
        assert null != weixinQrCodeRes;
        return weixinQrCodeRes.getTicket();

    }

    @Override
    public String checkLogin(String ticket) {
        return openidToken.getIfPresent(ticket);
    }

    @Override
    public void saveLoginState(String ticket, String openId) {
        openidToken.put(ticket, openId);
    }
}
