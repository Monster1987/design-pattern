package com.zcf;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf
 * @version:1.0
 */
public class SingletonHungry {
    //将构造方法私有化，不允许外部直接通过new创建对象
    private SingletonHungry(){}

    //创建类的唯一实例
    private static SingletonHungry instance=new SingletonHungry();

    //提供一个用于获取实例的方法
    public static SingletonHungry getInstance(){
        return instance;
    }

}
