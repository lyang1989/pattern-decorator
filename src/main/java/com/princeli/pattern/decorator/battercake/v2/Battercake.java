package com.princeli.pattern.decorator.battercake.v2;

/**
 * @author : princeli
 * @version 1.0
 * @className Battercake
 * @date 2019-09-18 21:30
 * @description: TODO
 */
public abstract class Battercake {

    protected abstract String getMsg();

    protected abstract int getPrice();

    @Override
    public String toString() {
        return  getMsg()+"，总价格："+getPrice();
    }
}
