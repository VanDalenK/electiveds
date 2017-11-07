package za.ac.cput.cajun.GarethBock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentDriver {

    public static void main(String[] args) {
        Student a = new Student(1, "Gareth", 20);
        Student b = new Student(2, "Lauren", 27);
        Student c = new Student(3, "Keenen", 21);

        // Linked List

        StudentLinkedList list = new StudentLinkedList();
        list.addAtHead(a);
        list.addToTail(b);
        list.addSorted(c);

        // Array List

        List<Student> arrList = new ArrayList<Student>();
        arrList.add(a);
        arrList.add(b);
        arrList.add(c);

        // Hash set

        Set hashSet = new HashSet();
        hashSet.add(a);
        hashSet.add(b);
        hashSet.add(c);
    }

}
