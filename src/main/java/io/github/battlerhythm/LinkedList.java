package io.github.battlerhythm;

public class LinkedList<T> {
    protected Node head;
    protected Node tail;
    protected int size;

    public LinkedList() {
        this.setHead(null);
        this.setTail(null);
        this.setSize(0);
    }

    protected Node getHead() {
        return head;
    }

    protected void setHead(Node head) {
        this.head = head;
    }

    protected Node getTail() {
        return tail;
    }

    protected void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    public void append(T item) {
        Node<T> newNode = new Node<>(item);
        if (this.head != null && this.tail != null) {
            Node temp = this.tail;
            newNode.setPrevNode(temp);
            temp.setNextNode(newNode);
            this.tail = newNode;
        } else {
            this.head = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    public T pop() {
        int index = this.size-1;
        Node theNode = getNodeAt(index);
        remove(theNode);
        this.size -= 1;
        return (T) theNode.getItem();
    }

    public T pop(int index) {
        Node theNode = getNodeAt(index);
        remove(theNode);
        this.size -= 1;
        return (T) theNode.getItem();
    }

    protected Node getNodeAt(int index) {
        Node theNode = null;
        if (index >=0 && index < this.size) {
            theNode = this.head;
            for (int i=0; i < index; i++) {
                theNode = theNode.getNextNode();
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
        return theNode;
    }

    protected void remove(Node node) {
        if (node.getNextNode() != null && node.getPrevNode() != null) {
            node.getNextNode().setPrevNode(node.getPrevNode());
            node.getPrevNode().setNextNode(node.getNextNode());
        } else if (node.getNextNode() != null) {
            node.getNextNode().setPrevNode(null);
            this.head = node.getNextNode();
        } else if (node.getPrevNode() != null) {
            node.getPrevNode().setNextNode(null);
            this.tail = node.getPrevNode();
        } else {
            this.head = null;
            this.tail = null;
        }
    }

    @Override
    public String toString() {
        String str = "[";
        if (this.size == 0) {
            str += "]";
            return str;
        }
        Node node = this.head;
        str += node.toString();
        for (int i = 0; i < this.size-1; i++) {
            node = node.getNextNode();
            str = str + ", " + node.toString();
        }
        str += ']';
        return str;
    }
}
