package com.zcf.chain;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf.chain
 * @version:1.0
 */
public class Director extends PriceHandler {
    public void processDiscount(float discount) {
        if(discount<=0.6){
            System.out.println(this.getClass().getName()+"批准了折扣:"+discount);
        }else {
            System.out.println(this.getClass().getName()+"拒绝了折扣:"+discount);
        }
    }
}
