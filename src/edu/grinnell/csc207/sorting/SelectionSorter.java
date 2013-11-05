package edu.grinnell.csc207.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort using selection sort.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class SelectionSorter<T> extends SorterBridge<T> {
   /**
    * Sort vals using selection sort.  See Sorter<T> for more details.
    * 
    * Loop Invariant: Items to the left of vals[i] are sorted. 
    * Items from vals[i] to the right are unsorted.
    * For every j where 0 <= j < i, vals[j] <= vals[j+1]
    * 		    
    * -----------------------------------------
    * |  sorted     |       unsorted        |
    * -----------------------------------------
    * 		    i
    */
   @Override
   public T[] sorti(T[] vals, Comparator<T> order) {
       for (int i = 0; i < vals.length; i++) {
           Utils.swap(vals, i, indexOfSmallest(vals, order, i, vals.length));
       } // for
       return vals;
   } // sorti(T[], Comparator<T>)

   /**
    * Find the index of a smallest element in positions [lb..ub)
    * of values.
    *
    * @param
    *     values, the array into which we are inserting values.
    * @param
    *     order, the comparator used to determine order.
    * @param
    *     lb, the lower bound of the section to search.
    *     ub, the upper bound of the section to search.
    *     
    * @return
    *     is, the index of a smallest value
    *
    * @pre
    *     0 <= lb,ub <= values.length
    * @pre
    *     order can be compared to any pair of values in values.
    * @post
    *     lb <= i < ub
    * @post
    *     For all j, lb <= j < ub, order.compare(values[i], values[j]) <= 0.
    * @post
    *     values is not mutated
    *     
    *     Loop Invariant: For every j where 0 <= j <= i, vals[j] <= vals[lb]
    */
   int indexOfSmallest(T[] vals, Comparator<T> order, int lb, int ub) {
       int i = 0;
       while(i<vals.length){
	   if (order.compare(vals[i], vals[lb]) < 0)
	       lb = i;
       }
       return lb;
   } // indexOfSmallest(T[], Comparator<T>, int, int)

} // SelectionSorter<T>
