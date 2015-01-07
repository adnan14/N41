
public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = new int[] { 871, 12, 8, 12, 98, 12, 19, 18, 82, 11, 65 };
		insertionSort(numbers);
		
		for (int n : numbers) {
			System.out.println(n);
		}
	}

	private static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int newPos = 1;
			
			while (newPos > 0 && array[newPos - 1] > array[newPos]) {
				int t = array[newPos-1];
				array[newPos - 1]= array[newPos];
				array[newPos] = t;
				
				newPos--;
			}
			
		}
	}
	
	private static void bubbleSort(int[] array) {
		for (int lastUnsorted = array.length - 1; lastUnsorted >= 0; lastUnsorted--) {
			int maxIndex = 0;	
	
			for (int j = 1; j <= lastUnsorted; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}
			
			int t = array[lastUnsorted];
			array[lastUnsorted] = array[maxIndex];
			array[maxIndex] = t;
		}
	}
}
