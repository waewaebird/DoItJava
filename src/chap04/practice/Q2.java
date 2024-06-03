package chap04.practice;

public class Q2<E> {
    private int max;
    private int ptr;
    private E[] stk;

    public static class Q2EmptyException extends RuntimeException {
        public Q2EmptyException() {}
    }

    public static class Q2OverflowException extends RuntimeException {
        public Q2OverflowException() {}
    }

    public Q2(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public E push(E o) {
        if (ptr >= max) {
            throw new Q2OverflowException();
        }
        return stk[ptr++] = o;
    }

    public E pop() {
        if(ptr <= 0) {
            throw new Q2EmptyException();
        }
        return stk[--ptr];
    }

    public E peek() {
        if(ptr <= 0) {
            throw new Q2EmptyException();
        }
        return stk[ptr -1];
    }

    public int indexOf(Object o) {
        for(int i = ptr - 1 ; i >= 0 ; i--) {
            if(stk[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        ptr = 0;
    }
    public int capacity(){
        return max;
    }

    public int size() {
        return ptr;
    }
    public boolean isFull() {
        return ptr >= max;
    }
    public void dump() {
        if(ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        } else {
            for(int i = 0 ; i < ptr ; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
