package com.baidu.iterator;

/**
 * @Auther:zcf
 * @Date:2019/12/10
 * @Descirption:com.baidu.iterator
 * @version:1.0
 */
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
