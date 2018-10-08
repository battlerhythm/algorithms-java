package io.github.battlerhythm;

public class Deque<T> extends Queue {
    public Deque() {
        super();
    }

    public void enqueueLeft(T item) {
        this.alist.add(0, item);
    }

    public T dequeueRight() {
        return (T) this.alist.remove(this.size()-1);
    }
}
