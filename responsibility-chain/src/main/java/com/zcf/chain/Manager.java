package com.zcf.chain;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf.chain
 * @version:1.0
 */
public class Manager extends PriceHandler {
    public void processDiscount(float discount) {
        if(discount<=0.4){
            System.out.println(this.getClass().getName()+"批准了折扣:"+discount);
        }else {
            successor.processDiscount(discount);
        }
    }
}
