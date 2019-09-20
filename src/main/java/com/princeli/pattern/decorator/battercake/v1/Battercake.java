package com.princeli.pattern.decorator.battercake.v1;

/**
 * @author : princeli
 * @version 1.0
 * @className Battercake
 * @date 2019-09-18 21:30
 * @description: TODO
 */
public class Battercake {

    protected String getMsg(){
        return "煎饼";
    }

    protected int price(){
        return 5;
    }

    @Override
    public String toString() {
        return  getMsg()+"，总价格："+price();
    }
}
