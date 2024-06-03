package chap03;
import java.util.Comparator;

class X {
    public static Comparator COMPARATOR = new Comp<>();
    private static class Comp<T> implements Comparator<T> {
        public int compare(T d1, T d2){
            return 0;
        }
    }
}
