public class Singer extends Person{
    private String bandName;

    public Singer() {

    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    String singing(){
        return (" singing");
    }
    String playGitar(){
        return (" play gitar");
    }
}
