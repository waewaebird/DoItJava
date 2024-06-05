package chap04.practice;

public class Q4 {
    private int max;
    private int num;
    private int[] que;

    public class QueEmptyException extends RuntimeException {
        public QueEmptyException(){}
    }

    public class QueOverflowException extends RuntimeException {
        public QueOverflowException(){}
    }

    public Q4(int maxlen){
        num = 0;
        max = maxlen;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws QueOverflowException {
        if(num >= max) {
            throw new QueOverflowException();
        }
        que[num++] = x;
        return x;
    }

    public int deque() throws QueEmptyException {
        if(num <= 0) {
            throw new QueEmptyException();
        }
        int x = que[0];
        for(int i = 0 ; i < num -1 ; i++) {
            que[i] = que[i+1];
        }
        num--;
        return x;
    }

    public int peek() throws QueEmptyException {
        if(num <= 0){
            throw new QueEmptyException();
        }
        return que[num-1];
    }

    public int indexOf(int x) {
        for(int i = 0 ; i < num ; i++) {
            if(que[i] == x){
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        num = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        if(num <= 0) {
            System.out.println("큐는 비어있습니다.");
        } else {
            for(int i = 0; i < num ; i++){
                System.out.println(que[i] + " ");
            }
            System.out.println();
        }

    }
}
