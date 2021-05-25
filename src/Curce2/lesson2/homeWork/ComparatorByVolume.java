package curce2.lesson2.homeWork;

import java.util.Comparator;

public class ComparatorByVolume implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getVolume()-o1.getVolume();
    }
}
