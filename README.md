# ToBeDetermined
By: David Frid and Piotr Milewski

Link to spreadsheet with our run times and corresponding graphs of observed vs expected runtime classifications
https://docs.google.com/spreadsheets/d/1CFRATGu1H9gLVi9oKcBTx4DMIsFvsH1zkzdl7tpniOg/edit?usp=sharing

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

### Time measurements and analysis of same

n: Array Size Runtime: Time in nanoseconds

#### Worst Case:
* n: 5 Runtime: 39001
* n: 100 Runtime: 12252
* n: 1000 Runtime: 506639
* n: 10000 Runtime: 50989117
* n: 100000 Runtime: OVERFLOW

#### Best Case:
* n: 5 Runtime: 128
* n: 100 Runtime: 5794
* n: 1000 Runtime: 52109
* n: 10000 Runtime: 205529
* n: 100000 Runtime: 1551052

#### Average Case:
* n: 5 Runtime: 299
* n: 100 Runtime: 3793
* n: 1000 Runtime: 49389
* n: 10000 Runtime: 624368
* n: 100000 Runtime: 7667454

### How pivot selection and data arrangement affect execution time
Pivot Position and array arrangement affect runtime in the way that if you partition at either the largest or smallest value 
of a subarray you will always get one element in its final resting place but since the function will be done with since the
left will equal the right. There will only be one subarray created that can call on the qsort function again meaning there
only be one element put in its final resting place vs if you had two usbale subarrays you would have 2 elements in their final 
resting place.
