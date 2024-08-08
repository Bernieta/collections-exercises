package collectionsexercises.collections;

import collectionsexercises.dog.Dog;

import java.util.*;

public class HashMapDog {

    private final Map<Integer, Dog> hashMapDog;

    public HashMapDog() {
        hashMapDog = new HashMap<>();
    }

    public Map<Integer, Dog> getHashMapDog() {
        return hashMapDog;
    }

    public Dog getDog(Integer key) {
        return hashMapDog.get(key);
    }

    public Collection<Dog> getDogs() {
        return hashMapDog.values();
    }

    public void insertDog(Integer key, Dog newDog) {
        hashMapDog.put(key, newDog);
    }

    public Dog removeDog(Integer key) {
        return hashMapDog.remove(key);
    }

    public List<Dog> filterDogByName(String name) {
        Collection<Dog> collection = hashMapDog.values();
        return collection
                .stream()
                .filter((d) -> d.getName().equals(name))
                .toList();
    }

    public void showAllKeys() {
        Set<Integer> keys = hashMapDog.keySet();
        keys.forEach((k) -> System.out.println("[" + k + "] "));
    }

    public void showAllValues(Collection<Dog> collection) {
        collection.forEach((dog) -> {
            System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge());
            System.out.println();
        });
    }

}
