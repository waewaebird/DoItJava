package chap06.practice;

import java.util.Scanner;

public class Q3 {
    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void bubbleSort(int[] a, int n) {
        int compare = 0;
        int swap = 0;

        for(int i = 0 ; i < n -1 ; i++) {

            System.out.printf("패스%d : \n", i + 1);

            int exchg = 0;

            for(int j = n-1 ; j > i ; j--) {
                for(int m = 0 ; m < n-1; m++) {
                    System.out.printf("%3d %c" , a[m], (m != j-1) ? ' ' :
                            (a[j - 1] > a[j]) ? '+' : '-');
                }
                System.out.printf("%3d\n", a[n - 1]);

                if(a[j-1] > a[j]){
                    swap(a , j-1, j);
                    swap++;
                    exchg++;
                }
                compare++;
            }
            if(exchg == 0) break;
        }
        System.out.println(compare + " 비교함");
        System.out.println(swap + " 교환함");

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1");
        System.out.print("요솟수 : ");
        int nx =  stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0 ; i < nx ; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x , nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0 ; i < nx ; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
