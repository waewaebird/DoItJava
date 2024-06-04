package chap04.practice;

public class Q3 {
    private int capacity;
    private int[] stk;
    private int ptrA;
    private int ptrB;

    public enum AorB{StackA, StackB};
    public class EmptyException extends RuntimeException {
        public EmptyException(){};
    }

    public class OverflowException extends RuntimeException {
        public OverflowException(){};
    }

    public Q3(int maxlen) {
        ptrA = 0;
        ptrB = maxlen-1;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push(AorB sw, int x) throws OverflowException {
        if(ptrA >= ptrB+1) {
            throw new OverflowException();
        }
        switch (sw) {
            case StackA :
                stk[ptrA++] = x;
                break;
            case StackB:
                stk[ptrB--] =x;
                break;
        }
        return x;
    }

    public int pop(AorB sw) throws EmptyException {
        int x = 0;
        switch (sw) {
            case StackA :
                if(ptrA <= 0) {
                    throw new EmptyException();
                }
                x =  stk[--ptrA];
                break;
            case StackB:
                if(ptrB >= capacity-1) {
                    throw new EmptyException();
                }
                x = stk[++ptrB];
                break;
        }
        return x;
    }

    public int peek(AorB sw) throws EmptyException {
        int x = 0;
        switch (sw) {
            case StackA :
                if(ptrA <= 0) {
                    throw new EmptyException();
                }
                x = stk[ptrA - 1];
                break;
            case StackB :
                if(ptrB >= capacity-1) {
                    throw new EmptyException();
                }
                x = stk[ptrB + 1];
                break;
        }
        return x;
    }

    public int indexOf(AorB sw, int x) {
        int n = -1;
        switch (sw) {
            case StackA -> {
                for(int i = ptrA -1 ; i >= 0 ; i--) {
                    if(stk[i]==x) {
                        n = i;
                    }
                }
            }
            case StackB -> {
                for(int i = ptrB + 1 ; i < capacity ; i++) {
                    if(stk[i]==x) {
                        n = i;
                    }
                }
            }
        }
        return n;
    }

    public void clear(AorB sw) {
        switch (sw) {
            case StackA -> {
                ptrA = 0;
            }
            case StackB -> {
                ptrB = capacity-1;
            }
        }
    }

    public int capacity() {
        return capacity;
    }

    public int size(AorB sw) {
        int x = 0;
        switch (sw) {
            case StackA -> {
                x = ptrA;
            }
            case StackB -> {
                x = capacity-ptrB-1;
            }
        }
        return x;
    }

    public boolean isEmpty(AorB sw) {
        switch (sw) {
            case StackA -> {
                return ptrA <= 0;
            }
            case StackB -> {
                return ptrB >= capacity -1;
            }
        }
        return true;
    }

    public void dump(AorB sw){
        switch (sw) {
            case StackA -> {
                if(ptrA <= 0) {
                    System.out.println("A스택 비어있습니다.");
                } else {
                    for(int i = 0 ; i < ptrA ; i++) {
                        System.out.print(stk[i] + " ");
                    }
                    System.out.println();
                }
            }
            case StackB -> {
                if(ptrB >= capacity - 1) {
                    System.out.println("B스택 비어있습니다.");
                } else {
                    for(int i = capacity -1 ; i > ptrB ; i--) {
                        System.out.print(stk[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
