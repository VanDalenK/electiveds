package za.ac.cput.cajun.GarethBock;

public class StudentLinkedList {

    private static class Node {
        private Student data;
        private Node nextLink;

        public Node(Student data, Node nextLink) {
            this.data = data;
            this.nextLink = nextLink;
        }

        public Node(Student data) {
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

    public void addAtHead(Student data) {
        head = new Node(data, head);
        size++;
    }

    // Insert element at the end

    public void addToTail(Student data) {
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

    public void addSorted(Student data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getStudentNo() < curr.data.getStudentNo()) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.data.getStudentNo() > data.getStudentNo()) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }

    // Linked list traversal

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getName() + ", " + temp.data.getStudentNo() + ", ");
            temp = temp.nextLink;
        }
    }
}
