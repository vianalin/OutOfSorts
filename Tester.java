import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {

		ArrayList<Boolean> asort = new ArrayList<Boolean>();
		ArrayList<Boolean> bsort = new ArrayList<Boolean>();
		ArrayList<Boolean> csort = new ArrayList<Boolean>();
		int[] a = {-9, 1, 3, 7, 9};
		int[] b = {78, 900, 5, 2, 8};
		int[] c = {700, 68, 7, 4, -1};

		//Sorts.bubbleSort(a);
		//Sorts.selectionSort(a);
		Sorts.insertionSort(a);
		System.out.println(asort.add(Arrays.toString(a).equals("[-9, 1, 3, 7, 9"))); //testing change nothing

		//Sorts.bubbleSort(b);
		//Sorts.selectionSort(b);
		Sorts.insertionSort(b);
		System.out.println(bsort.add(Arrays.toString(b).equals("[2, 5, 8, 78,900]"))); //testing messed up order

		//Sorts.bubbleSort(c);
		//Sorts.selectionSort(c);
		Sorts.insertionSort(c);
		System.out.println(csort.add(Arrays.toString(c).equals("[-1, 4, 7, 68, 700]"))); //testing reverse sorted


	}
}