
import java.net.MalformedURLException;
import java.util.*;

/**
 * Created by Jamie on 18/02/2016.
 * Use SIPP to add Vehicle specs and calculate Sipp and overall score
 * */
public class vehicleAttributeSetter {
    public static List<Vehicle> veh ;

    public static List<Vehicle>  setVehicleAttributes() throws MalformedURLException {

        //fileParser fp = new fileParser();
        veh = fileParser.getCars();
        for (int index = 0; index<veh.size();index++) {
            veh.get(index).setSippScore(0);
            for (int i = 0; i < veh.get(index).getSipp().length(); i++) {
                char c = veh.get(index).getSipp().charAt(i);
                if (i == 0) {
                    firstLetter(c, index);
                } else if (i == 1) {
                    secondLetter(c, index);
                } else if (i == 2) {
                    thirdLetter(c, index);
                } else if (i == 3) {
                    fourthLetter(c, index);
                }
            }
            float os = veh.get(index).getRating() + veh.get(index).getSippScore();
            veh.get(index).setOverallScore(os);
        }
        testJsonData.testEmptyObjectData(veh);
        testJsonData.testSIPP(veh);
        return veh;

    }

    public static void firstLetter(char c, int index) {
        String type;
        if (c == 'M')
            veh.get(index).setType("Mini");
        else if (c == 'E')
            veh.get(index).setType("Economy");
        else if (c == 'C')
            veh.get(index).setType("Compact");
        else if (c == 'I')
            veh.get(index).setType("Intermediate");
        else if (c == 'S')
            veh.get(index).setType("Standard");
        else if (c == 'F')
            veh.get(index).setType("Full size");
        else if (c == 'P')
            veh.get(index).setType("Premium");
        else if (c == 'L')
            veh.get(index).setType("Luxury");
        else if (c == 'X')
            veh.get(index).setType("Special");
        else
            veh.get(index).setType("Not Specified");
    }

    public static void secondLetter(char c, int index) {
        if (c == 'B')
            veh.get(index).setSeats("2 doors");
        else if (c == 'C')
            veh.get(index).setSeats("4 doors");
        else if (c == 'D')
            veh.get(index).setSeats("5 doors");
        else if (c == 'W')
            veh.get(index).setSeats("Estate");
        else if (c == 'T')
            veh.get(index).setSeats("Convertible");
        else if (c == 'F')
            veh.get(index).setSeats("SUV");
        else if (c == 'P')
            veh.get(index).setSeats("Pick up");
        else if (c == 'V')
            veh.get(index).setSeats("Passenger Van");
        else
            veh.get(index).setSeats("Not Specified");
    }

    public static void thirdLetter(char c, int index) {
        if (c == 'M') {
            veh.get(index).setTransmission("Manual");
            veh.get(index).incrementSippScore(1);
        } else if (c == 'A') {
            veh.get(index).setTransmission("Automatic");
            veh.get(index).incrementSippScore(5);
        } else {
            veh.get(index).setTransmission("Not Specified");
        }
    }

    public static void fourthLetter(char c, int index){
        if (c == 'N') {
            veh.get(index).setFuel("Petrol");
            veh.get(index).setAircon("No air con");
        } else if (c == 'R') {
            veh.get(index).setFuel("Petrol");
            veh.get(index).setAircon("Has air con");
            veh.get(index).incrementSippScore(2);
        } else {
            veh.get(index).setFuel("Not Specified");
            veh.get(index).setAircon("Not Specfied");
        }
    }
}
