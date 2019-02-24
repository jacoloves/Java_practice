public class Discout2 {
    public static void main(String[] args) {
        int p, q;
        p = 10000;
        /*
        q = halve((p) -> {
            System.out.println(halve());
        });
        */
    }

    public static int halve(int n) {
        return n / 2;
    }

    public static int halve(Runnable r, int i) {
        r.run();
        return i / 2;
    }
}
