package chap02.practice;

public class Q2 {

    static int[] swap(int[] arr, int a, int b) {
        System.out.println("a["+a+"]과 a["+b+"]를 교환합니다.");
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }


    public static void main(String[] args) {
        int[] a = {5,10,73,2,-5,42};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        a = swap(a,0,5);
        a = swap(a,1,4);
        a = swap(a,2,3);
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
