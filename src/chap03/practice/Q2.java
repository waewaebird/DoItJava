package chap03.practice;

import java.util.Scanner;

public class Q2 {
    static int seqSearchPrint(int[] a, int n, int key){
        System.out.print("   | ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println("___+_________________________");

        for(int i = 0 ; i < n ; i++) {
            System.out.print("   | ");
            if(i == 0) {
                System.out.print("");
            } else {
                for(int ii = 0 ; ii<i ; ii++) {
                    System.out.print("   ");
                }
            }
            System.out.println("*");
            System.out.print(i +"  | ");
            for(int j = 0 ; j < n ; j++) {
                System.out.print(a[j] + "  ");
            }
            System.out.println();
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0 ; i < num ; i++) {
            System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = seqSearchPrint(x, num, ky);

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
        }
    }
}
