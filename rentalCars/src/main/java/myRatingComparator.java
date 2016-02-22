import java.util.Comparator;

/**
 * Created by Jamie on 20/02/2016.
 * Sets the Rating list to be in descending order
 */
public class myRatingComparator implements Comparator<Vehicle> {
    public int compare(Vehicle o1, Vehicle o2) {
        float o1Rating = o1.getRating();
        float o2Rating = o2.getRating();
        if (o2Rating < o1Rating)
            return -1;
        if (o2Rating > o1Rating)
            return 1;
        return 0;
    }
}
