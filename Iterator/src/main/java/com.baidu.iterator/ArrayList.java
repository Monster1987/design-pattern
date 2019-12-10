package com.baidu.iterator;

/**
 * @Auther:zcf
 * @Date:2019/12/10
 * @Descirption:com.baidu.iterator
 * @version:1.0
 */
public class ArrayList implements Collection{
    Object[] objects=new Object[2];
    int index=0;
    public void add(Object obj){
        if(index==objects.length){
            Object[] newObjects=new Object[objects.length*2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects=newObjects;
        }
        objects[index]=obj;
        index++;

    }

    public int size(){
        return index;
    }
}
