package com.baidu.factory;

import org.junit.Test;

/**
 * @Auther:zcf
 * @Date:2019/12/11
 * @Descirption:com.baidu.factory
 * @version:1.0
 */
public class Customer {
    @Test
    public void f1(){
        CarInterface factory1=new BMWCar();
        CarInterface factory2=new AudiCar();
        factory1.makeCar();
        factory2.makeCar();
    }

    @Test
    public void f2(){
        CarFactory carFactory=new CarFactory();
        CarInterface factory=carFactory.getCar("BMW");
        factory.makeCar();
    }

    @Test
    public void f3(){
        CarFactory carFactory=new CarFactory();
        CarInterface factory=carFactory.getCarByType("com.baidu.factory.AudiCar");
        factory.makeCar();

    }

    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        CarInterface factory=carFactory.getCarByType("com.baidu.factory.AudiCar");
        factory.makeCar();

    }

}
