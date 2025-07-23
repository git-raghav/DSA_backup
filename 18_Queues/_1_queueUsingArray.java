public class _1_queueUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1; //if there was some element then rear would contain some +ve value
        }

        public static void add(int data) {
            if(rear == size-1) return; //list full, rear pointing to last element
            rear += 1;
            arr[rear] = data;
        }

        public static int remove() {
            if(isEmpty()) return -1; //list empty
            int front = arr[0];
            for(int i = 0; i < rear; i++){ //i < rear bcuz rear-1 p rear ka samaan daldo
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        public static int peek() {
            if(isEmpty()) return -1; //list empty
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
