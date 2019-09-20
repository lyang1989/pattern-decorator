package com.princeli.pattern.decorator.battercake.v2;

/**
 * @author : princeli
 * @version 1.0
 * @className EggDecorator
 * @date 2019-09-18 21:52
 * @description: TODO
 */
public class SausageDecorator extends BattercakeDecotator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
