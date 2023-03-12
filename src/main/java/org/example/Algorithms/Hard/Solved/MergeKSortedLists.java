package main.java.org.example.Algorithms.Hard.Solved;

import main.java.org.example.Algorithms.Hard.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                break;
            } else if (i == lists.length - 1) {
                return null;
            }
        }
        ListNode result = new ListNode();
        ListNode head = result;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                arr.add(lists[i].val);
                lists[i] = lists[i].next;
            }
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

