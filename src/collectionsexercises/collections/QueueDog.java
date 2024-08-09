package collectionsexercises.collections;

import collectionsexercises.dog.Dog;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDog implements DogCollections {

    private final Queue<Dog> queueDog;

    public QueueDog() {
        this.queueDog = new LinkedList<>();
    }

    public Queue<Dog> getQueueDog() {
        return queueDog;
    }

    @Override
    public void insertDog(Dog newDog) {
        queueDog.add(newDog);
    }

    @Override
    public Dog searchDog(String dci) {
        return queueDog
                .stream()
                .filter((d) -> d.getDci().equals(dci))
                .findFirst()
                .orElse(null);
    }

    public Dog pollDog() {
        return queueDog.poll();
    }

    @Override
    public boolean removeDog(Dog dog) {
        return false;
    }

    public Dog peekDog() {
        return queueDog.peek();
    }

    @Override
    public Collection<Dog> filterDogByName(String name) {
        return queueDog
                .stream()
                .filter((d) -> d.getName().equals(name))
                .toList();
    }
}
