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


}
