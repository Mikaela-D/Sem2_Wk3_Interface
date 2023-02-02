package ie.atu.productv4;

import ie.atu.productv4.Product;

public class Software extends Product {
    private String version;

    public Software() {
        super();
        version = "";
    }


    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return super.toString() + " " + version;
    }
}
