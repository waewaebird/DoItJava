package chap05.practice;

import java.util.Scanner;

public class Q2 {
    static int ng(int x, int y) {
        int a,b,c;
        if(x == y) {
            return x;
        } else if(x > y) {
            a = x;
            b = y;
        } else {
            a = y;
            b = x;
        }

        while(a % b != 0) {
            c = b;
            b = a%b;
            a = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요");
        int x = stdIn.nextInt();

        System.out.print("정수를 입력하세요");
        int y = stdIn.nextInt();

        System.out.println("최대공약수는 " + ng(x,y) + " 입니다.");
    }
}
