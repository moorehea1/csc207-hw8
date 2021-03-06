package edu.grinnell.csc207.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Some simple tests of our Quicksort routine.
 */
public class QuicksorterTest {
    @Test
    public void test1() {
	TestUtils.test1(new Quicksorter<Integer>());
    } // test1

    @Test
    public void test2() {
	TestUtils.test2(new Quicksorter<Integer>());
    } // test2

} // QuicksorterTest
