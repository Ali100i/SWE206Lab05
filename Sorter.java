public class Sorter{

static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int iMin = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[iMin])
					iMin = j;
			if (i != iMin) {
				int temp = arr[i];
				arr[i] = arr[iMin];
				arr[iMin] = temp;
			}
		}
	}
public int[] sort(int[] array){

	return selectionSort(array);
} 
	
public int[] sort(int[] array){

	return insertionSort(array);

} 
  private int[] insertionSort(int[] input){
		
	    int temp;
		
	    for (int i = 1; i < input.length; i++) {
		    for(int j = i ; j > 0 ; j--){
			    if(input[j] < input[j-1]){
				    temp = input[j];
				    input[j] = input[j-1];
				    input[j-1] = temp;
			    }
		    }
	    }
	    return input;
	}
}
