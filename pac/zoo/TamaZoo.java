//所属するパッケージを宣言
package pac.zoo;

import java.util.ArrayList;
import java.util.Iterator;
//他のパッケージのクラスを利用する
import pac.zoo.animal.AbstractAnimal;

public class TamaZoo {

    ArrayList<AbstractAnimal> cage = new ArrayList<AbstractAnimal>();

    //animalを追加
    public void addAnimal(AbstractAnimal animal) {
        cage.add(animal);
    }

    public void meal() {

        Iterator<AbstractAnimal> iterator = cage.iterator();
        //次の要素がなくなるまで
        while(iterator.hasNext()) {
            AbstractAnimal animal = iterator.next();
            animal.eat();
        }
    }
}