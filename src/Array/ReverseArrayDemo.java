package Array;

public class ReverseArrayDemo {
	public static void main(String args[]) {
		int arr[] = new int[5];
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
		int length = arr.length;
		System.out.println("\n Array length is " + length);
		System.out.println("\n Original array is ");
		for (int i = 0; i < length; i++) {
			System.out.println(" " + arr[i]);
		}
		System.out.println("\n Array in reverse order is ");
		for (int i = length - 1; i >= 0; i--) {
			System.out.println(" " + arr[i]);
		}

	}

}