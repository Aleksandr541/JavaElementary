package Curce2.leson1.HomeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(9);
        System.out.println(arrayList + " " + arrayList.size());
        System.out.println(arrayList.add(99));
        arrayList.remove(arrayList.get(2));
        System.out.println(arrayList);
        System.out.println("!!!!!!!!!");

        List<Object> list = new LinkedList<>();
        list.addAll(arrayList);
        list.remove(3);
        System.out.println(list + " " + list.size());
        list.clear();
        System.out.println(list);
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.set(i, 0);
            } else if (i % 2 > 0) {
                list.set(i, 1);
            }
        }
        System.out.println(list);
    }
}



