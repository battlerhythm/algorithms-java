package io.github.battlerhythm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DequeTest {
    @Test
    public void testEnqueueLeft() {
        Deque<Integer> dq = new Deque<>();
        dq.enqueue(10);
        dq.enqueue(20);
        dq.enqueue(30);
        dq.enqueueLeft(40);
        dq.enqueueLeft(50);
        assertEquals(dq.toString(), "[50, 40, 10, 20, 30]");
    }

    @Test
    public void testDequeueRight() {
        Deque<Integer> dq = new Deque<>();
        dq.enqueue(10);
        dq.enqueue(20);
        dq.enqueue(30);
        dq.dequeueRight();
        assertEquals(dq.toString(), "[10, 20]");
    }
}