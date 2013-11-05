package edu.grinnell.csc207.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Sort using Quicksort.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here.
 */
public class Quicksorter<T> extends SorterBridge<T> {
   /**
    * Sort vals using Quicksort.  See the Sorter<T> interface
    * for additional details.
    */
   @Override
   public T[] sorti(T[] vals, Comparator<T> order) {
       qsort(vals, order, 0, vals.length);
       return vals;
   } // sorti(T[], Comparator<T>)

   /**
    * Sort the elements in positions [lb..ub) using Quicksort.
    */
   public void qsort(T[] vals, Comparator<T> order, int lb, int ub) {
       // One element arrays are sorted.
       if (lb >= ub) {
           return;
       } else {
           int mid = partition(vals, order, lb, ub);
           qsort(vals, order, lb, mid-1);
           qsort(vals, order, mid+1, ub);
       } // More than one element
   } // sorti(T[], Comparator<T>, int, int)

   /**
    * Pick a random pivot and reorganize the elements in positions 
    * [lb..ub) of vals such that elements smaller than the pivot appear
    * to the left, elements bigger than the pivot appear to the right
    * of the pivot, and the pivot is in the middle.  
    *
    * @param
    *    values, an array.
    * @param
    *    order, a comparator.
    * @param
    *    lb, an integer.
    * @param
    *    ub, an integer.
    * @return
    *    mid, the index of the pivot.
    *
    * @pre
    *    order can be applied to any pair of elements in vals.
    * @pre
    *    0 <= lb < ub < values.length.
    * @post
    *    lb <= mid < ub
    * @post
    *    values[mid] == pivot, for some value pivot
    * @post
    *    For all i, lb <= i < mid, order.compare(values[i],pivot) <= 0
    *    For all i, mid < i < ub, order.compare(pivot, values[i]) < 0
    *
    * Loop invariant: 
    * ...For each j where lb < pivot < ub, values[pivot] 
    */
   int partition(T[] vals, Comparator<T> order, int lb, int ub) {
       Random pivot = new Random();
       return (pivot.nextInt((ub - 1) - lb) + lb);
   } // partition
} // Quicksorter<T>
