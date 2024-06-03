package chap03.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7 {
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> BEST_VISION = new BestVision();

        public static class BestVision implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.vision > d2.vision) ? 1 :
                        (d1.vision < d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Q7.PhyscData[] x = {
                new Q7.PhyscData("이나령", 162, 0.3),
                new Q7.PhyscData("유지훈", 168, 0.4),
                new Q7.PhyscData("김한결", 169, 0.8),
                new Q7.PhyscData("홍준기", 171, 1.5),
                new Q7.PhyscData("진서현", 173, 0.7),
                new Q7.PhyscData("이호연", 174, 1.2),
                new Q7.PhyscData("이수민", 175, 2.0)
        };
        System.out.print("시력이 몇인 사람을 찾나요 :");
        double vision = stdIn.nextDouble();
        int idx = Arrays.binarySearch(
                x,
                new Q7.PhyscData("", 0, vision),
                PhyscData.BEST_VISION
        );

        if(idx < 0) {
            System.out.println("요소가 없습니다.");
        } else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
