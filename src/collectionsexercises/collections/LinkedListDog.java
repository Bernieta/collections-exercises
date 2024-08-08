package collectionsexercises.collections;

import collectionsexercises.dog.Dog;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDog implements DogCollections {

    private final List<Dog> linkedList;

    public LinkedListDog() {
        linkedList = new LinkedList<>();
    }

    public List<Dog> getLinkedList() {
        return linkedList;
    }

    @Override
    public void insertDog(Dog newDog) {
        linkedList.add(newDog);
    }

    public void insertDogToFirst(Dog newDog) {
        linkedList.add(0, newDog);
    }

    @Override
    public Dog searchDog(String dci) {
        return linkedList
                .stream()
                .filter((d) -> d.getDci().equals(dci))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean removeDog(Dog dog) {
        return linkedList.remove(dog);
    }

    @Override
    public Collection<Dog> filterDogByName(String name) {
        return linkedList
                .stream()
                .filter((d) -> d.getName().equals(name))
                .toList();
    }
}
