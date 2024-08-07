package collectionsexercises.collections;

import collectionsexercises.dog.Dog;

import java.util.List;

public interface DogCollections {

    void insertDog(Dog newDog);

    Dog searchDog(String dci);

    boolean removeDog(Dog dog);

    List<Dog> filterDogByName(String name);

    default void showAllDogs(List<Dog> list) {
        list.forEach((dog) -> {
            System.out.println("Nombre: " + dog.getName());
            System.out.println("Dci: " + dog.getDci());
            System.out.println("Edad: " + dog.getAge());
            System.out.println("Raza: " + dog.getBreed());
            System.out.println();
        });
    }
}
