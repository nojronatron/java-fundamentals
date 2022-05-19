# Basic Library Assignment

## Overview

This Lab work is aimed at exercising knowledge and gaining experience with:  

- Arrays in Java  
- Creating Tests in IntelliJ IDEA  
- Test-Driven Development (TDD)  
- Building Java projects using Gradle  
- Executing Gradle Tests in the Terminal  

## Project Info

Import the basicLibrary library at the top of your project file.  
Instantiate basicLibrary for this functionality:  

- instance.roll(int): Supply a number 
- instance.containsDuplicates(array): Returns true if duplicate Integer values are found within the supplied array.  

Utilize static methods on basicLibrary for these functions:  

- basicLibrary.averageValueOfArray(int[]): Returns the avg of the values within supplied array.  
- basicLibrary.lowestAverageArrayIn2dArr(int[][]): Finds the inner array with the lowest average among its values.  
- basicLibrary.analyzeWeatherData(int[][]): Returns High and Low temps within a month range, and finds temperature readings that are NOT included in the month's set of data.  
- basicLibrary.tally(ArrayList<String>): Analyzes an ArrayList of votes for various plant categories, and returns the "highest voted" one by name as a String.  

## Build and Run

1. Clone this repo  
2. CD to folder 'basiclibrary'
3. Run `gradle init`  
4. Open IntelliJ IDEA with 'IDEA .' or by UI and open the Project in the 'basiclibrary' folder.  
5. Find the Tests folder and execute the tests.  
6. Find the basicLibrary folder to view the library code.  

## Requirements

[ ] Windows, Linux, or Apple iOS
[ ] A suitable Java JDK such as Eclipse Temurin v17.0.3 JDK  

[ ] An IDE that supports Java development, like IntelliJ IDEA
[ ] A working installation of Gradle  

## Attributions

Converting an int array to an ArrayList guidance courtesy of [delfstack.com](https://www.delftstack.com/howto/java/convert-int-array-to-arraylist-java/)  
