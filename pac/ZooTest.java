package pac;

import pac.zoo.TamaZoo;
import pac.zoo.animal.*;

public class ZooTest {
    public static void main(String[] args) {
        TamaZoo zoo = new TamaZoo();
        zoo.addAnimal(new Lion("しょうじ"));
        zoo.addAnimal(new Cat("あいだ"));
        zoo.addAnimal(new Bird("じじ"));
        zoo.meal();
    }
}