package chap04.practice;

public class Q7 {
    private int[] que;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    public static class EmptyException extends RuntimeException {
        public EmptyException(){}
    }

    public static class OverflowException extends RuntimeException {
        public OverflowException(){}
    }

    public Q7(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch(OutOfMemoryError e){
            capacity = 0;
        }
    }

    public int enqueFront(int x) throws OverflowException {
        if(num >= capacity) {
            throw new OverflowException();
        }
        num++;
        if(--front < 0) {
            front = capacity =1;
        }
        que[front] = x;
        return x;
    }

    public int enqueRear(int x) throws OverflowException {
        if(num >= capacity ){
            throw new OverflowException();
        }
        que[rear++] = x;
        num++;
        if(rear == capacity) {
            rear = 0;
        }
        return x;
    }

    public int dequeFront() throws EmptyException {
        if(num<=0) {
            throw new EmptyException();
        }
        int x = que[front++];
        num--;
        if(front == capacity) {
            front = 0;
        }
        return x;
    }

    public int dequeRear() throws EmptyException {
        if(num <= 0) {
            throw new EmptyException();
        }
        num--;
        if(--rear < 0) {
            rear =capacity -1;
        }
        return que[rear];
    }

    public int peekFront() throws EmptyException {
        if (num <= 0) {
            throw new EmptyException();
        }
        return que[front];
    }

    public int peekRear() throws EmptyException {
        if(num <= 0) {
            throw new EmptyException();
        }
        return que[rear == 0 ? capacity -1 : rear -1];
    }

    public int indexOf(int x) {
        for(int i = 0; i < num; i++) {
            int idx = (i+front) % capacity;
            if(que[idx] == x){
                return idx;
            }
        }
        return -1;
    }

    public int search(int x) {
        for(int i = 0 ; i < num ; i++) {
            if(que[(i + front) % capacity] == x) {
                return i + 1;
            }
        }
        return 0;
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull(){
        return num >= capacity;
    }

    public void dump() {
        if(num <= 0) {
            System.out.println("덱이 비어 있습니다.");
        } else {
            for(int i = 0 ; i < num ; i++) {
                System.out.print(que[(i+front) % capacity] + " ");
            }
            System.out.println();
        }
    }

}
