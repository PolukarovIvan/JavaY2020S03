package ru.PolukarovIvan.lab_30;

import ru.PolukarovIvan.lab_26.ex2.LinkedQueue;

import java.io.Serializable;

public class ListNode implements Serializable {
    ListNode next;
    ListNode prev;
    ListNode MenuItem;

    public ListNode(ListNode next, ListNode prev, ListNode menuItem) {
        this.next = next;
        this.prev = prev;
        MenuItem = menuItem;
    }

}
