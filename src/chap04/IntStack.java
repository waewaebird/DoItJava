package chap04;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyInStackException extends RuntimeException {
        public  EmptyInStackException() {}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max) {
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyInStackException {
        if(ptr <= 0) {
            throw new EmptyInStackException();
        }
        return stk[--ptr];
    }

    public int peek() throws EmptyInStackException {
        if(ptr <= 0) {
            throw new EmptyInStackException();
        }
        return stk[ptr - 1];
    }

    public int indexOf(int x) {
        for(int i = ptr - 1 ; i >= 0 ; i--) {
            if(stk[i]==x){
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
