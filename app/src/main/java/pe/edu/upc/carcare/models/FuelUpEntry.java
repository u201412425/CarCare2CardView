package pe.edu.upc.carcare.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by alumnos on 4/27/17.
 */

public class FuelUpEntry {
    private FuelType fuelType;
    private double gallons;
    private double unitPrice;
    private String locationReference;
    private Date createdAt;

    public FuelUpEntry(FuelType fuelType, double gallons, double unitPrice, String locationReference, Date createdAt) {
        this.fuelType = fuelType;
        this.gallons = gallons;
        this.unitPrice = unitPrice;
        this.locationReference = locationReference;
        this.createdAt = createdAt;
    }

    public FuelUpEntry() {
    
    }

    public FuelType getFuelType() {
    
        return fuelType;
    }

    public String getFuelTypeName() {
        return fuelType.getName();
    }

    public FuelUpEntry setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public double getGallons() {
        return gallons;
    }

    public String getGallonsAsString(){
        return String.format("%.2f",gallons);
    }
    public FuelUpEntry setGallons(double gallons) {
        this.gallons = gallons;
        return this;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public FuelUpEntry setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public String getUnitPriceAsString(){
        return String.format("%.2f",unitPrice);
    }

    public String getLocationReference() {
        return locationReference;
    }

    public double getPrice(){
        return gallons*unitPrice;
    }

    public String getPriceAsString(){
        return String.format("%.2f",getPrice());
    }
    public FuelUpEntry setLocationReference(String locationReference) {
        this.locationReference = locationReference;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getCreatedAtAsString(){
        return (new SimpleDateFormat("EEEE MMMM, d yyyy")).format(createdAt);
    }
    public FuelUpEntry setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getContextAsString(){
        return "On " + getCreatedAtAsString() +
                (locationReference.isEmpty() ? "" :
                        " at "+ locationReference);
    }
}
