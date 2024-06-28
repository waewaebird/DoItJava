package chap05.practice;

import java.util.Scanner;

public class Q4 {
    /*
    *
    * 상향식
    *  recur -2 : X
    *  recur -1 : X
    *  recur 0 : X
    *  recur 1 : recur(-1) recur(0) 1
    *  recur 2 : recur(0) recur(1) 21
    *  recur 3 : recur(1) recur(2) 1321
    *  recur 4 : recur(2) recur(3) 2141321
    * 
    * 하향식
    *  몰라
    *
    * */
    static void recur2(int n) {
        if(n > 0) {
            recur2(n-2);
            System.out.println(n);
            recur2(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.");
        int x = stdIn.nextInt();

        recur2(x);
    }
}
