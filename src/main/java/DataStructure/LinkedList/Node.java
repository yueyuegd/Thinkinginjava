package DataStructure.LinkedList;

/**
 * Created by zhangyue on 2019/5/12.
 * 链表结构中用来表示节点
 */
public class Node {

    //数据域
    private int data;

    //指针域：指向下一个节点
    private Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
