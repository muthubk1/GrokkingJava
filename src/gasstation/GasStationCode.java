package gasstation;

import java.util.Scanner;

public class GasStationCode {

    private static final String IMPOSSIBLE = "impossible";


    public static String GasStation(String[] strArr) {
        int circuitSize = strArr.length - 1;
        System.out.println("circuitSize " + circuitSize);

        int[] gas = new int[circuitSize];
        int[] costs = new int[circuitSize];

        for (int x = 1; x <= circuitSize; x++) {
            String[] gasAndCost = strArr[x].split(":");
            gas[x - 1] = Integer.parseInt(gasAndCost[0]);
            costs[x - 1] = Integer.parseInt(gasAndCost[1]);
        }

        for (int station = 0; station < circuitSize; station++) {
            String startIndex = getStartIndex(gas, costs, station);
            if (!IMPOSSIBLE.equals(startIndex)) return startIndex;
        }

        // code goes here
        return IMPOSSIBLE;
    }

    private static String getStartIndex(int[] gas, int[] costs, int startStation) {
        int circuitSize = gas.length;
        int nextStation = startStation < (circuitSize - 1) ? startStation + 1 : 0;
        int currentStation = startStation;
        int tank = 0;
        for (int x = 0; x < circuitSize; x++) {
            tank = tank - costs[currentStation] + gas[currentStation];

            if (tank < 0) return IMPOSSIBLE;
            if (x == circuitSize - 1) return String.valueOf(startStation + 1);//+1 because start with zero

            nextStation = nextStation < (circuitSize - 1) ? nextStation + 1 : 0;
            currentStation = currentStation < (circuitSize - 1) ? currentStation + 1 : 0;
        }

        return IMPOSSIBLE;
    }


    public static void main(String[] args) {
        System.out.println(GasStation(new String[] {"4","3:1","2:2","1:2","0:1"}) + " == 1");
        System.out.println(GasStation(new String[] {"4","1:1","2:2","1:2","0:1"}) + " == impossible");
        System.out.println(GasStation(new String[] {"4","0:1","2:2","1:2","3:1"}) + " == 4");
    }
}
