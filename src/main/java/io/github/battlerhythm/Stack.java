package io.github.battlerhythm;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> alist;

    public Stack(){
        this.alist = new ArrayList<T>();
    }

    @Override
    public String toString() {
        return this.alist.toString();
    }

    public boolean isEmpty() {
        return this.alist.size() == 0 ? true : false;
    }

    public int size() {
        return this.alist.size();
    }

    public void push(T item) {
        this.alist.add(item);
    }

    public T peek() {
        return this.alist.get(alist.size()-1);
    }

    public T pop() {
        return alist.remove(alist.size()-1);
    }
}