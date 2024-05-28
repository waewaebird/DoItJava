package chap02.practice;

import chap02.PhysicalExamination;

import java.util.Scanner;

public class Q10 {
    static final int VMAX = 21;

    static class PhyscData {
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(Q10.PhyscData[] dat) {
        double sum = 0;

        for(int i=0; i < dat.length ; i++) {
            sum += dat[i].height;
        }
        return sum / dat.length;
    }

    static void distVision(Q10.PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for(i = 0 ; i < dat.length ; i++){
            if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0){
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        Q10.PhyscData[] x = {
                new Q10.PhyscData("박연규", 162, 0.3),
                new Q10.PhyscData("함진아", 173, 0.7),
                new Q10.PhyscData("최윤미", 175, 2.0),
                new Q10.PhyscData("홍연의", 171, 1.5),
                new Q10.PhyscData("이수진", 168, 0.4),
                new Q10.PhyscData("김영준", 174, 1.2),
                new Q10.PhyscData("박영규", 169, 0.8)
        };
        int[] vdist = new int[VMAX];

        System.out.println("=== 신체검사 리스트 ===");
        System.out.println("이름         키   시력");
        System.out.println("-----------------------");

        for(int i = 0 ; i < x.length ; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");
        for(int i = 0 ; i < VMAX ; i++){
            System.out.printf("%3.1f~ : ", i / 10.0);
            for(int j = 1 ; j <= vdist[i] ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
