public class Programmer extends Person{
    private String companyName;

    public Programmer() {

    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    String coding(){
        return ("coding");
    }
}
