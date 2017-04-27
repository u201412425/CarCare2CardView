package pe.edu.upc.carcare.models;

/**
 * Created by alumnos on 4/27/17.
 */

public class FuelType {
    private String name;
    private String description;

    public FuelType() {
    }

    public FuelType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public FuelType setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public FuelType setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString(){
        return name;
    }
}
