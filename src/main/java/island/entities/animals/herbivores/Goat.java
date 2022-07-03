package island.entities.animals.herbivores;

import island.entities.animals.Animal;

public class Goat extends Herbivore {

    public Goat() {
        setWeight(60.0);
        setMaxOnCell(140);
        setSpeed(3);
        setHungryPoints(10.0);
        setHealthPoints(10.0);
    }

    public Animal reproduce() {
        return new Goat();
    }
}
