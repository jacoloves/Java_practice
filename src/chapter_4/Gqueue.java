package chapter_4;

public class Gqueue<E> {
    private int max;
    private int num;
    private int front;
    private int rear;
    private E[] que;

    public static class EmptyGQueueException extends RuntimeException{
        public EmptyGQueueException(){}
    }

    public static class OverflowGQueueException extends RuntimeException{
        public OverflowGQueueException(){}
    }

    public Gqueue(int capacity)
    {
        num = front = rear = 0;
        max = capacity;
        try {
            que = (E[])new Object[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public E enque(E x) throws OverflowGQueueException{
        if(num >= max)
            throw new OverflowGQueueException();
        que[rear++] = x;
        num++;
        if(rear == max)
            rear = 0;
        return x;
    }

    public E deque() throws EmptyGQueueException{
        if(num <= 0)
            throw new EmptyGQueueException();
        E x = que[front++];
        num--;
        if(front == max)
            front = 0;
        return x;
    }

    public E peek() throws EmptyGQueueException{
        if(num <= 0)
            throw new EmptyGQueueException();
        return que[front];
    }

    public int indexOf(E x){
        for (int i = 0; i < num; i++){
            int idx = (i + front) % max;
            if(que[idx] == x)
                return idx;
        }
        return -1;
    }

    public void clear(){
        num = front = rear = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull(){
        return num >= max;
    }

    public void dump(){
        if(num <= 0)
            System.out.println("キューは空です。");
        else
            for (int i = 0; i < num; i++)
                System.out.printf(que[(i + front) % max] + " ");
        System.out.println();
    }






}
