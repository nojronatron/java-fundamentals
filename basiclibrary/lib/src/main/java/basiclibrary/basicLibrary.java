/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

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

    public static String analyzeWeatherData(int[][] oneMonthWxData) {

        //  use a HashSet<Integer> to track unique values
        HashSet<Integer> wxHashSet = new HashSet<>();
        for(int[] week: oneMonthWxData) {
            for(int day: week) {
                wxHashSet.add(day);
            }
        }

        //  find the min and max values
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;

        for (int tempTemp : wxHashSet) {
            minTemp = Math.min(tempTemp, minTemp);
            maxTemp = Math.max(tempTemp, maxTemp);
        }

        StringBuilder resultString = new StringBuilder();
        resultString.append("High: ").append(maxTemp).append("\n");
        resultString.append("Low: ").append(minTemp).append("\n");

        //  iterate from min value to max value and dump MISSING values into a string
        int currentTemp = minTemp;
        int nextTemp = 0;

        for (int idx=minTemp; idx <= maxTemp; idx++) {
            if (wxHashSet.contains(idx)) {
                ; // do nothing if found
            } else {
                // IntelliJ IDEA suggestion using chained append methods
                resultString.append("Never saw temperature: ").append(idx).append("\n");
            }
        }

        //  return that skipped values string to the caller
        return resultString.toString();
    }

    public static String tally(List<String> votes) {
        //  tally the votes and return string with the string that got the most votes
        String mostVotes = " ";

        return mostVotes;
    }
}
