package main.java.org.example.Algorithms.Easy.Solved;

import main.java.org.example.Algorithms.Easy.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode result = new ListNode();
        ListNode head = result;
        ArrayList<Integer> arr = new ArrayList<>();
        while (list1 != null) {
            arr.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            arr.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            result.val = arr.get(i);
            if (i != arr.size() - 1) {
                result.next = new ListNode();
            }
            result = result.next;
        }
        return head;
    }
}

