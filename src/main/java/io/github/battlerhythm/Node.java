package io.github.battlerhythm;

public class Node<T> {
    protected T item;
    protected Node<T> nextNode;
    protected Node<T> prevNode;

    public Node(T item) {
        this.setItem(item);
        this.nextNode = null;
        this.prevNode = null;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }
}
