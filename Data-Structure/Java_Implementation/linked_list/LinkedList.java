/**
 * Created on Sun 24-May-2020
 *
 * @author: aman anand
 * <p>
 * <p>
 * ************************************************************
 * Functions in LinkedList Class:
 * ************************************************************
 * public void add(int data)
 * public void add(int index, int data)
 * public void addFirst(int data)
 * public void addLast(int data)
 * public void  remove(int position)
 * public void removeFirst()
 * public void removeLast()
 * public int getFirst()
 * public int getLast()
 * public boolean contains(int data)
 * public void print()
 * public int size()
 * <p>
 * ************************************************************
 **/

public class LinkedList {
    private LinkedListNode head = null; //Reference Variable of class @LinkedListNode
    private int size = 0;


    /**
     * This function will add the Node as follow :
     * - if head== null  then Call @addFirst(data) method
     * - otherwise Call @addLast(data) method
     *
     * @Param data
     **/
    public void add(int data) {
        if (head == null) {
            addFirst(data);
        } else
            addLast(data);
    }

    /**
     * public void add(int index, int data)
     * <p>
     * This function will add the Node at user given index
     *
     * @Param index
     * @Param data
     * <p>
     * Exception
     * @IndexOutOfBoundsException
     **/
    public void add(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("" + index);
        } else if (index == 0) {
            addFirst(data);
        } else if (size == index) {
            addLast(data);
        } else {
            int count = 1;
            LinkedListNode temp = head;
            while (temp.getNext() != null) {
                if (count == index) {
                    LinkedListNode newNode = new LinkedListNode(data);
                    newNode.setNext(temp.getNext());
                    temp.setNext(newNode);
                    break;
                }
                count++;
                temp = temp.getNext();
            }
            size++;
        }

    }

    /**
     * public void addFirst(int data)
     * This function will add the Node in the begining of the LinkedList
     *
     * @Param data
     **/
    public void addFirst(int data) {
        if (head == null) {
            head = new LinkedListNode(data);
        } else {
            LinkedListNode node = new LinkedListNode(data);
            node.setNext(head);
            head = node;
        }
        ++size;
    }

    /**
     * public void addLast(int data)
     * <p>
     * This function will add the Node in the end of the LinkedList
     *
     * @Param data
     **/

    public void addLast(int data) {
        LinkedListNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new LinkedListNode(data));
        ++size;
    }

    /**
     * public void  remove(int position)
     * <p>
     * This function will remove the Node at user given index
     *
     * @Param position
     **/

    public void remove(int position) {
        if (position < 0 || position == size) {
            throw new IndexOutOfBoundsException("" + position);
        } else if (position == 0) {
            removeFirst();
        } else if (position + 1 == size) {
            removeLast();
        } else {
            int count = 1;
            LinkedListNode temp = head;
            while (temp != null) {
                if (count == position) {
                    temp.setNext(temp.getNext().getNext());
                    break;
                }
                count++;
                temp = temp.getNext();
            }
            --size;
        }
    }

    /**
     * public void removeFirst()
     * This function will remove the Node from the begining of the LinkedList
     **/
    public void removeFirst() {
        head = head.getNext();
        --size;
    }


    /**
     * public void removeFirst()
     * This function will remove the Node from the End of the LinkedList
     **/
    public void removeLast() {
        LinkedListNode temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        --size;
    }

    /**
     * public int getFirst()
     * This function will return first element of the LinkedList
     *
     * @return
     **/
    public int getFirst() {
        return head.getData();
    }


    /**
     * public int getLast()
     * This function will return the last element of the LinkedList
     *
     * @return
     **/
    public int getLast() {
        LinkedListNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp.getData();
    }


    /**
     * public boolean contains(int data)
     * This function will Check if the Data is available in the LinkedList
     *
     * @return
     * @Param data
     **/
    public boolean contains(int data) {
        boolean contains = false;
        LinkedListNode temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                contains = true;
            }
            temp = temp.getNext();
        }
        return contains;
    }

    /**
     * public void print()
     * This function will print the LinkedList on console
     **/
    public void print() {
        LinkedListNode temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.getData() + ",");
            temp = temp.getNext();
        }
        System.out.print("]");
        System.out.println();
    }


    /**
     * public void print()
     * This function will return the size of  LinkedList
     *
     * @return
     **/
    public int size() {
        return size;
    }

}
