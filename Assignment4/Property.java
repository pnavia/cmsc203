package Assignment4;

public class Property {
    private String propertyName;
    private String city;
    private double rentAmount;
    private String owner;

    // Default constructor
    public Property() {
        this.propertyName = "";
        this.city = "";
        this.rentAmount = 0;
        this.owner = "";
    }

    // Parameterized constructor
    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
    }

    // Copy constructor
    public Property(Property property) {
        this(property.propertyName, property.city, property.rentAmount, property.owner);
    }

    // Getters and Setters
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Property [Property Name=" + propertyName + ", City=" + city + ", Rent Amount=" + rentAmount + ", Owner=" + owner + "]";
    }
}
