package chap02.practice;

public class Q3 {
    static int sumOf(int[] a) {
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOf(new int[] {1,2,3,4,5,6,7,8,9,10}));
    }
}
