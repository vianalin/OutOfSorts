import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Sorts{

	//public static void main(String[] args) {

		//int n = 10;
		//for (int i = 0; i < n; i++) {
			//Random rng = new Random();

			//int[] data = new int[10000];
			//for (int a = 0; a < 10000; a++) {
				//data[a] = rng.nextInt() * 1000;
			//}

			//int[] hold = data.clone();

			//Arrays.sort(data);
			//bubbleSort(hold);

			//System.out.println(Arrays.toString(hold).equals(Arrays.toString(data)));
		//}

	//}

	//lab part 1: bubble sort
	public static void bubbleSort(int[] data){
  		int dataholder = 0;
  		boolean again = true;
		for(int i = 0; i < data.length - 1; i++) {
  			if(data[i] > data[i+1]) {
  				dataholder = data[i];
  				data[i] = data[i+1];
  				data[i+1] = dataholder;
  				again = false;
  			}
  		}
  		if(!again) {
  		bubbleSort(data);
  		}
  	}

  	//lab part 2: selection sort
  	public static void selectionSort(int[] data) {
  		for(int i = 0; i < data.length - 1; i++) {
  			int min = data[i];
  			int index = i;
  			for(int j = i; j < data.length; j++) {
  			}
  			int holder = data[i];
  			data[i] = min; //swapping min to data[i] index
  			data[index] = holder; //swapping the larger value back
  		}
  	}
}