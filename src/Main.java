import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        addCats(cats);
        System.out.println(cats);

        ArrayList<Lion> lions = new ArrayList<>();
        addLions(lions);
        System.out.println(lions);

        ArrayList<Giraffe> giraffes = new ArrayList<>();
        addGiraffes(giraffes);
        System.out.println(giraffes);

        for (Lion l : lions) {
            l.giraffeHunting(giraffes);
            System.out.println(giraffes);
        }
    }

    private static void addGiraffes(ArrayList<Giraffe> giraffes) {
        Giraffe giraffe1 = new Giraffe("жираф1",25);
        giraffes.add(giraffe1);
        Giraffe giraffe2 = new Giraffe("жираф2",15);
        giraffes.add(giraffe2);
        Giraffe giraffe3 = new Giraffe("жираф3",24);
        giraffes.add(giraffe3);
        Giraffe giraffe4 = new Giraffe("жираф4",19);
        giraffes.add(giraffe4);
        Giraffe giraffe5 = new Giraffe("жираф5",26);
        giraffes.add(giraffe5);
    }
    private static void addLions(ArrayList<Lion> lions) {
        Lion lion1 = new Lion("лев1",30);
        lions.add(lion1);
        Lion lion2 = new Lion("лев2",40);
        lions.add(lion2);
    }
    private static void addCats(ArrayList<Cat> cats) {
        Cat cat1 = new Cat("кот1",7);
        cats.add(cat1);
        Cat cat2 = new Cat("кот2",5);
        cats.add(cat2);
        Cat cat3 = new Cat("кот3",4);
        cats.add(cat3);
    }
}