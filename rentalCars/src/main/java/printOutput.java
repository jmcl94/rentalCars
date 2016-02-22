import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Jamie on 20/02/2016.
 *
 * Creates the HTML String that will be sent to the api request.
 * Each method has different String setup due to the different
 * layouts needed.
 */
public class printOutput {

    public static String printPrice(List<Vehicle> veh){
        Comparator comparator = new myPriceComparator();
        Collections.sort(veh, comparator);
        StringBuilder s = new StringBuilder();

        s.append("<table style=\"width:100%\">");
        s.append("<tr><td>No.</td> <td>Vehicle Name</td> <td>Price</td></tr>");

        for(int i = 0; i < veh.size(); i++){
            int index = i+1;
            s.append("<tr><td>" + index + "</td><td>" + veh.get(i).getName() +
                    "</td><td>" + veh.get(i).getPrice() +"</td></tr>");
        }
        return s.toString();
    }
    public static String printSippScore(List<Vehicle> veh){
        Comparator comparator = new mySippScoreComparator();
        Collections.sort(veh, comparator);
        StringBuilder s = new StringBuilder();
        s.append("<table style=\"width:100%\">");
        s.append("<tr><td>No.</td><td>Vehicle Name</td><td>Sipp</td><td>Car Type</td>" +
                "<td>Doors</td><td>Transmission</td><td>Fuel</td><td>Air Con</td></tr>");
        for(int i = 0; i < veh.size(); i++){
            int index = i+1;
            s.append("<tr><td>" + index + "</td><td>" + veh.get(i).getName() +
                    "</td> - <td>" + veh.get(i).getSipp() + "</td><td>" +
                    veh.get(i).getType() + "</td><td>" +
                    veh.get(i).getSeats() + "</td><td>" +
                    veh.get(i).getTransmission() + "</td><td>" +
                    veh.get(i).getFuel() + "</td><td>" +
                    veh.get(i).getAircon() + "</td></tr>");
        }
        return s.toString();
    }
    public static String printRating(List<Vehicle> veh){
        Comparator comparator = new myRatingComparator();
        Collections.sort(veh, comparator);
        StringBuilder s = new StringBuilder();
        s.append("<table style=\"width:100%\">");
        s.append("<tr><td>No.</td><td>Vehicle Name</td><td>Car Type</td><td>Supplier</td><td>Rating /10</td></tr>");

        for(int i = 0; i < veh.size(); i++) {
            int index = i + 1;
            s.append("<tr><td>" + index + "</td><td>" + veh.get(i).getName() +
                    "</td><td>" + veh.get(i).getType() + "</td><td>" +
                    veh.get(i).getSupplier() + "</td><td>" +
                    veh.get(i).getRating() + "</td></tr>");
        }
        return s.toString();
    }
    public static String printOS(List<Vehicle> veh){
        Comparator comparator = new myOSComparator();
        Collections.sort(veh, comparator);
        StringBuilder s = new StringBuilder();
        s.append("<table style=\"width:100%\">");
        s.append("<tr><td>No.</td><td>Vehicle Name</td><td>Vehicle Score</td><td>Rating</td><td>Overall Score</td></tr>");

        for(int i = 0; i < veh.size(); i++) {
            int index = i + 1;
            s.append("<tr><td>" + index + "</td><td>" + veh.get(i).getName() +
                    "</td><td>" + veh.get(i).getSippScore() + "</td><td>" +
                    veh.get(i).getRating() + "</td><td>" +
                    veh.get(i).getOverallScore() + "</td></tr>");
        }
        return s.toString();
    }
}
