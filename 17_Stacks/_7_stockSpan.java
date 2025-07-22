import java.util.Stack;

public class _7_stockSpan {
    public static void calc(int stocks[], int span[]) {
        Stack<Integer> stack = new Stack<Integer>();
        span[0] = 1; //span of first element is always 1
        stack.push(0); //push the index of first element

        for(int i = 1; i < stocks.length; i++){
            int currprice = stocks[i];
            while(!stack.isEmpty() && currprice >= stocks[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i] = i+1;
            } else {
                span[i] = i-stack.peek();
            }
            stack.push(i);
        }
        return;
    }

    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        calc(stocks, span);
        for(int i = 0; i < span.length; i++) {
            System.out.print(span[i] + ", ");
        }
    }
}
