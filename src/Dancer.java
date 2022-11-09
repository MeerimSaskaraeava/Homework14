public class Dancer extends Person{
    private String groupName;

    public Dancer() {

    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    String dancing(){
      return ("dancing");
    }
}
