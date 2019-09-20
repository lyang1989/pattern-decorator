package com.princeli.pattern.decorator.passport.upgrade;

import com.princeli.pattern.decorator.passport.old.ISigninService;
import com.princeli.pattern.decorator.passport.old.ResultMsg;

/**
 * @author : princeli
 * @version 1.0
 * @className SiginForThirdService
 * @date 2019-09-20 20:25
 * @description: TODO
 */
public class SiginForThirdService implements ISigninForThirdService {


    private ISigninService signinService;

    public SiginForThirdService(ISigninService signinService) {
        this.signinService = signinService;
    }

    @Override
    public ResultMsg loginForQQ(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForSina(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegister(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg register(String username, String password) {
        return signinService.register(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return signinService.login(username,password);
    }
}
