package pac.zoo.animal;

public abstract class AbstractAnimal {
    private String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public void sleep() {
        System.out.println("横たわってす。やすや眠ります。");
    }
    public String getName() {
        return name;
    }
}