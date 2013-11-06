package edu.grinnell.csc207.sorting;

public class IterativeMergeSorterExp {

    

    /**
     * Run the experiments.
     */
    public static void main(String[] args) {
        Utils.iExperiments(new IterativeMergeSorter<Integer>());
        Utils.sExperiments(new IterativeMergeSorter<String>());
    } // main(String[])
} // class BuiltinSortExpt

