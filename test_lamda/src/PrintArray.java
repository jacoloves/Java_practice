
public class PrintArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 1, 4, 1, },
                {5, 9, 2, },
                {6, 5, },
                {3, },
        };
        printArray(arr);
    }

    public static void printArray(int[][] arr1) {
        System.out.println("{");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + ", ");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }
}
