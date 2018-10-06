package io.github.battlerhythm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StackTest {
    @Test
    public void testToString() {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        assertEquals(stk.toString(), "[10, 20, 30]");
    }

    @Test
    public void testIsEmpty() {
        Stack<Integer> stk = new Stack<>();
        assertEquals(stk.isEmpty(),true);
        stk.push(10);
        assertEquals(stk.isEmpty(), false);
    }

    @Test
    public void testPush() {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        assertEquals(stk.size(), 2);
    }

    @Test
    public void testPeek() {
        Stack<Integer> stk = new Stack<>();
        try {
            stk.peek();
        } catch (Exception e) {
            assertEquals(e.getClass(), java.lang.IndexOutOfBoundsException.class);
        }
        stk.push(10);
        assertEquals((Integer) stk.peek(), (Integer)10);
    }

    @Test
    public void testPop() {
        Stack<Integer> stk = new Stack<>();
        try {
            stk.pop();
        } catch (Exception e) {
            assertEquals(e.getClass(), java.lang.IndexOutOfBoundsException.class);
        }
        stk.push(10);
        stk.push(20);
        assertEquals((Integer) stk.pop(), (Integer)20);
    }
}