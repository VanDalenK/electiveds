package za.ac.cput.cajun.LaurenSidonie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainDriver {

    public static void main(String[] args) {
        Train a = new Train(10011, "German");
        Train b = new Train(20022, "American");
        Train c = new Train(30033, "Japanese");

        // Linked List

        TrainLinkedList list = new TrainLinkedList();
        list.addAtHead(a);
        list.addToTail(b);
        list.addSorted(c);

        // Array List

        List<Train> arrList = new ArrayList<Train>();
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
