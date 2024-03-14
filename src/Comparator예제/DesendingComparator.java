package Comparator예제;

import java.util.Comparator;

public class DesendingComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price < o2.price) return 1;
        else if (o1.price == o2.price)
            return o1.name.compareTo(o2.name);
        else  return -1;
    }
}
