package edu.grinnell.csc207.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Some simple tests of our Insertion sort routine.
 */
public class InsertionSorterTest {
    @Test
    public void test1() {
	TestUtils.test1(new InsertionSorter<Integer>());
    } // test1

    @Test
    public void test2() {
	TestUtils.test2(new InsertionSorter<Integer>());
    } // test2

} // InsertionSorterTest