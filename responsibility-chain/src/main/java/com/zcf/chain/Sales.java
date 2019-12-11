package com.zcf.chain;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf.chain
 * @version:1.0
 */
public class Sales extends PriceHandler {
    public void processDiscount(float discount) {
        if(discount<=0.2){
            System.out.println(this.getClass().getName()+"批准了折扣:"+discount);
        }else {
            successor.processDiscount(discount);
        }
    }
}
