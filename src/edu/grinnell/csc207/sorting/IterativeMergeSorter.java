package edu.grinnell.csc207.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort using iterative merge sort.
 * 
 * @author Samuel A. Rebelsky
 * @author Kyle Moorehead, Tim Youtz, Ann Hu
 * 
 * Citation: The sorti method for IterativeMergeSorter was borrowed from
 * "https://github.com/mdole/csc207-hw8/"
 * 
 */
public class IterativeMergeSorter<T> extends SorterBridge<T> {
    /**
     * Sort vals using iterative merge sort. See the Sorter<T> interface for
     * additional details.
     * 
     * Loop invariant:
     */
    @SuppressWarnings("unchecked")
    @Override
    public T[] sorti(T[] vals, Comparator<T> order) {
	int size = 1;
	while (size < vals.length) {
	    // Merge neighboring subarrays of size size
	    int i = 0;
	    T[] temp;
	    while (i < vals.length) {
		temp = (T[]) new Object[(Math.min((i + size * 2), vals.length) - i)];
		temp = Utils.merge(order, vals, i,
			Math.min(i + size, vals.length), vals,
			Math.min(i + size, vals.length),
			Math.min((i + size * 2), vals.length));
		int j = 0;
		int k = i;
		while (j < temp.length) {
		    vals[k] = temp[j];
		    j++;
		    k++;
		} // while
		i += size * 2;
	    } // while
	      // The merged subarrays are now twice as large
	    size *= 2;
	} // while
	return vals;
    } // sorti(T[], Comparator<T>)
} // IterativeMergeSorter<T>
