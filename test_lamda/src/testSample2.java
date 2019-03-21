public class testSample2 {
    public static void main(String[] args) {
        String[] s = getYouName();
        System.out.println("名字は" + s[0]);
        System.out.println("名前は" + s[1]);
    }

    private static String[] getYouName() {
        String[] myoji_name = new String[2];
        myoji_name[0] = "結城";
        myoji_name[1] = "浩";
        return myoji_name;
    }


}
