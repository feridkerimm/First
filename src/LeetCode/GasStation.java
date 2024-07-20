package LeetCode;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {4, 5, 3, 2, 1};
        int currentGas = 0;
        int totalGas = 0;
        int totalCost = 0;
        int start = 0;
        int size = gas.length;

        for (int i = 0; i < size; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                start = i + 1;
                currentGas = 0;
            }
        }
        if (totalGas >= totalCost) {
            System.out.println(start);
        } else {
            System.out.println("Empty tank.");
        }

    }
}
