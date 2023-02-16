package ie.atu.productv5;

public class Dog extends Animals{
    private String vaccination;
    private String shedding;
    private String neutered;

    public Dog() {
        super();
        vaccination = "";
        shedding = "";
        neutered = "";
    }

    public Dog(String vaccination, String shedding, String neutered) {
        this.vaccination = vaccination;
        this.shedding = shedding;
        this.neutered = neutered;
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "vaccination='" + vaccination + '\'' +
                ", shedding='" + shedding + '\'' +
                ", neutered='" + neutered + '\'' +
                '}';
    }
}
