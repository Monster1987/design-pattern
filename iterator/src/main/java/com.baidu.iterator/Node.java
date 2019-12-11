package com.baidu.iterator;

/**
 * @Auther:zcf
 * @Date:2019/12/10
 * @Descirption:com.baidu.iterator
 * @version:1.0
 */
public class Node {

    private Object data;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    private Node next;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
