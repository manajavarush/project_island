package island.entities.animals.herbivores;

import island.entities.animals.Animal;

public class Boar extends Herbivore {
    public Boar() {
        setWeight(400.0);
        setMaxOnCell(50);
        setSpeed(2);
        setHungryPoints(50.0);
        setHealthPoints(50.0);
    }

    public Animal reproduce() {
        return new Boar();
    }
}
