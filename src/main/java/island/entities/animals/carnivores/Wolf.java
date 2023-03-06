package island.entities.animals.carnivores;

import island.entities.animals.Animal;

public class Wolf extends Carnivore {

    public Wolf() {
        setWeight(50.0);
        setMaxOnCell(30);
        setSpeed(3);
        setHungryPoints(8.0);
        setHealthPoints(8.0);
    }

    public Animal reproduce() {
        return new Wolf();
    }
}
