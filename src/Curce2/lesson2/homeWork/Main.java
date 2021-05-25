package curce2.lesson2.homeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car lexus = new Car("Lexus", "RX350", 2016, 1, 50);
        Car toyota = new Car("Toyota", "Camry", 2014, 3, 200);
        Car bmw = new Car("BMW", "Y3", 2015, 2, 150);
        List<Car> list = new ArrayList<>();
        list.add(toyota);
        list.add(lexus);
        list.add(bmw);

        //Реализация интерфейса Comparable
        Collections.sort(list);
        for (Car tmp : list) {
            System.out.println(tmp);
        }
        System.out.println("!!!!!!!!!!!");
        //Реализация интерфейса Comparator
        Collections.sort(list, new ComparatorByModel());
//        Collections.sort(list,new ComparatorBySpeed());
//        Collections.sort(list,new ComparatorByVolume());
//        Collections.sort(list,new ComparatorByModel());

        for (Car tmp : list) {
            System.out.println(tmp);
        }


    }

}
