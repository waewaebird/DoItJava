package chap04.practice;

import chap04.IntQueue;

public class Q5 {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException(){}
    }

    public class OverFlowIntQueueException extends RuntimeException {
        public OverFlowIntQueueException(){}
    }

    public Q5(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch(OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws IntQueue.OverFlowIntQueueException {
        if(num >= max) {
            throw new OverFlowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if(rear == max) {
            rear = 0;
        }
        System.out.println("프론트"+front);
        System.out.println("리어"+rear);
        return x;
    }

    public int deque() throws IntQueue.EmptyIntQueueException {
        if(num <= 0) {
            throw new EmptyIntQueueException();
        }
        int x = que[front++];
        num--;
        if(front == max) {
            front = 0;
        }
        return x;
    }

    public int peek() throws EmptyIntQueueException {
        if(num <=0) {
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    public int search(int x) {
        for(int i = 0 ;i < num ; i++) {
            if(que[(i + front) % capacity()] == x) {
                return i + 1;
            }
        }
        return 0;
    }

    public int indexOf(int x) {
        for(int i = 0 ; i < num ; i++) {
            int idx = (i + front) % max;
            if(que[idx] == x) {
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
            System.out.println("큐가 비어 있습니다.");
        } else {
            for(int i = 0 ; i < num ; i++) {
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }
}
