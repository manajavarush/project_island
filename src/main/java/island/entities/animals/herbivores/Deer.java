package island.entities.animals.herbivores;

import island.entities.animals.Animal;

public class Deer extends Herbivore {

    public Deer() {
        setWeight(300.0);
        setMaxOnCell(20);
        setSpeed(4);
        setHungryPoints(50.0);
        setHealthPoints(50.0);
    }

    public Animal reproduce() {
        return new Deer();
    }
}
