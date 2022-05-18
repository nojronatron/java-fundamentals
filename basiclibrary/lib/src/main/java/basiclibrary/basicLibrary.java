/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;
import java.util.Random;

public class basicLibrary {
    public int[] roll (int numRolls) {
        Random rand = new Random();
        int[] result = new int[numRolls];

        for (int idx=0; idx < numRolls; idx++) {
            int rollVal = rand.nextInt(6);
            rollVal++;
            result[idx] = rollVal;
        }

        return result;
    }
    public boolean containsDuplicates(int[] diceRoll) {
        int rollCount = diceRoll.length;

        // slow-loop through each diceRoll entry
        for(int idx=0; idx < rollCount; idx++) {

            // fast-loop through each diceRoll entry for comparison/dupe check
            for(int side=1; side < 6; side++) {

                // check for duplicates and fail-fast if one is found
                if (idx != side && diceRoll[idx] == diceRoll[side]) {
                    return true;
                }
            }
        }

        // no dupes were found so return false
        return false;
    }

    public static float averageValueOfArray(int[] inputArray) {
        float result = 0f;
        int accumulator = 0;

        for(int item: inputArray) {
            accumulator += item;
        }

        result = (float) accumulator / inputArray.length;

        return result;
    }

    public static int[] lowestAverageArrayIn2dArr(int[][] inputMDArr) {
        int prevAccumulator = Integer.MAX_VALUE;
        int smallestArrayOuterID = 0;
        float smallestAverage = Float.MAX_VALUE;

        for (int outer=0; outer < inputMDArr.length; outer++){
            int accumulator = 0;

            for (int inner=0; inner < inputMDArr[outer].length; inner++) {
                accumulator += inputMDArr[outer][inner];
            }

            float thisAverage = (float) accumulator / inputMDArr[outer].length;

            if (thisAverage < smallestAverage) {
                smallestArrayOuterID = outer;
                smallestAverage = thisAverage;
            }
        }

        return inputMDArr[smallestArrayOuterID];
    }
}