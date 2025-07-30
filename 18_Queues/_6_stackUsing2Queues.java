import java.util.*;
public class _6_stackUsing2Queues {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty(); //dono empty honi chahiye
        }

        public static void push(int data){
            if(!q1.isEmpty()) q1.add(data); //jisme abhi elements h usme hi push karo or first element h toh q2 m daaldo, q1 m bhi daalskte h
            else q2.add(data);
        }

        public static int pop(){
            if(isEmpty()) return -1; //bothh empty
            int top = -1;

            //case 1 when elements are in q1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()) break; //agr element nikal ke and queue empty hogyi that means vo humara last element tha, or usko vapis push nhi krna
                    q2.add(top);
                }
            } else { //case 2 when elements are in q2
                while(!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()) break;
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek(){
            if(isEmpty()) return -1;
            int top = -1;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()) {
                    top = q1.remove(); //yha pop ki if vali condition esliye nhi h kyuki hume last element bhi push krna h, loi element chodhna nhi h
                    q2.add(top);
                }
            } else {
                while(!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.peek();
        s.isEmpty();
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
