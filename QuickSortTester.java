/*ToBeDetermined
  Piotr Milewski, David Frid
  APCS2 pd5
  LAB#01 -- What Does the Data Say?
  2017-03-10*/

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
	
	//TESTS FOR BEST CASE
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
	    QuickSort.qsort(arr3);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Best case average time for 1000 elements");
	System.out.println(totalTime/20);
	int[] arr4 = new int[10000];
	for(int i = 0;i < arr4.length;i++){
	    arr4[i] = i+1;
	}
	totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.qsort(arr4);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Best case average time for 10000 elements");
	System.out.println(totalTime/20);
	int[] arr5 = new int[100000];
	for(int i = 0;i < arr5.length;i++){
	    arr5[i] = i+1;
	}
	totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.qsort(arr5);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Best case average time for 100000 elements");
	System.out.println(totalTime/20);
	//END TESTS FOR BEST CASE
	
	//TESTS FOR WORST CASE
	int[] worstarr1 = {1,2,4,5};
	 totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.worstqsort(worstarr1);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Worst case average time for 5 elements");
	System.out.println(totalTime/20);
    
	int[] worstarr2 = new int[100];
	for(int i = 0;i < worstarr2.length;i++){
	    worstarr2[i] = i+1;
	}
	totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.worstqsort(worstarr2);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Worst case average time for 100 elements");
	System.out.println(totalTime/20);

	int[] worstarr3 = new int[1000];
	for(int i = 0;i < worstarr3.length;i++){
	    worstarr3[i] = 1000-i;
	}
	totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.worstqsort(worstarr3);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Worst case average time for 1000 elements");
	System.out.println(totalTime/20);

	int[] worstarr4 = new int[10000];
	for(int i = 0;i < worstarr4.length;i++){
	    worstarr4[i] = i+1;
	}
	totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.worstqsort(worstarr4);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Worst case average time for 10000 elements");
	System.out.println(totalTime/20);
	/*
	int[] worstarr5 = new int[100000];
	for(int i = 0;i < worstarr5.length;i++){
	    worstarr5[i] = i+1;
	}
	totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.worstqsort(worstarr5);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Worst case average time for 100000 elements");
	System.out.println(totalTime/20);
	*/
	//END TESTS FOR WORST CASE

	//TESTS FOR AVERAGE CASE
	totalTime = 0;
	for(int i = 0; i < 100;i++){
	    int[] avArr = buildArray(5,5);
	    long startTime = System.nanoTime();
	    QuickSort.qsort(avArr);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Average time for random array of 5 elements");
	System.out.println(totalTime/100);
	totalTime = 0;
	for(int i = 0; i < 100;i++){
	    int[] avArr = buildArray(100,100);
	    long startTime = System.nanoTime();
	    QuickSort.qsort(avArr);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Average time for random array of 100 elements");
	System.out.println(totalTime/100);
	totalTime = 0;
	for(int i = 0; i < 100;i++){
	    int[] avArr = buildArray(1000,1000);
	    long startTime = System.nanoTime();
	    QuickSort.qsort(avArr);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Average time for random array of 1000 elements");
	System.out.println(totalTime/100);
	totalTime = 0;
	for(int i = 0; i < 100;i++){
	    int[] avArr = buildArray(10000,10000);
	    long startTime = System.nanoTime();
	    QuickSort.qsort(avArr);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Average time for random array of 10000 elements");
	System.out.println(totalTime/100);
	totalTime = 0;
	for(int i = 0; i < 100;i++){
	    int[] avArr = buildArray(100000,100000);
	    long startTime = System.nanoTime();
	    QuickSort.qsort(avArr);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println("Average time for random array of 100000 elements");
	System.out.println(totalTime/100);
	//END TESTS FOR AVERAGE CASE
	
    }
}
