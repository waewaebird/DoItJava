package chap04.practice;

import chap04.IntStack;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true) {
            System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
            System.out.print("(1) 푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)삭제 (7)확인 (0)종료 :");

            int menu = stdIn.nextInt();
            if(menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는" + x + "입니다.");
                    } catch (IntStack.EmptyInStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("픽한 데이터는" + x + "입니다.");
                    } catch (IntStack.EmptyInStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;

                case 5:
                    System.out.print("검색할 데이터 : ");
                    x = stdIn.nextInt();

                    try {
                        int i = s.indexOf(x);
                        if(i == -1){
                            System.out.println("검색한 데이터는 없습니다.");
                        } else {
                            System.out.println("검색한 데이터는 [" + i + "]에 있습니다.");
                        }
                    } catch (IntStack.EmptyInStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 6:
                    try {
                        s.clear();
                        System.out.println("삭제완료");
                    } catch (IntStack.EmptyInStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 7:
                    try {
                        Boolean b = s.isFull();
                        if(b == true) {
                            System.out.println("현재 stack은 꽉 차있습니다.");
                        } else {
                            System.out.println("현재 stack은 비어있습니다.");
                        }
                    } catch (IntStack.EmptyInStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
            }
        }
    }
}
