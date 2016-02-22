import java.util.Comparator;

/**
 * Created by Jamie on 20/02/2016.
 * Sets the Price list to be in ascending order
 */
public class myPriceComparator implements Comparator<Vehicle>{


    public int compare(Vehicle o1, Vehicle o2) {

        float o1Price = o1.getPrice();
        float o2Price = o2.getPrice();
        if (o1Price < o2Price)
            return -1;
        if (o1Price > o2Price)
            return 1;
        return 0;
    }


}
