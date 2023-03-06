package island.entities;

import island.entities.animals.carnivores.*;
import island.entities.animals.herbivores.*;
import island.entities.plants.Plant;
import island.enums.EntityType;

public class EntityFactory {
    private EntityFactory() {
    }

    public static Entity createAnimal(EntityType type) {

        return switch (type) {
            case WOLF -> new Wolf();
            case SNAKE -> new Snake();
            case FOX -> new Fox();
            case BEAR -> new Bear();
            case EAGLE -> new Eagle();
            case HORSE -> new Horse();
            case DEER -> new Deer();
            case RABBIT -> new Rabbit();
            case MOUSE -> new Mouse();
            case GOAT -> new Goat();
            case SHEEP -> new Sheep();
            case BOAR -> new Boar();
            case BUFFALO -> new Buffalo();
            case DUCK -> new Duck();
            case CATERPILLAR -> new Caterpillar();
            case PLANT -> new Plant();
        };
    }
}
