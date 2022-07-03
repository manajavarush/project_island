package island.entities.animals.herbivores;

import island.entities.animals.Animal;

public class Caterpillar extends Herbivore {

    public Caterpillar() {
        setWeight(0.01);
        setMaxOnCell(1000);
        setSpeed(0);
        setHungryPoints(0.003);
        setHealthPoints(0.003);
    }

    public Animal reproduce() {
        return new Caterpillar();
    }
}
