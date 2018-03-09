package com.problems.epi.code.sorting.learning;

import com.util.ListNode;

public class InsertionSort {

    /**
     * Time: O(n^2)
     * Space: O(1)
     */
    public static int[] insertionSort_Arrays(int[] A) {
        if(A == null || A.length == 0) return null;
        for(int i = 1; i < A.length; i++) { // start from 1 because you assume A[0] is the sorted list while A[1]..A[n-1] is unsorted
            int value = A[i];
            int hole = i;
            while(hole > 0 && A[hole - 1] > value) {
                A[hole] = A[hole - 1];
                hole--;
            }
            A[hole] = value;
        }
        return A;
    }

    /**
     * The main difference in this insertion sort algo is that insertion is quick and easy
     * Takes O(1) space. Although time is still O(n^2)
     * When a value is misplaced the sorted portion of the list is traversed up until
     * the preceding element before the correct position is found.
     * The LinkedList opeartion to insert an element in correct position is:
     * Delete the element from its current position
     * Insert it into the new position (similar to insertBefore() of MyLinkedList)
     */
    public static ListNode insertionSort_LinkedList(ListNode<Integer> head) {
        if(head == null || head.next == null) return head;
        ListNode<Integer> dummy = new ListNode(0);
        dummy.next = head;
        ListNode<Integer> curr = head;
        while(curr != null && curr.next != null) {
            if(curr.data <= curr.next.data) {
                curr = curr.next;
                continue;
            }
            ListNode<Integer> hole = curr.next;
            ListNode<Integer> pre = dummy;
            while(pre.next != null && pre.next.data < hole.data) pre = pre.next;
            ListNode temp = pre.next;
            pre.next = hole;
            curr.next = hole.next;
            hole.next = temp;
        }
        return dummy.next;
    }
}