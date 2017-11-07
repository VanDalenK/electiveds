package za.ac.cput.cajun.KeenenVanDalen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarDriver {

    public static void main(String[] args) {
        Car a = new Car(1001, "Merc", 21230);
        Car b = new Car(2002, "BMW", 27541);
        Car c = new Car(3003, "VW", 21852);

        // Linked List

        CarLinkedList list = new CarLinkedList();
        list.addAtHead(a);
        list.addToTail(b);
        list.addSorted(c);

        // Array List

        List<Car> arrList = new ArrayList<Car>();
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
