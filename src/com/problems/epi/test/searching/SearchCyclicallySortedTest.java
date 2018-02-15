package com.problems.epi.test.searching;

import com.problems.epi.code.searching.SearchCyclicallySorted;
import org.junit.Test;

public class SearchCyclicallySortedTest {

    @Test
    public void findMinTest() {
        int[] in = {378, 478, 550, 678, 102, 112, 234};
        int expected = 4;
        int actual = SearchCyclicallySorted.findMin(in);
        assert(expected == actual);
        System.out.println(actual);
    }

    @Test
    public void findMaxTest() {
        int[] in = {378, 478, 550, 678, 102, 112, 234};
        int expected = 3;
        int actual = SearchCyclicallySorted.findMax(in);
        assert(expected == actual);
        System.out.println(actual);
    }

    @Test
    public void findKTest() {
        int[] in = {378, 478, 550, 678, 102, 112, 234};
        int expected = 1;
        int actual = SearchCyclicallySorted.findK(in, 478);
        assert(expected == actual);
        System.out.println(actual);
    }
}
