package arrays;

public class BubbleSort {
	public static int[] BubbleSort(int[] num) {
		int j;
		boolean flag = true;
		int temp; // ... continue
		while (flag) {
			flag = false;
			for (j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true;
				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] test = { 77, 89, 34, 56, 67 }; // number array
		BubbleSort(test); // calling method BubbleSort w parameter of
		// array 'test' -> returns to us sorted value
//print array test
		for (int i = 0; i < 5; i++) {
			System.out.print(test[i] + "\t");
		}
	}
}