package lesson01;

public class Demo {

	public static void main(String[] args) {
		System.out.println("test");
		int[] arr = {1, 2, 3, 5, 10, 2};
		System.out.println(ArrayTool.getMax(arr));
		int[] arr1 = ArrayTool.reverse(arr);
		ArrayTool.foreach(arr1);
		ArrayTool.foreach(arr);
	}
	
}

class ArrayTool {
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void foreach(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] reverse(int[] arr) {
		int[] tmp = new int[arr.length];
		for (int i = 0; i < arr.length; ++i) {
			tmp[i] = arr[arr.length - i - 1];
		}
		return tmp;
	}
	
}