package com.zcf.customer;

import com.zcf.chain.PriceHandler;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf.customer
 * @version:1.0
 */
public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }
}
