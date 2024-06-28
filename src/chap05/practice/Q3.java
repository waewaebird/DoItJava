package chap05.practice;

public class Q3 {
    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y ,x % y);
        }
    }
    static int gcdArray(int[] a, int start, int no) {
        if(no == 1) {
            return a[start];
        } else if (no == 2) {
            return gcd(a[start], a[start+1]);
        } else {
            return gcd(a[start], gcdArray(a, start+1, no-1));
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{22, 8};
        System.out.println(gcdArray(a,0, a.length));
    }
}
