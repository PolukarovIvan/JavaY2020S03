package ru.PolukarovIvan.lab_29;

public class InternetOrder implements Order {
    private Node head = null, tail = null;
    private int size = 0;

    private class Node {
        private Node prev;
        private Node next;
        private Item item;

        public Node(Node prev, Node next, Item item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }



    @Override
    public boolean add(Item item) {
        if (head == null) {
            head = tail = new Node(null, null, item);
        } else {
            Node prev = head;
            Node next = head.next;
            while(next != null){
                prev = next;
                next = next.next;
            }
            prev.next = new Node(prev, null, item);
        }
        size += 1;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int find(String itemName) {
        Node current = head;
        int quantity = 0;
        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                quantity += 1;
            }
            current = current.next;
        }
        return quantity;
    }

    @Override
    public Item[] getItems() {
        Item[] order = new Item[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            order[i] = current.item;
            current = current.next;
        }
        return order;
    }

    @Override
    public boolean remove(String itemName) {
        Node current = head;
        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                if (current.prev == null) {
                    head = current.next;
                } else {
                    current.prev = current.next;
                }
                size -= 1;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int index(String itemName) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                if (current.prev == null) {
                    head = current.next;
                } else {
                    current.prev = current.next;
                }
                count += 1;
            }
            current = current.next;
        }
        size -= count;
        return count;
    }

    @Override
    public Item[] sortedItemByCostDesc() {
        return new Item[0];
    }

    @Override
    public int costTotal() {
        Node current = head;
        int total = 0;
        while (current != null) {
            total += current.item.getPrice();
            current = current.next;
        }
        return total;
    }

    @Override
    public String[] itemsNames() {
        String[] items = new String[size];
        Node current = head;
        int count = 0;
        while (current != null) {
            items[count] = current.item.getName();
            current = current.next;
            count += 1;
        }

        return items;
    }
}