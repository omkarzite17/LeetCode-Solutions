package DSA.Array_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(5);
        // list.add(67);
        // list.add(34);
        // list.add(98);
        // list.add(12);
        // list.add(45);
        // list.add(23);
        // list.add(56);
        // list.add(78);
        // list.add(90);
        // list.add(11);
        // System.out.println(list.size());
        // System.out.println(list.contains(34));
        // System.out.println(list.remove(1));
        // System.out.println(list.contains(90));
        // System.out.println(list.set(0, 99));
        // System.out.println("Original List: " + list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // Get an item at an index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)+"  ");
        }
        System.out.println("Original List: " + list);
    }
}
