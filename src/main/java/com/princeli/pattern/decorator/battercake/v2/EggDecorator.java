package com.princeli.pattern.decorator.battercake.v2;

/**
 * @author : princeli
 * @version 1.0
 * @className EggDecorator
 * @date 2019-09-18 21:52
 * @description: TODO
 */
public class EggDecorator extends BattercakeDecotator{
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {
        
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
