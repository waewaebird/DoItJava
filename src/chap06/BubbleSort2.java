package chap06;

import java.util.Scanner;

public class BubbleSort2 {
    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void bubbleSort(int[] a, int n) {
        for(int i = 0 ; i < n -1 ; i++) {
            int exchg = 0;
            for(int j = n - 1 ; j > i ; j--) {
                if(a[j-1] > a[j]){
                    swap(a, j-1, j);
                    exchg++;
                }
            }
            if(exchg == 0) break;
        }
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
