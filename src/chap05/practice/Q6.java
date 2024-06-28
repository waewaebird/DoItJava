package chap05.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q6 {
    static void move(int no, int x, int y) {

        Map<Integer, String> names = new HashMap<>() {{
            put(1,"A");
            put(2,"B");
            put(3,"C");
        }};

        if(no > 1) {
            move(no - 1, x, 6-x-y);
        }

        System.out.println("원반[" + no + "]을" + names.get(x) + "기둥에서 " + names.get(y) + "기둥으로 옮김");

        if(no > 1) {
            move(no - 1, 6 - x - y , y);
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반 개수 : ");
        int n = stdIn.nextInt();

        move(n ,1 ,3);
    }
}
