package edu.grinnell.csc207.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Some simple tests of our Selection sort routine.
 */
public class SelectionSorterTest {
    @Test
    public void test1() {
	TestUtils.test1(new SelectionSorter<Integer>());
    } // test1

    @Test
    public void test2() {
	TestUtils.test2(new SelectionSorter<Integer>());
    } // test2

} // SelectionSorterTest
