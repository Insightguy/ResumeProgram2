package Controller;
import Model.intarrayclass;
public class Bubblesort {
	public static void main(String[] args) {
		int[] number_array = new int[] {1,9,2,8,3,4,5,6,7};
		String displayvalue = "";
		System.out.println("Initial order 1: ");
		for(int i=0; i < number_array.length; i++) {
			displayvalue = displayvalue + String.valueOf(number_array[i]) + '-';
		}
		System.out.println(displayvalue);
		intarrayclass intarray = new intarrayclass(number_array);

		number_array = new int[] {1,2,8,3,4,5,6,7};
		displayvalue = "";
		System.out.println("");
		System.out.println("Initial order 2: ");
		for(int i=0; i < number_array.length; i++) {
			displayvalue = displayvalue + String.valueOf(number_array[i]) + '-';
		}
		System.out.println(displayvalue);
		intarray = new intarrayclass(number_array);
	}
}
