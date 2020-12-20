package ru.PolukarovIvan.lab_30;

import ru.PolukarovIvan.lab_26.ex2.LinkedQueue;

public class ListNode {
    ListNode next;
    ListNode prev;
    ListNode MenuItem;

    public ListNode(ListNode next, ListNode prev, ListNode menuItem) {
        this.next = next;
        this.prev = prev;
        MenuItem = menuItem;
    }

}
