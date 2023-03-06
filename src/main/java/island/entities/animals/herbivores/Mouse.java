package island.entities.animals.herbivores;

import island.entities.animals.Animal;

public class Mouse extends Herbivore {

    public Mouse() {
        setWeight(0.05);
        setMaxOnCell(500);
        setSpeed(1);
        setHungryPoints(0.01);
        setHealthPoints(0.01);
    }

    public Animal reproduce() {
        return new Mouse();
    }
}
