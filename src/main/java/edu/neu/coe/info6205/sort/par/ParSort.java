package edu.neu.coe.info6205.sort.par;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

/**
 * This code has been fleshed out by Ziyao Qiao. Thanks very much.
 * TODO tidy it up a bit.
 */
class ParSort {

    public static int cutoff = 1000;
    public static int maxThread = 16;
    public static void sort(int[] array, int from, int to, ForkJoinPool myPool, int depth) {
//    	System.out.println("Log base 2 of threads " + maxThread + " is "+ Math.log10(maxThread)/Math.log10(2) + " Depth is "+depth);
        if (to - from < cutoff || depth >= Math.log10(maxThread)/Math.log10(2)) Arrays.sort(array, from, to);
        else {
        	depth++;
            CompletableFuture<int[]> parsort1 = parsort(array, from, from + (to - from) / 2, myPool, depth); // TO IMPLEMENT
            CompletableFuture<int[]> parsort2 = parsort(array, from + (to - from) / 2, to, myPool, depth); // TO IMPLEMENT
            CompletableFuture<int[]> parsort = parsort1.thenCombine(parsort2, (xs1, xs2) -> {
                int[] result = new int[xs1.length + xs2.length];
                int i = 0 , j = 0, k =0;
                while(i < xs1.length && j < xs2.length) {
                	if(xs1[i] <= xs2[j]) { 
                		result[k] = xs1[i]; 
                		i++; k++;
                	}
                	else { 
                		result[k] = xs2[j];
                		j++; k++;
                	}
                }
                while(i < xs1.length) {
                	result[k] = xs1[i];
                	i++; k++;
                }
                while(j < xs2.length) {
                	result[k] = xs2[j];
                	j++; k++;
                }
                // TO IMPLEMENT
                return result;
            });

            parsort.whenComplete((result, throwable) -> System.arraycopy(result, 0, array, from, result.length));
//            System.out.println("# threads: "+ myPool.getRunningThreadCount());
            parsort.join();
        }
    }

    private static CompletableFuture<int[]> parsort(int[] array, int from, int to, ForkJoinPool myPool, int depth) {
        return CompletableFuture.supplyAsync(
                () -> {
                    int[] result = new int[to - from];
                    // TO IMPLEMENT
                    System.arraycopy(array, from, result, 0, result.length);
                    sort(result, 0, to - from, myPool, depth);
                    return result;
                }
        , myPool);
    }
}