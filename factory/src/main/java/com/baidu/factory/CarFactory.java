package com.baidu.factory;

/**
 * @Auther:zcf
 * @Date:2019/12/11
 * @Descirption:com.baidu.factory
 * @version:1.0
 */
public class CarFactory {


    public CarInterface getCar(String type){
        if("BMW".equals(type)){
            return new BMWCar();
        }
        if("Audi".equals(type)){
            return new AudiCar();
        }
        return null;

    }

    /**根据类名生产对象
     * @param:
     * @return:
     * @autuer:
     * @date:
     */

    public CarInterface getCarByType(String className){

        try{
            CarInterface car = (CarInterface)Class.forName(className).newInstance();
            return car;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;



    }



}
