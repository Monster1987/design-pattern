package com.zcf.chain;

/**
 * @Auther:zcf
 * @Date:2019/12/9
 * @Descirption:com.zcf.chain
 * @version:1.0
 */
public class PriceHandlerFactory {
    public static PriceHandler creatPriceHandler() {
        PriceHandler sales=new Sales();
        PriceHandler manager=new Manager();
        PriceHandler director=new Director();
        sales.setSuccessor(manager);
        manager.setSuccessor(director);
        return sales;
    }
}
