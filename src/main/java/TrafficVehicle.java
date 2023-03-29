public class TrafficVehicle implements Cloneable {
    private String model;
    private String manufacturer;
    private String color;

    public TrafficVehicle(String model, String manufacturer, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public TrafficVehicle clone() throws CloneNotSupportedException {
        return (TrafficVehicle) super.clone();
    }

    @Override
    public String toString() {
        return this.manufacturer + ", modelo " + this.model + ", na cor " + this.color;
    }
}
