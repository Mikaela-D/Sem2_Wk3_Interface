package ie.atu.productv4;

public class Music extends Product{
    private String artist;
    private String label;

    public Music(){
        super();
        artist = "";
        label = "";
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
