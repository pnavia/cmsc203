package Assignment4;

import java.util.ArrayList;

public class ManagementCompany {
    private String name;
    private String taxID;
    private double mgmFeePer;
    private ArrayList<Property> properties;

    // Default constructor
    public ManagementCompany() {
        this.name = "";
        this.taxID = "";
        this.mgmFeePer = 0;
        this.properties = new ArrayList<>();
    }

    // Parameterized constructor
    public ManagementCompany(String name, String taxID, double mgmFeePer) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
        this.properties = new ArrayList<>();
    }

    // Add a property
    public boolean addProperty(Property property) {
        return properties.add(property);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public double getMgmFeePer() {
        return mgmFeePer;
    }

    public void setMgmFeePer(double mgmFeePer) {
        this.mgmFeePer = mgmFeePer;
    }

    @Override
    public String toString() {
        return "ManagementCompany [Name=" + name + ", Tax ID=" + taxID + ", Management Fee Percentage=" + mgmFeePer + "]";
    }
}

