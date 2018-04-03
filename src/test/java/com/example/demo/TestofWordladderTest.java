package com.example.demo;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;
public class TestofWordladderTest {

    @Test
    public void findpath() {
        Wordladder question1 = new Wordladder("desk", "make");
        Vector<String> correct1 = new Vector<>();
        correct1.add("desk");
        correct1.add("dusk");
        correct1.add("musk");
        correct1.add("mask");
        correct1.add("mase");
        correct1.add("make");
        assertEquals("Wrong Solution!", correct1, question1.findPath());

        Wordladder question2 = new Wordladder("watch", "table");
        Vector<String> correct2 = new Vector<>();
        correct2.add("watch");
        correct2.add("match");
        correct2.add("march");
        correct2.add("marah");
        correct2.add("marae");
        correct2.add("marle");
        correct2.add("carle");
        correct2.add("cable");
        correct2.add("table");
        assertEquals("Wrong Solution!", correct2, question2.findPath());

        Wordladder question3 = new Wordladder("cat", "dog");
        Vector<String> correct3 = new Vector<>();
        correct3.add("cat");
        correct3.add("cot");
        correct3.add("dot");
        correct3.add("dog");
        assertEquals("Wrong Solution!", correct3, question3.findPath());
    }
}