package com.princeli.pattern.decorator.battercake.v1;

/**
 * @author : princeli
 * @version 1.0
 * @className BattercakeWithEgg
 * @date 2019-09-18 21:31
 * @description: TODO
 */
public class BattercakeWithEgg extends Battercake{

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    protected int price() {
        return super.price()+1;
    }
}
