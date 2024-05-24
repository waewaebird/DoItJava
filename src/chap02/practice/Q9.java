package chap02.practice;

import java.util.Scanner;

public class Q9 {
    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31},
            {31,29,31,30,31,30,31,31,30,31,30,31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int leftDayOfYear(int y, int m, int d) {
        int ld = 0;

        if(m == 12) {
            ld = 31-d;
        } else {
            ld = mdays[isLeap(y)][m-1] - d;

            for(int i = 11 ; i >= m; i--) {
                ld += mdays[isLeap(y)][i];
            }
        }
        return ld;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("그 해 남은 일수를 구합니다.");

        do {
            System.out.print("년 : "); int year = stdIn.nextInt();
            System.out.print("월 : "); int month = stdIn.nextInt();
            System.out.print("일 : "); int day = stdIn.nextInt();

            System.out.printf("남은일수는 %d 입니다.\n", leftDayOfYear(year , month , day));

            System.out.print("한 번 더 할까요? (1.예 / 0.아니오) : ");
            retry = stdIn.nextInt();

        } while (retry == 1);
    }
}
