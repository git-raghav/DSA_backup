public class _2_circularQueueUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1; //if there was some element then rear would contain some +ve value
        }

        public static boolean isFull() {
            return (rear+1) % size == front; //Queue is Full if rear is just behind front in circular manner
        }

        public static void add(int data) {
            if(isFull()) return; //list full
            if(front == -1) front = 0; // only for first element insert
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if(isEmpty()) return -1; //list empty
            int result = arr[front];
            if(rear == front){
                rear = front = -1;// only 1 element was there
            } else {
                front = (front+1) % size;
            }
            return result;
        }

        public static int peek() {
            if(isEmpty()) return -1; //list empty
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.add(10);
        q.add(11);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
