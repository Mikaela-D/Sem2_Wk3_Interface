package ie.atu.productv5;

import ie.atu.productv5.Product;

public class TV extends Product {
    private String screen_size;
    private String manufacture;

    public TV(){
        super();
        screen_size = "";
        manufacture = "";
        count++;
    }

    public String getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(String screen_size) {
        this.screen_size = screen_size;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Screen size " + screen_size +
                " \nManufacture " + manufacture;
    }
}
