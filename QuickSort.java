/*
David Frid
APCS2 pd 5
HW #15: So So Quick
2017-03-08
*/
/*****************************************************
 * class QuickSort
 * (skeleton) <<delete this line if untrue>>
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): It will pick a random pivot position(position in middle)
 and partition around that element to get that element into its final resting
place. You will then have two subarrays (or one possibly) on either side of
the returned value of the partition call. They will have values smaller and 
larger than the value at the pivotPos. You will then repeat this process on 
those subarrays until eventually you will have one element subarrays and you
know every element is in its final resting place. 
 *
 * 2a. Worst pivot choice / array state and associated runtime:
Worst pivot choice would be if the final resting place of pivotPos is at
 either end of the subarray. This will cause an n^2 time complexity
 *
 * 2b. Best pivot choice / array state and associated runtime:
The best case is if you always pick the median of the array/subarray.
This will be a runtime of nlogn
 *
 * 3. Approach to handling duplicate values in array:
I didn't implement duplicate handling but they will appear to the left or 
right of the element with the same value as them so the sorting algo still works
for arrays w dups.
 *
 *****************************************************/

/***
    PROTIP: Assume no duplicates during initial development phase.
    Once you have a working implementation, test against arrays 
    with duplicate values, and revise if necessary. (Backup first.)
 ***/

public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }

    public static void qsortH(int[]d,int left, int right){
	if(left < right){
	    int pivotPos = partition(d,left,right,(left+right)/2);
	    qsortH(d,left,pivotPos);
	    qsortH(d,pivotPos+1,right);
	}
    }
	
    public static int partition(int[] arr, int a, int b, int c){
        int v = arr[c];
        int temp = arr[c];
        arr[c] = arr[b];
        arr[b] = temp;
        int s = a;
        for (int i=a; i<b; i++){
            if (arr[i]<v){
                int temp2 = arr[s];
                arr[s] = arr[i];
                arr[i] = temp2;
                s+=1;
            }
        }
        int temp3 = arr[s];
        arr[s] = arr[b];
        arr[b] = temp3;
        return s;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ) 
    { 
	qsortH(d,0,d.length-1);
	
    }

    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.


    //main method for testing
    public static void main( String[] args ) 
    {
 
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);
	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);
	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);
       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);
	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
 
	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);
	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);
	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);
       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);
	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);


    }//end main

}//end class QuickSort
