public class QuickSortTester{
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    } 
    public static void main(String[] args){
	//to allocate for "warm up" time
	int[] arr0 = {1,2};
	for(int x = 0;x < 10000;x++){
	    QuickSort.qsort(arr0);
	}
	int[] arr1 = {1,2,4,5};
	long totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.qsort(arr1);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Best case average time for 5 elements");
	System.out.println(totalTime/20);
	int[] arr2 = new int[100];
	for(int i = 0;i < arr2.length;i++){
	    arr2[i] = i+1;
	}
	totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.qsort(arr2);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Best case average time for 100 elements");
	System.out.println(totalTime/20);
	int[] arr3 = new int[1000];
	for(int i = 0;i < arr3.length;i++){
	    arr3[i] = i+1;
	}
	totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.qsort(arr2);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Best case average time for 1000 elements");
	System.out.println(totalTime/20);
    }
}
