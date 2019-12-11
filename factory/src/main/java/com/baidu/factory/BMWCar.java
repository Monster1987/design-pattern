package com.baidu.factory;

/**
 * @Auther:zcf
 * @Date:2019/12/11
 * @Descirption:com.baidu
 * @version:1.0
 */
public class BMWCar implements CarInterface {
    @Override
    public void makeCar() {
        System.out.println("BMW is made");
    }
}
