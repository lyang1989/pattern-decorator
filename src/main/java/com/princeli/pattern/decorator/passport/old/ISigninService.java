package com.princeli.pattern.decorator.passport.old;

/**
 * @author : princeli
 * @version 1.0
 * @className ISigninService
 * @date 2019-09-20 20:17
 * @description: TODO
 */
public interface ISigninService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
     ResultMsg register(String username, String password);

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
     ResultMsg login(String username,String password);

}
