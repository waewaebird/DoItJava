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

    static String q7(int num) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구하라.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;
        String result = "";

        while(i <= n) {
            sum += i;
            if(i == n) {
                result += i + " = ";
            } else {
                result += i + " + ";
            }
            i++;
        }
        return result + sum;
    }

    static int q8(int start, int end) {
        Scanner stdIn = new Scanner(System.in);

        int sum = (start+end) * (end/2);

        return sum;
    }

    static int sumof(int a, int b) {
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;

    }

    static void q10() {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        System.out.println("a의 값 : " + a);

        int b;

        while(true) {
            b = stdIn.nextInt();

            if(b <= a) {
                System.out.println("a보다 큰값을 입력하세요.");
            } else {
                System.out.println("b의 값 : " + b);
                break;
            }
        }
        int result = b-a;
        System.out.println("b-a는"+ result +" 입니다");
    }

    static void q11() {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        if(n <= 0) {
            System.out.println("양의 정수가 아닙니다.");
            return;
        }

        String s = String.valueOf(n);

        System.out.println("그 수는 " + s.length() + "자리입니다.");
    }

    static void q12() {
        System.out.printf("    |");
        for(int i = 1; i <= 9 ; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("  --+" + "----------------------------");
        for(int i = 1; i <= 9 ; i++) {
            System.out.printf("%3d |", i);
            for(int j = 1; j <= 9 ; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }

    static void q13() {
        for(int i = 1 ; i <= 9 ; i++){
            System.out.printf("%3d |", i);
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }

    static void q14() {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("사각형을 출력합니다");
        System.out.println("단수 : ");
        int n = stdIn.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("*");
            for(int j = 1; j <= n-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLB(int n) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        String star = "*";
        for(int i = n ; i >= 1 ; i--) {
            System.out.println(star.repeat(i));
        }
    }

    static void triangleRU(int n) {
        String star = "*";
        String space = " ";
        for(int i = n ; i >= 1 ; i--) {
            System.out.println(space.repeat(n-i)+star.repeat(i));
        }
    }

    static void triangleRB(int n) {
        String star = "*";
        String space = " ";
        for(int i = 1; i <= n ; i++){
            System.out.println(space.repeat(n-i)+star.repeat(i));
        }
    }

    static void spira(int n) {
        String star = "*";
        String space = " ";
        for(int i = 1 ; i <= n ; i++){
            int num = (i-1)*2 +1;
            System.out.println(space.repeat(n-i)+star.repeat(num));
        }
    }

    static void npira(int n) {
        String space = " ";
        for(int i = 1 ; i <= n ; i++){
            String star = String.valueOf(i);
            int num = (i-1)*2 +1;
            System.out.println(space.repeat(n-i)+star.repeat(num));
        }

    }

    public static void main(String[] args) {
/*
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

        System.out.println(q7(7));


        System.out.println(q8(1,10));


        System.out.println(sumof(3,5));

        q10();


        q11();

        q12();

        q13();

        q14();
*/
        //triangleLB(4);
        //triangleLU(4);
        //triangleRB(10);
        //triangleRU(10);

        //spira(4);
        npira(4);
    }
}
