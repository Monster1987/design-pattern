package com.zcf;

import org.junit.Test;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf
 * @version:1.0
 */
public class Demo {

    @Test
    public void f1(){
        SingletonHungry s1=SingletonHungry.getInstance();
        SingletonHungry s2=SingletonHungry.getInstance();
        System.out.println(s1==s2);
    }

    @Test
    public void f2(){
        SingletonLazy s1=SingletonLazy.getInstance();
        SingletonLazy s2=SingletonLazy.getInstance();
        System.out.println(s1==s2);

    }

}
