package lesson01;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(2, 3));
		test();
		return;
	}
	
    public static int add(int a, int b) {
		return a + b;
	}
    
    static void test() {
        int[] a = new int[5];
        int b[] = new int[6];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
//        int b;
//        System.out.println(b);
        int[][] arr = {{1, 2}, {3, 4}, {5, 6, 7}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
