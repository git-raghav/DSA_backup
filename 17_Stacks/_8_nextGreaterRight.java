import java.util.Stack;

public class _8_nextGreaterRight {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> stack = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){ //for next left, reverse this condition
            //step1
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){ //next smaller k liye reverse this
                stack.pop();
            }
            //step2
            if(stack.isEmpty()) nxtGreater[i] = -1;
            else nxtGreater[i] = arr[stack.peek()];
            //step3
            stack.push(i);
        }

        for(int i = 0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + ", ");
        }
    }
}
//4 version
//next greater right
//next smaller right
//next greater left
//next smaller left
