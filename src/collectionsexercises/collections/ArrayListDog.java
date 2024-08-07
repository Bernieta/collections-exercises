package collectionsexercises.collections;

import collectionsexercises.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDog implements DogCollections {

    private final List<Dog> listDog;

    public ArrayListDog() {
        this.listDog = new ArrayList<>();
    }

    public List<Dog> getListDog() {
        return listDog;
    }

    @Override
    public void insertDog(Dog newDog) {
        listDog.add(newDog);
    }

    @Override
    public Dog searchDog(String dci) {
        return listDog
                .stream()
                .filter((d) -> d.getDci().equals(dci))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean removeDog(Dog dog) {
        return listDog.remove(dog);
    }

    @Override
    public List<Dog> filterDogByName(String nameDog) {
        return listDog
                .stream()
                .filter((d) -> d.getName().equals(nameDog))
                .toList();
    }
}
