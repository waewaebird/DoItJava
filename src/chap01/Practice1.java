package chap01;

import java.util.Scanner;

public class Practice1 {
    static int max4(int a, int b, int c, int d) {
        //네값의 최댓값
        int max = a;

        if(b > max) {
            max = b;
        }

        if(c > max) {
            max = c;
        }

        if(d > max) {
            max = d;
        }
        return max;
    }

    static int min3(int a, int b, int c) {
        //세값의 최솟값
        int min = a;

        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        //네값의 최솟값
        int min = a;

        if(b < min) {
            min = b;
        }

        if(c < min) {
            min = c;
        }

        if(d < min) {
            min = d;
        }
        return min;
    }

    static int sumWhile() {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구하라.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            i++;

        }
        System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다");
        return i;
    }


    public static void main(String[] args) {
        System.out.println(max4(10,11,12,13)); //q1
        System.out.println(min3(7,11,12)); //q2
        System.out.println(min4(8,11,12,13)); //q3

        System.out.println("med3(3,2,1) = " + Median.med3(3,2,1)); //q4
        System.out.println("med3(3,2,2) = " + Median.med3(3,2,2));
        System.out.println("med3(3,1,2) = " + Median.med3(3,1,2));
        System.out.println("med3(3,2,3) = " + Median.med3(3,2,3));
        System.out.println("med3(2,1,3) = " + Median.med3(2,1,3));
        System.out.println("med3(3,3,2) = " + Median.med3(3,3,2));
        System.out.println("med3(3,3,3) = " + Median.med3(3,3,3));
        System.out.println("med3(2,2,3) = " + Median.med3(2,2,3));
        System.out.println("med3(2,3,1) = " + Median.med3(2,3,1));
        System.out.println("med3(2,3,2) = " + Median.med3(2,3,2));
        System.out.println("med3(1,3,2) = " + Median.med3(1,3,2));
        System.out.println("med3(2,3,3) = " + Median.med3(2,3,3));
        System.out.println("med3(1,2,3) = " + Median.med3(1,2,3));

        String answer = "동일한 판단이 포함돼 있어 효율이 나쁘다.";//q5

        System.out.println(sumWhile()); // q6

    }
}
