import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        VetClinica clinic = new VetClinica();
        clinic.addNewAnimal(new Cat("Barsik", "Nikolai")).addNewAnimal(new Dog("Pushok", "Oleg"));

        for (Animal animal: clinic.getAnimals()) {
            animal.ill();
        }
    }
}
