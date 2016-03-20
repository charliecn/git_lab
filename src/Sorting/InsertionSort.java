package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		for(int i=1; i < unsortedArray.length; i++){
		    
		    int currentValue = unsortedArray[i];
		    int j = i-1;
		    
		    while(j >= 0){
		    	if(unsortedArray[j] > currentValue) {
		    		unsortedArray[j+1] = unsortedArray[j];
		      		j = j-1;
		    	}
		    }
		    unsortedArray[j+1] = currentValue;
		  }
		return unsortedArray;
	}
}
