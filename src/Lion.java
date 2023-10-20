import java.util.ArrayList;
import java.util.Random;

public class Lion extends Mammal{

    public Lion(String name, int speed) {
        super(name, speed);
    }

    public void giraffeHunting(ArrayList<Giraffe> giraffes){
        Random random = new Random();
        int k = random.nextInt(giraffes.size());
        giraffes.remove(k);
    }
}
