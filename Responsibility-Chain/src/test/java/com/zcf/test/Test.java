package com.zcf.test;

import com.zcf.chain.PriceHandler;
import com.zcf.chain.PriceHandlerFactory;
import com.zcf.customer.Customer;

import java.util.Random;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf.test
 * @version:1.0
 */
public class Test {
    @org.junit.Test
    public void f1(){
        Customer customer=new Customer();
        customer.setPriceHandler(PriceHandlerFactory.creatPriceHandler());
        Random random=new Random();
        for(int i=0;i<100;i++){
            System.out.print(i+":");
            customer.requestDiscount(random.nextFloat());
        }

    }
}
