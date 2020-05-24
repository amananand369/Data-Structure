/**
 * Created on Sun 24-May-2020
 *
 * @author: aman anand
 * <p>
 * <p>
 * ************************************************************
 * Functions in LinkedListNode Class:
 * ************************************************************
 * public int getData()
 * public void setData(int data)
 * public LinkedListNode getNext()
 * public void setNext(LinkedListNode next)
 *
 * <p>
 * ************************************************************
 **/

public class LinkedListNode {

    private int data;
    private LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

}
