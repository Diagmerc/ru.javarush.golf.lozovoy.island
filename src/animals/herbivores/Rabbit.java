package animals.herbivores;

import animals.Animal;
import animals.AnimalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rabbit extends Herbivore {
    private AnimalType animalType = AnimalType.Rabbit;
    private double weight= animalType.getAnimalWeight();

    @Override
    public AnimalType getAnimalType() {
        return this.animalType;
    }

    @Override
    public Animal newAnimal() {
        return new Rabbit();
    }
}