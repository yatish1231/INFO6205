# Assignment 5 - Parallel Sort

## Parallelly sort partitions in merge sort
In my algorithm, I have implemented the logic to switch to Java system sort at a cutoff value or after reaching log2(t) depth in recursion, where t is the number of threads available in the thread pool for parallel sort.<br>
In my experiment, I've run the algorithm with 50 different cutoff values, starting from 1,000 to 500,000. Where each value is 1000 more than the previous.<br>

From my experiments, I've observed that the performance of merge sort **increases** considerably when parallelly sorting individual partitions. Whereas, the performance gains from change in the cutoff values is minimal.

### Results from Parallel Sort
![graph](images/results.png)
