package com.zcf;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf
 * @version:1.0
 */
public class SingletonLazy {
    private SingletonLazy(){}

    private static SingletonLazy instance;

    public static SingletonLazy getInstance(){
        if(instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }

}
