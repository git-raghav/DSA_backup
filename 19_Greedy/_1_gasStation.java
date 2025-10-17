public class _1_gasStation {
    public static int calc(int gas[], int cost[]) {
        // check if soln exists
        int totalGas = 0;
        int totalCost = 0;
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1; // no soln exists

        // if soln exists
        int currGas = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++){
            currGas += (gas[i] - cost[i]);
            if(currGas < 0){
                start = i + 1;
                currGas = 0;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        System.out.println("Start at index: " + calc(gas, cost));
    }
}
