import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose method learn-1, walk-2, eat-3 if you want to see everyone input 4");

        Person person = new Person();

        Programmer programmer = new Programmer("Ulan Uzbek", "programmer", "Peak soft House");
        Dancer dancer = new Dancer("Milena Whiskey", "dancer", "Higher ballet school ");
        Singer singer = new Singer("Alek Star", "singer", "Stars");
        Programmer[] programmers = {programmer};
        Dancer[] dancers = {dancer};
        Singer[] singers = {singer};


        int choose = scanner.nextInt();
        if (choose == 1) {
            person.learn(programmer, dancer, singer);
        } else if (choose == 2) {
            person.walk(programmer, dancer, singer);
        } else if (choose == 3) {
            person.eat(programmer, dancer, singer);
        } else if (choose == 4) {
            for (Programmer programmer1 : programmers) {
                System.out.println(programmer1);}
            for (Dancer dancer1 : dancers) {
                System.out.println(dancer1);}
            for (Singer singer1 : singers) {
                System.out.println(singer1);}
        }
    }
}