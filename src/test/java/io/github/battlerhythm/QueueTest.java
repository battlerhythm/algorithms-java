package io.github.battlerhythm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class QueueTest {

    @Test
    public void testToString() {
        Queue<Integer> q = new Queue<>();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        assertEquals(q.toString(), "[10, 20, 30]");
    }

    @Test
    public void testSize() {
        Queue<Integer> q = new Queue<>();
        assertEquals(q.size(), 0);
        q.enqueue(10);
        assertEquals(q.size(), 1);
    }

    @Test
    public void testIsEmpty() {
        Queue<Integer> q = new Queue<>();
        assertEquals(q.isEmpty(), true);
        q.enqueue(10);
        assertEquals(q.isEmpty(), false);
    }

    @Test
    public void testEnqueue() {
        Queue<Integer> q = new Queue<>();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        assertEquals(q.size(), 3);
    }

    @Test
    public void testDequeue() {
        Queue<Integer> q = new Queue<>();
        q.enqueue(10);
        q.dequeue();
        assertEquals(q.isEmpty(), true);
        try {
            q.dequeue();
        } catch (Exception e){
            assertEquals(e, java.lang.IndexOutOfBoundsException.class);
        }
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        assertEquals(q.size(), 1);
    }
}