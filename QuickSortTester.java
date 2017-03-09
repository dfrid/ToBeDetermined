public class QuickSortTester{
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    } 
    public static void main(String[] args){
	int[] arr1 = {1,2,4,5};
	long totalTime = 0;
	for(int i = 0; i < 20;i++){
	    long startTime = System.nanoTime();
	    QuickSort.qsort(arr1);
	    long stopTime = System.nanoTime();
	    totalTime += (stopTime - startTime);
	}
	System.out.println(totalTime/20);
    }
}
