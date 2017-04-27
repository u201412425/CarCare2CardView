package pe.edu.upc.carcare.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by alumnos on 4/27/17.
 */

public class DataService {
    public List<FuelType> getFuelTypes(){
        List<FuelType> fuelTypes = new ArrayList<>();
        fuelTypes.add(new FuelType("Gas 90",""));
        fuelTypes.add(new FuelType("Gas 97",""));
        return fuelTypes;
    }

    public List<FuelUpEntry> getFuelUpEntries(){
        List<FuelUpEntry> entries = new ArrayList<>();
        entries.add(new FuelUpEntry(getFuelTypes().get(0),8.7,10.9,"Sample Location 1", new Date()));
        entries.add(new FuelUpEntry(getFuelTypes().get(1),9.2,11.3,"Sample Location 2", new Date()));
        return entries;
    }
}
