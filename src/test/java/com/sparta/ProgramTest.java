package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTest {
    @Test
    @DisplayName("Given Array {2,1,1,7,6}, sort it in ascending order")
    public void sortAscend1(){
        Integer[] input={2,1,1,7,6};
        Integer[] expectedAscending={1,1,2,6,7};
        Integer[] resultAscending=SortingAlgorithm.bubbleSortAscending(input);
        Assertions.assertArrayEquals(expectedAscending, resultAscending);

    }

    @Test
    @DisplayName("Given Array {2,2,2,2,2}, sort it in ascending order ")
    public void sortAscend2(){
        Integer[] expected={2,2,2,2,2};
        Integer[] input={2,2,2,2,2};
        Integer[] result=SortingAlgorithm.bubbleSortAscending(input);
        Assertions.assertArrayEquals(expected, result);

    }
    @Test
    @DisplayName("Given Array {2,1}, sort it in ascending order ")
    public void sortAscend3(){
        Integer[] expected={1,2};
        Integer[] input={2,1};
        Integer[] result=SortingAlgorithm.bubbleSortAscending(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Given Array {7,6,2,1,1}, sort it in ascending order ")
    public void sortAscend4(){
        Integer[] expected={1,1,2,6,7};
        Integer[] input={7,6,2,1,1};
        Integer[] result=SortingAlgorithm.bubbleSortAscending(input);
        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    @DisplayName("Given Array {2,1,1,7,6}, sort it in Descending order")
    public void sortDescend1(){
        Integer[] input={2,1,1,7,6};
        Integer[] expected={7,6,2,1,1};
        Integer[] result=SortingAlgorithm.bubbleSortDescending(input);
        Assertions.assertArrayEquals(expected, result);

    }

    @Test
    @DisplayName("Given Array {2,2,2,2,2}, sort it in Descending order ")
    public void sortDescend2(){
        Integer[] expected={2,2,2,2,2};
        Integer[] input={2,2,2,2,2};
        Integer[] result=SortingAlgorithm.bubbleSortDescending(input);
        Assertions.assertArrayEquals(expected, result);

    }
    @Test
    @DisplayName("Given Array {1,2}, sort it in Descending order ")
    public void sortDescend3(){
        Integer[] expected={2,1};
        Integer[] input={1,2};
        Integer[] result=SortingAlgorithm.bubbleSortDescending(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Given Array {1,1,2,6,7}, sort it in Descending order ")
    public void sortDescend4(){
        Integer[] expected={7,6,2,1,1};
        Integer[] input={1,1,2,6,7};
        Integer[] result=SortingAlgorithm.bubbleSortDescending(input);
        Assertions.assertArrayEquals(expected, result);
    }
}
