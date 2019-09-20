package com.princeli.pattern.decorator.battercake.v2;

/**
 * @author : princeli
 * @version 1.0
 * @className BattercakeDecotator
 * @date 2019-09-18 21:48
 * @description: TODO
 */
public abstract class BattercakeDecotator extends Battercake{

    private Battercake battercake;

    public BattercakeDecotator(Battercake battercake) {
        this.battercake = battercake;
    }


    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
