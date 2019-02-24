public class testSample1 {
    public static void main(String[] args) {
        for (int i=8; i >= 1; i--) {
            printGraph(i*i);
        }

        System.out.println();

        for (int i=1; i <= 8; i++) {
            printGraph(i*i);
        }
    }

    private static void printGraph(int x) {
        for(int i = 0; i < x; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }
}
