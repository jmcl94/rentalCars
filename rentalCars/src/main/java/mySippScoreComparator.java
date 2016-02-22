import java.util.Comparator;

/**
 * Created by Jamie on 20/02/2016.
 *
 * Sets the Sipp Score list to be in ascending order
 *
 */
public class mySippScoreComparator implements Comparator<Vehicle> {
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getSippScore() - o2.getSippScore();
    }
}
