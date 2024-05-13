package chap02.practice;

public class Q2 {

    static void swap(int[] arr, int a, int b) {
        System.out.println("a["+a+"]과 a["+b+"]를 교환합니다.");
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5,10,73,2,-5,42};
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        swap(a,0,5);
        swap(a,1,4);
        swap(a,2,3);
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
