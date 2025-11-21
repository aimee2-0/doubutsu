package pac.zoo.animal;

public class Lion extends AbstractAnimal {
    public Lion(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("１．ライオンの" + getName() + "は肉をガシガシ食べます。");
    }
}