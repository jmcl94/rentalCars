import java.util.Comparator;

/**
 * Created by Jamie on 20/02/2016.
 * Sets the Overall Score list to be in descending order
 */
public class myOSComparator implements Comparator<Vehicle>{

    public int compare(Vehicle o1, Vehicle o2) {

        float o1OS = o1.getOverallScore();
        float o2OS = o2.getOverallScore();
        if (o2OS < o1OS)
            return -1;
        if (o2OS > o1OS)
            return 1;
        return 0;
    }
}
