package com.problems.epi.test.chapter5;

import com.problems.epi.code.chapter5.SudokuCheckerProblem;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nanya on 12/20/17.
 */
public class SudokuCheckerProblemTest {

    @Test
    public void sudokuCheckerProblemTest() {
        int[][] input = { {5, 3, 0, 0, 0, 1, 8, 0, 0}, { 2, 0, 0, 0, 4, 9, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0 },
                {7, 9, 1, 0, 0, 0, 0, 0, 0}, {4, 2, 0, 0, 0, 0, 1, 5, 0}, {0, 0, 0, 0, 0, 0, 0, 8, 9}, {0, 0, 0, 0, 0, 0, 0, 2, 0},
                {0, 0, 4, 0, 0, 0, 0, 0, 5}, {8, 0, 0, 0, 0, 0, 3, 0, 6} };

        int[][] input2 = { {0, 0, 0, 0, 0, 0, 0, 0, 0}, { 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0 },
                {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0} };

        boolean expected = true;
        boolean actual = SudokuCheckerProblem.isValidSudoku(input2);
        Assert.assertEquals(expected, actual);
    }
}
