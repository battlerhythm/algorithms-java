package io.github.battlerhythm;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> alist;

    public Queue() {
        this.alist = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.alist.toString();
    }

    public int size() {
        return this.alist.size();
    }

    public boolean isEmpty() {
        return (this.alist.size()==0) ? true : false;
    }

    public void enqueue(T item) {
        this.alist.add(item);
    }

    public T dequeue() {
        return this.alist.remove(this.alist.size()-1);
    }
}
