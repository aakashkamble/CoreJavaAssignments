package GenericsAssignments;

import java.util.Arrays;

public class ArraySwap {
	
	public static <T> void swap(T[] array,int index1,int index2) {
		if(index1<0 || index1>=array.length || index2<0 ||index2>=array.length) {
			System.out.println("Please valid array ");
			return;
		}
		T temp=array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray= {1,2,3,4,5};
		System.out.println("Original Array: "+Arrays.toString(intArray));
		
		swap(intArray, 1, 3);
		System.out.println("Updated Array: "+Arrays.toString(intArray));

	}

}
