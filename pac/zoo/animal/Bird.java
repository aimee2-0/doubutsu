package pac.zoo.animal;

public class Bird extends AbstractAnimal {
    public Bird(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("３．鳥の" + getName() + "はナッツを食べます。");
    }
}