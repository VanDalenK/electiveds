package za.ac.cput.cajun.KeenenVanDalen;

public class CarLinkedList {

    private static class Node {
        private Car data;
        private Node nextLink;

        public Node(Car data, Node nextLink) {
            this.data = data;
            this.nextLink = nextLink;
        }

        public Node(Car data) {
            this.data = data;
            this.nextLink = null;
        }
    }

    private Node head;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Insert element at the start

    public void addAtHead(Car data) {
        head = new Node(data, head);
        size++;
    }

    // Insert element at the end

    public void addToTail(Car data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (head == null) {
            head = newNode;
        }

        while (curr.nextLink != null) {
            curr = curr.nextLink;
        }

        curr.nextLink = newNode;
    }

    // Insert element in sorted order

    public void addSorted(Car data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getVinNo() < curr.data.getVinNo()) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.data.getVinNo() > data.getVinNo()) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }

    // Linked list traversal

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getBrand() + ", " + temp.data.getVinNo() + ", ");
            temp = temp.nextLink;
        }
    }
}
