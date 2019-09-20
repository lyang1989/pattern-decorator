package com.princeli.pattern.decorator;

import com.princeli.pattern.decorator.battercake.v2.BaseBattercake;
import com.princeli.pattern.decorator.battercake.v2.Battercake;
import com.princeli.pattern.decorator.battercake.v2.EggDecorator;
import com.princeli.pattern.decorator.battercake.v2.SausageDecorator;

/**
 * @author : princeli
 * @version 1.0
 * @className BattercakeTest
 * @date 2019-09-18 21:35
 * @description: TODO
 */
public class BattercakeTest {

//    public static void main(String[] args) {
//        Battercake battercake = new Battercake();
//        System.out.println(battercake);
//
//        Battercake battercakeWithEgg =new BattercakeWithEgg();
//        System.out.println(battercakeWithEgg);
//
//        Battercake battercakeWithEggAndSausage =new BattercakeWithEggAndSausage();
//        System.out.println(battercakeWithEggAndSausage);
//
//    }

    public static void main(String[] args) {
        Battercake battercake;

        battercake = new BaseBattercake();

        battercake = new EggDecorator(battercake);

        battercake = new EggDecorator(battercake);

        battercake = new SausageDecorator(battercake);

        System.out.println(battercake);
    }
}
