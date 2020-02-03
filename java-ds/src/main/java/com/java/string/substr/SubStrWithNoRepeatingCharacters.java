package com.java.string.substr;

import java.util.Arrays;

public class SubStrWithNoRepeatingCharacters {
    public static void main(String[] args) {

        String input = "amanda"; // mand = 4
        input = "GEEKSFORGEEKS"; // EKSFORG = 7
        input = "sachin"; // sachin = 6
        input = "ABCA"; // ABC = 3
        input = "ABCAD"; // BCAD = 4
        input = "AMAANDA";
        int currentLength = 1;
        int maxLength = 1;
        int charLastIndex;
        int currentIterationIndex;
        int visitedCharsIndex[] = new int[256];
        Arrays.fill(visitedCharsIndex, -1);
        visitedCharsIndex[input.charAt(0)] = 0;

        int begin = 0;
        int end = 0;
        for (currentIterationIndex = 1; currentIterationIndex < input.length(); currentIterationIndex++) {
            charLastIndex = visitedCharsIndex[input.charAt(currentIterationIndex)];

            if (charLastIndex == -1 || currentIterationIndex - currentLength > charLastIndex) {
                currentLength++;
            } else {
                if (maxLength < currentLength) {
                    begin = currentIterationIndex - currentLength; // adjust begin to post the previous last char position
                    end = currentIterationIndex;

                    maxLength = currentLength;
                    currentLength = currentIterationIndex - charLastIndex;// count length after the charLastIndex
                } else {
                    currentLength = currentIterationIndex - charLastIndex;// count length after the charLastIndex
                }
            }
            visitedCharsIndex[input.charAt(currentIterationIndex)] = currentIterationIndex;
        }
        if (maxLength < currentLength) { // to handle if all are unique chars or a larger substring at the end only.
            begin = currentIterationIndex - currentLength; // adjust begin to post the previous last char position
            end = currentIterationIndex;

            maxLength = currentLength;
        }
        System.out.println("longest substring between: " + begin + " & " + end);
        System.out.println(Arrays.copyOfRange(input.toCharArray(), begin, end));
        System.out.println(maxLength);
    }
}
