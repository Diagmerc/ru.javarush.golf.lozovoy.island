package animals.herbivores;
import animals.Animal;
import animals.AnimalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Buffalo extends Herbivore {
    private AnimalType animalType = AnimalType.Buffalo;
    private double weight = 700;

    @Override
    public AnimalType getAnimalType() {
        return this.animalType;
    }

    @Override
    public Animal newAnimal() {
        return new Buffalo();
    }

}