package com.princeli.pattern.decorator.passport.old;

/**
 * @author : princeli
 * @version 1.0
 * @className SigninService
 * @date 2019-09-10 21:35
 * @description: TODO
 */
public class SigninService implements ISigninService{

    @Override
    public ResultMsg register(String username, String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    @Override
    public ResultMsg login(String username,String password){
        return new ResultMsg(200,"登陆成功",new Member());
    }
}
