package chap05.practice;

import java.util.Scanner;

public class Q1 {
    static int nf(int n) {
        int v = 1;
        for(int i = n ; i > 0 ; i--) {
            v = v*i;
        }
        return v;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + nf(x) + " 입니다");
    }
}
