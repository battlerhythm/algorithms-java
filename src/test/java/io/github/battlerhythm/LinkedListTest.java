package io.github.battlerhythm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LinkedListTest {

    @Test
    public void testGetSize() {
        LinkedList<Integer> ll = new LinkedList<>();
        assertEquals(ll.getSize(), 0);
        ll.append(10);
        assertEquals(ll.getSize(), 1);
    }

    @Test
    public void testAppend() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        assertEquals(ll.toString(), "[10, 20, 30]");
    }

    @Test
    public void testPop() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.pop();
        assertEquals(ll.toString(), "[10, 20]");
    }

    @Test
    public void testPop1() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.pop(1);
        assertEquals(ll.toString(), "[10, 30]");
        try {
            ll.pop(2);
        } catch (Exception e) {
            assertEquals(e.getClass(), IndexOutOfBoundsException.class);
        }
    }
}