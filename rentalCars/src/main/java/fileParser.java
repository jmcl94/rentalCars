import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by Jamie on 18/02/2016.
 *
 * This class uses Jackson library to map each vehicle
 * JSON object to the Vehicle object.
 */
public class fileParser {

    public static List<Vehicle> getCars() throws MalformedURLException {

        List<Vehicle> VehicleList = null;

        try{
            ObjectMapper mapper = new ObjectMapper();
            returnJsonTop value = mapper.readValue(new URL("http://www.rentalcars.com/js/vehicles.json"), returnJsonTop.class);
            VehicleList = value.Search.VehicleList;
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return VehicleList;
    }

}
