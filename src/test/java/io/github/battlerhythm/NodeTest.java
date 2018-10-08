package io.github.battlerhythm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NodeTest {

    @Test
    public void testGetItem() {
        Node<Integer> n = new Node<>(10);
        assertEquals(n.getItem(), (Integer)10);
    }

    @Test
    public void testSetItem() {
        Node<Integer> n = new Node<>(10);
        assertEquals(n.getItem(), (Integer)10);
        n.setItem(20);
        assertEquals(n.getItem(), (Integer)20);
    }

    @Test
    public void testGetNode() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        assertEquals(n1.getNextNode(), null);
        n1.setNextNode(n2);
        n2.setPrevNode(n1);
        assertEquals(n1.getNextNode(), n2);
    }

    @Test
    public void testSetNode() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        assertEquals(n1.getNextNode(), null);
        n1.setNextNode(n2);
        n2.setPrevNode(n1);
        n2.setNextNode(n3);
        n3.setPrevNode(n2);
        assertEquals(n1.getNextNode().getNextNode(), n3);
    }
}