package chap06.practice;

import java.util.Scanner;

public class Q2 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        int compare = 0;
        int swap = 0;

        for(int i = 0 ; i < n-1 ; i++) {
            int pn = i+1;
            System.out.println("패스" + pn + " :");

            for(int j = n-1 ; j > i ; j--) {
                String temp;
                for(int pp = 0 ; pp < n ; pp++) {
                    if((a[j-1] > a[j]) && pp == j-1) {
                        swap++;
                        temp = "+";
                    } else  if (pp == j-1){
                        temp = "-";
                    } else {
                        temp = " ";
                    }
                    System.out.print(a[pp]+ temp);
                }
                System.out.println();

                if(a[j-1] > a[j]){
                    swap(a , j-1, j);
                }
                compare++;
            }
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
