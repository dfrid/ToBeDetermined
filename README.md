# ToBeDetermined

### Assessment of QuickSort’s Big-Oh runtime classification, abstracted to the algorithm level:
1. Best case: nlogn
2. Average or most likely case: nlogn
3. Worst case: n^2

### Our Methodology
1. For best case we took a sorted array. We know that the best case for QuickSort of a sorted array is having the pivot
position be the middle position as the position it will return will always be the median.
2. For worst case we also took a sorted array however we know that the worst case for a sorted array is if you pick a pivot
position at either end. We made a new qsort function that picked the pivot position as the first element.
----
For testing the run time of both best and worst case for every array size we tested (5,100,1000,10000,100000) we used qsort
20 times for each array size and calculated the time for each one. We then calculated the average of those and used that as 
the runtime for that size arra.
3. For average case we didnt modify the pivot position itself within the qsort algo but rather had random arrays generated of 
the given size we wanted. We created a 100 arrays of the size we wanted and calculated the average runtime. We used the same 
qsort algo(pivot pos as middle position).
