package com.princeli.pattern.decorator.passport.upgrade;

import com.princeli.pattern.decorator.passport.old.ISigninService;
import com.princeli.pattern.decorator.passport.old.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className ISigninForThirdService
 * @date 2019-09-10 21:36
 * @description: TODO
 */
public interface ISigninForThirdService extends ISigninService {

    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForSina(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone,String code);

    public ResultMsg loginForRegister(String username,String password);

}
