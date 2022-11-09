public class Person {
    private String name;
    private String designation;


    public Person(){}
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    void learn(Programmer programmer, Dancer dancer, Singer singer){
        System.out.println(programmer.getName().toString()+" learn "+(programmer.coding()));
        System.out.println(dancer.getName().toString()+" learn "+(dancer.dancing()));
        System.out.println(singer.getName().toString()+" learn "+(singer.singing()+" &"+singer.playGitar()));
    }
    void walk(Programmer programmer, Dancer dancer, Singer singer){
        System.out.println("Walking together: "+programmer.getName().toString()+","+dancer.getName().toString()+","+singer.getName().toString());

    }
    void eat(Programmer programmer, Dancer dancer, Singer singer){
        System.out.println("Eating together: "+programmer.getName().toString()+","+dancer.getName().toString()+","+singer.getName().toString());

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
