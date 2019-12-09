package com.zcf.chain;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf.chain
 * @version:1.0
 */
public abstract class PriceHandler {
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    public abstract void processDiscount(float discount);
}
