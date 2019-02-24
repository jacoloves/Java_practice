public class testLamda {
    public static void main(String[] args) {
        method(() -> {
            System.out.println("Hello Lamda!");
        });
    }

    public static void method(Runnable r) {
        r.run();
    }
}
