package Model;
public class intarrayclass {
	public intarrayclass() {
		System.out.println("This is the default constuctor. please place an array of numbers to do this");
	}
	public intarrayclass(int[] numberarray) {
		int ArrayLength = numberarray.length;
		int ValueHolder = 0;
		int largestvalue = Integer.MIN_VALUE;
		for(int i=0; i < ArrayLength; i++) {
			for(int j=1; j < ArrayLength; j++) {				
				if (numberarray[j-1] > numberarray[j]) {
					ValueHolder = numberarray[j-1];
					numberarray[j-1] = numberarray[j];
					numberarray[j] = ValueHolder;
				}
			}
		}
		System.out.println("The largest number is " + numberarray[ArrayLength-1]);
		
		int modcheck = ArrayLength % 2;
		if(modcheck == 1) {
			System.out.println("The Median number is " + numberarray[((ArrayLength-1)/2)]);
		} else {
			double value= Double.valueOf(numberarray[(ArrayLength/2)] + numberarray[(ArrayLength/2) - 1]);
			System.out.println("The Median number is " + value/2);
		}
	}
}