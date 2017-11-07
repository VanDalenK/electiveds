package za.ac.cput.cajun.LaurenSidonie;

public class TrainLinkedList {

    private static class Node {
        private Train data;
        private Node nextLink;

        public Node(Train data, Node nextLink) {
            this.data = data;
            this.nextLink = nextLink;
        }

        public Node(Train data) {
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

    public void addAtHead(Train data) {
        head = new Node(data, head);
        size++;
    }

    // Insert element at the end

    public void addToTail(Train data) {
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

    public void addSorted(Train data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getTrainId() < curr.data.getTrainId()) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.data.getTrainId() > data.getTrainId()) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }

    // Linked list traversal

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getModel() + ", " + temp.data.getTrainId() + ", ");
            temp = temp.nextLink;
        }
    }

}
