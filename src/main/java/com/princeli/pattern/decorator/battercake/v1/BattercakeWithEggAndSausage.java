package com.princeli.pattern.decorator.battercake.v1;

/**
 * @author : princeli
 * @version 1.0
 * @className BattercakeWithEggAndSausage
 * @date 2019-09-18 21:33
 * @description: TODO
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg{
    @Override
    protected String getMsg() {
        return super.getMsg()+"+1根香肠";
    }

    @Override
    protected int price() {
        return super.price()+2;
    }
}
