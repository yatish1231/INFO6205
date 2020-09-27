# Assignment 2 - Insertion Sort

## Observation
1. 

## Unit Tests
#### 1. InsertionSortTest
      ![Insertion sort](/reports/assignment_2/images/insertionSortTest.png)
#### 2. TimerTest
      ![Timer Test](/reports/assignment_2/images/timerTest.png)

## Outputs
'''Java
2020-09-26 21:29:57 INFO  Benchmark_Timer - Size of array: 10
2020-09-26 21:29:57 INFO  Benchmark_Timer - Array before sort -- [4812, 2272, 725, 3416, 4258, 659, 1427, 1601, 2036, 1597]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Timer - Supplier data - [4812, 2272, 725, 3416, 4258, 659, 1427, 1601, 2036, 1597]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Array after sort -- [659, 725, 1427, 1597, 1601, 2036, 2272, 3416, 4258, 4812]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Fully random array -- Average time to sort -- 0.038419999999999996 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Array before sort -- [4812, 2272, 725, 3416, 4258, 659, 1427, 1601, 2036, 1597]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Timer - Supplier data - [4812, 2272, 725, 3416, 4258, 659, 1427, 1601, 2036, 1597]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Array after sort -- [659, 725, 1427, 1597, 1601, 2036, 2272, 3416, 4258, 4812]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Partially random array -- Average time to sort -- 0.0218 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Array before sort -- [4812, 4258, 3416, 2272, 2036, 1601, 1597, 1427, 725, 659]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Timer - Supplier data - [4812, 4258, 3416, 2272, 2036, 1601, 1597, 1427, 725, 659]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Array after sort -- [659, 725, 1427, 1597, 1601, 2036, 2272, 3416, 4258, 4812]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Reverse sorted random array -- Average time to sort -- 0.02333 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Array before sort -- [659, 725, 1427, 1597, 1601, 2036, 2272, 3416, 4258, 4812]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Timer - Supplier data - [659, 725, 1427, 1597, 1601, 2036, 2272, 3416, 4258, 4812]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Array after sort -- [659, 725, 1427, 1597, 1601, 2036, 2272, 3416, 4258, 4812]
2020-09-26 21:29:57 INFO  Benchmark_Timer - Sorted random array -- Average time to sort -- 0.0337 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - ---------------------------------------------------------------------------
2020-09-26 21:29:57 INFO  Benchmark_Timer - Size of array: 100
2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Fully random array -- Average time to sort -- 0.08359 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Partially random array -- Average time to sort -- 0.07379 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Reverse sorted random array -- Average time to sort -- 0.06654 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Sorted random array -- Average time to sort -- 0.01464 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - ---------------------------------------------------------------------------
2020-09-26 21:29:57 INFO  Benchmark_Timer - Size of array: 1000
2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Fully random array -- Average time to sort -- 0.78993 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Partially random array -- Average time to sort -- 0.28907 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Reverse sorted random array -- Average time to sort -- 0.7785599999999999 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Sorted random array -- Average time to sort -- 0.01543 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - ---------------------------------------------------------------------------
2020-09-26 21:29:57 INFO  Benchmark_Timer - Size of array: 10000
2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Fully random array -- Average time to sort -- 12.63787 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:57 INFO  Benchmark_Timer - Partially random array -- Average time to sort -- 9.14735 milliseconds

2020-09-26 21:29:57 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:57 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:58 INFO  Benchmark_Timer - Reverse sorted random array -- Average time to sort -- 23.97789 milliseconds

2020-09-26 21:29:58 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:58 INFO  Timer - repeat: with 10 runs
2020-09-26 21:29:58 INFO  Benchmark_Timer - Sorted random array -- Average time to sort -- 0.13502 milliseconds

2020-09-26 21:29:58 INFO  Benchmark_Timer - ---------------------------------------------------------------------------
2020-09-26 21:29:58 INFO  Benchmark_Timer - Size of array: 100000
2020-09-26 21:29:58 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:29:58 INFO  Timer - repeat: with 10 runs
2020-09-26 21:30:13 INFO  Benchmark_Timer - Fully random array -- Average time to sort -- 1592.06936 milliseconds

2020-09-26 21:30:13 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:30:13 INFO  Timer - repeat: with 10 runs
2020-09-26 21:30:25 INFO  Benchmark_Timer - Partially random array -- Average time to sort -- 1150.38686 milliseconds

2020-09-26 21:30:25 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:30:25 INFO  Timer - repeat: with 10 runs
2020-09-26 21:30:58 INFO  Benchmark_Timer - Reverse sorted random array -- Average time to sort -- 3257.31647 milliseconds

2020-09-26 21:30:58 INFO  Benchmark_Timer - Begin run: Timing the Insertion Sort with 10 runs
2020-09-26 21:30:58 INFO  Timer - repeat: with 10 runs
2020-09-26 21:30:58 INFO  Benchmark_Timer - Sorted random array -- Average time to sort -- 1.04295 milliseconds

2020-09-26 21:30:58 INFO  Benchmark_Timer - ---------------------------------------------------------------------------
'''