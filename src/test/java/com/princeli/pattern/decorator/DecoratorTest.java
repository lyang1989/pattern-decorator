package com.princeli.pattern.decorator;

import com.princeli.pattern.decorator.passport.old.SigninService;
import com.princeli.pattern.decorator.passport.upgrade.ISigninForThirdService;
import com.princeli.pattern.decorator.passport.upgrade.SiginForThirdService;

/**
 * @author : princeli
 * @version 1.0
 * @className DecoratorTest
 * @date 2019-09-20 20:28
 * @description: TODO
 */
public class DecoratorTest {
    public static void main(String[] args) {
        ISigninForThirdService signinForThirdService = new SiginForThirdService(new SigninService());
        signinForThirdService.loginForQQ("123123123");
    }
}
