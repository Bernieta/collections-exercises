package collectionsexercises.collections;

import collectionsexercises.dog.Dog;

import java.util.Collection;
import java.util.Stack;

public class StackDog implements DogCollections {

    private final Stack<Dog> stackDog;

    public StackDog() {
        this.stackDog = new Stack<>();
    }

    public Stack<Dog> getDogStack() {
        return stackDog;
    }

    @Override
    public void insertDog(Dog newDog) {
        stackDog.push(newDog);
    }

    @Override
    public Dog searchDog(String dci) {
        return stackDog
                .stream()
                .filter((d) -> d.getDci().equals(dci))
                .findFirst()
                .orElse(null);
    }

    public Dog popDog() {
        return stackDog.pop();
    }

    public Dog peekDog() {
        return stackDog.peek();
    }

    @Override
    public boolean removeDog(Dog dog) {
        return false;
    }

    @Override
    public Collection<Dog> filterDogByName(String name) {
        return stackDog
                .stream()
                .filter((d) -> d.getName().equals(name))
                .toList();
    }
}
