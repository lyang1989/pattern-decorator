package com.princeli.pattern.decorator.battercake.v2;

/**
 * @author : princeli
 * @version 1.0
 * @className BaseBattercake
 * @date 2019-09-18 21:46
 * @description: TODO
 */
public class BaseBattercake extends Battercake{

    @Override
    protected String getMsg(){
        return "煎饼";
    }

    @Override
    protected int getPrice(){
        return 5;
    }


}
