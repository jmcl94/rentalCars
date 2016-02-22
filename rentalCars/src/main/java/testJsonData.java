import java.util.List;

/**
 * Created by Jamie on 22/02/2016.
 */
public class testJsonData {

    // Test to check all objects in the list of vehicles obtained from the JSON file
    // and ensuring it is not empty or above 0 for numerical fields.
    public static void testEmptyObjectData(List<Vehicle> veh){
        int errors = 0;
        for(int i = 0; i<veh.size(); i++){
            if(veh.get(i).getName().isEmpty() || veh.get(i).getAircon().isEmpty() || veh.get(i).getFuel().isEmpty() ||
                    veh.get(i).getOverallScore() <= 0.0 ||veh.get(i).getPrice() <= 0.0 || veh.get(i).getRating() <= 0 ||
                    veh.get(i).getSeats().isEmpty() || veh.get(i).getSipp().isEmpty() || veh.get(i).getSippScore() <= 0
                || veh.get(i).getSupplier().isEmpty() || veh.get(i).getTransmission().isEmpty() ||
                    veh.get(i).getType().isEmpty()) {

                System.out.println("Empty object at object number" + (i));
                errors++;
            }
        }
        if (errors == 0){
            System.out.println("Object data transferred correctly");
        }
    }


    //Test to check Sipp of vehicle and ensure the letters
    //match up to the information table.
    public static void testSIPP(List<Vehicle> veh){
        for(int i = 0; i<veh.size(); i++){
            if(veh.get(i).getAircon().equalsIgnoreCase("Not Specified") ||
                    veh.get(i).getFuel().equalsIgnoreCase("Not Specified") ||
                    veh.get(i).getSeats().equalsIgnoreCase("Not Specified") ||
                    veh.get(i).getTransmission().equalsIgnoreCase("Not Specified") ||
                    veh.get(i).getType().equalsIgnoreCase("Not Specified"))
            {
                System.out.println("Incorrect data in SIPP information on JSON file for " +
                        veh.get(i).getName() + " object at position " + i);
            }
        }
    }
}
