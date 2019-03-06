public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 0;
        for (int i = 1; i < 10; i++) {
            a[i] = a[i - 1] + i;
            System.out.println("a[" + (i - 1) + "]:" + a[i-1]);
        }
    }
}
