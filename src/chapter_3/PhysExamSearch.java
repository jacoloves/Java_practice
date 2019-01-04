package chapter_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString(){
            return name + " " + height + " " + vision;
        }


        //-- 身長昇順用コンパレータ --//
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }

        //-- 資料供養コンパレータ --//
        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData v1, PhyscData v2){
                return (v1.vision > v2.vision) ? 1 : (v1.vision < v2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("赤坂忠男", 162, 0.3),
                new PhyscData("長浜良一", 168, 0.4),
                new PhyscData("松富あきお", 169, 0.8),
                new PhyscData("たけだしおんや", 171, 1.0),
                new PhyscData("加藤富昭", 173, 1.1),
                new PhyscData("浜田哲彬", 174, 1.2),
                new PhyscData("斎藤工", 175, 2.0),
        };

//        System.out.printf("何cmの人を探しますか：");
//        int height = stdIn.nextInt();

        System.out.printf("どの視力の人を探しますか：");
        double vision = stdIn.nextDouble();
        int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);

        if(idx < 0)
            System.out.println("その値の要素は存在しません。");
        else{
            System.out.println("その値はx[" + idx + "]にあります。");
            System.out.println("データ：" + x[idx]);
        }
    }
}
