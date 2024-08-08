package collectionsexercises.collections;

import collectionsexercises.dog.Dog;

import java.util.Collection;
import java.util.List;

public interface DogCollections {

    void insertDog(Dog newDog);

    Dog searchDog(String dci);

    boolean removeDog(Dog dog);

    Collection<Dog> filterDogByName(String name);

    default void showAllDogs(Collection<Dog> collection) {
        collection.forEach((dog) -> {
            System.out.println("Nombre: " + dog.getName());
            System.out.println("Dci: " + dog.getDci());
            System.out.println("Edad: " + dog.getAge());
            System.out.println("Raza: " + dog.getBreed());
            System.out.println();
        });
    }
}
