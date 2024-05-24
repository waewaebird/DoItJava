package chap02.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    static int cardConv(int x, int r, char[] d){
        int digits = d.length-1;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits--] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do{
            do{
                System.out.println("변화하는 음이 아닌 정수 : ");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.println("어떤 진수로 변환할까요? (2~36) : ");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.println(cd + "진수로는 ");

            for(int i = 0 ; i <= cno.length-1 ; i++) {
                if(cno[i] != '\u0000'){
                    System.out.print(cno[i]);
                }
            }
            System.out.println("입니다.");

            System.out.println("한 번 더 할까요? (1.예 / 0.아니오) : ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
