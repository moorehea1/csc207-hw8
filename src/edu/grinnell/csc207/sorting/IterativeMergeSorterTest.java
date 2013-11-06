package edu.grinnell.csc207.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Some simple tests of our Merge sort routine.
 */
public class IterativeMergeSorterTest {
    @Test
    public void test1() {
	TestUtils.test1(new IterativeMergeSorter<Integer>());
    } // test1

    @Test
    public void test2() {
	TestUtils.test2(new IterativeMergeSorter<Integer>());
    } // test2

} // MergeSorterTest
