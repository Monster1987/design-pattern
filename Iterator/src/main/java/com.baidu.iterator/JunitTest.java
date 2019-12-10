package com.baidu.iterator;

import org.junit.Test;

/**
 * @Auther:zcf
 * @Date:2019/12/10
 * @Descirption:com.baidu.iterator
 * @version:1.0
 */
public class JunitTest {
    @Test
    public void f1(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(new String("hello"));
        System.out.println(arrayList.size());
    }

    @Test
    public void f2(){
        LinkerList linkerList=new LinkerList();
        linkerList.add(1);
        linkerList.add(2);
        linkerList.add("a");
        System.out.println(linkerList.size());

        Collection c=new ArrayList();
        c.add(1);
        c.add(22);
        System.out.println(c.size());
        System.out.println("---------");

        ArrayList arrayList= (ArrayList) c;
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.objects[i]);
        }
    }
}
