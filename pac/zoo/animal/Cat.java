package pac.zoo.animal;

public class Cat extends AbstractAnimal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("２．猫の" + getName() + "はアイスクリームをショプショプ食べます。");
    }

}