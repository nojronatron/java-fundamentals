/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class basicLibraryTest {
    @Test void libraryRollMethodReturnsCorrectLengthArray() {
        // arrange
        basicLibrary classUnderTest = new basicLibrary();
        int rolls = 4;
        int expectedArrayLength = 4;

        // act
        int[] actualResult = classUnderTest.roll(rolls);

        // assert
        assertTrue(actualResult.length == expectedArrayLength, "roll(4) should return an array with length of 4");
    }

    @Test void libraryRollMethodReturnsArrayWithNumsOneThruSix() {
        // arrange
        basicLibrary classUnderTest = new basicLibrary();
        int rolls = 4;

        // act
        int[] actualResult = classUnderTest.roll(rolls);
        int truthTracker = 0;

        for (int item: actualResult) {
            if (item > 0 && item < 7) {
                truthTracker++;
            }
        }

        // assert
        assertTrue(truthTracker == rolls, "roll(4) should return digits 1 through 6");
    }

    @Test void libraryRollContainDuplicatesTests() {
        // arrange
        basicLibrary classUnderTest = new basicLibrary();
        int rolls=6;

        // act => contains duplicates
        int[] dupeRolls = { 1, 2, 3, 4, 5, 3};
        boolean containsDupesTest = classUnderTest.containsDuplicates(dupeRolls);

        // act => all unique
        int[] uniqueRolls = { 6, 5, 4, 3, 2, 1 };
        boolean allUniqueTest = classUnderTest.containsDuplicates(uniqueRolls);

        // assert
        assertTrue(containsDupesTest, "Dice rolls contains duplicates returns true.");
        assertFalse(allUniqueTest, "Dice rolls all unique returns false");
    }

    @Test void libraryReturnsAverageValueOfAnArray() {
        // arrange
        int[] inputArray = { 1, 2, 3, 4, 5, 6 };
        float expectedResult = 3.5f;

        // act
        float actualResult = basicLibrary.averageValueOfArray(inputArray);

        // assert
        assertEquals(expectedResult, actualResult, "");
    }

    @Test void libraryReturnsLowestAverageInMultiDimensionalArray() {
        // arrange
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        int[] expectedResult = {55, 54, 60, 53, 59, 57, 61};

        // act
        int[] actualResult = basicLibrary.lowestAverageArrayIn2dArr(weeklyMonthTemperatures);

        // assert
        for(int idx=0; idx < expectedResult.length; idx++) {
            assertEquals(expectedResult[idx], actualResult[idx]);
        }
    }
    @Test void libraryReturnsValidAnalyzedWeatherDataAsString() {
        // arrange
        String expectedResult = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n";

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        // act
        String actualResult = basicLibrary.analyzeWeatherData(weeklyMonthTemperatures);
        System.out.println("expected:\n" + expectedResult);
        System.out.println("\nactual:\n" + actualResult);

        //  assert
        assertTrue(actualResult.length() > 0);
        assertEquals(expectedResult, actualResult);
    }

    @Test void libraryReturnsMostVotesWinnerName() {
        // arrange

        // act
        
        // assert
        fail();
    }
}
