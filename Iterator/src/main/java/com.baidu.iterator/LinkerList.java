package com.baidu.iterator;

/**
 * @Auther:zcf
 * @Date:2019/12/10
 * @Descirption:com.baidu.iterator
 * @version:1.0
 */
public class LinkerList implements Collection {

    Node head=null;
    Node tail=null;
    int size=0;


    public void add(Object obj){
        Node node=new Node(obj,null);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.setNext(node);
        tail=node;
        size++;



    }

    public int size(){
        return size;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
