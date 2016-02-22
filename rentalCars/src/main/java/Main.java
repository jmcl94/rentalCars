import java.net.MalformedURLException;
import java.util.List;
import static spark.Spark.*;

/**
 * Created by Jamie on 18/02/2016.
 *
 * This sets up the data to be viewed from the apis
 * connecting from the localhost:4567 then add specfic ending
 */

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        List<Vehicle> veh = vehicleAttributeSetter.setVehicleAttributes();

        //Output 1
        get("/sortPrice", (req, res) -> printOutput.printPrice(veh));
        //Output 2
        get("/sortSippScore", (req, res) -> printOutput.printSippScore(veh));
        //Output 3
        get("/sortRating", (req, res) -> printOutput.printRating(veh));
        //Output 4
        get("/sortOS", (req, res) -> printOutput.printOS(veh));
    }
}