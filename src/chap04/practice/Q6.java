package chap04.practice;

public class Q6<E> {
    private int max;
    private int num;
    private int front;
    private int rear;
    private E[] que;

    public static class EmptyEQueueException extends RuntimeException{
        public EmptyEQueueException(){}
    }

    public static class OverFlowEQueueException extends RuntimeException {
        public OverFlowEQueueException(){}
    }

    public Q6(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public E enque(E x) throws OverFlowEQueueException {
        if(num >= max) {
            throw new OverFlowEQueueException();
        }
        que[rear++] = x;
        num++;
        if(rear == max) {
            rear = 0;
        }
        return x;
    }

    public E deque() throws EmptyEQueueException {
        if(num <= 0) {
            throw new EmptyEQueueException();
        }
        E x = que[front++];
        num--;
        if(front == max) {
            front = 0;
        }
        return x;
    }

    public E peek() throws EmptyEQueueException {
        if(num <= 0) {
            throw new EmptyEQueueException();
        }
        return que[front];
    }

    public int indexOf(E x) {
        for(int i = 0 ; i < num ; i++) {
            int idx = (i + front) % max;
            if(que[idx] == x){
                return idx;
            }
        }
        return -1;
    }
    public void clear() {
        num = front = rear = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        if(num <= 0) {
            System.out.println("큐가 비어있습니다.");
        } else {
            for(int i = 0 ; i < num ; i++) {
                System.out.println(que[(i+front) % max] + " ");
            }
            System.out.println();
        }
    }
}
