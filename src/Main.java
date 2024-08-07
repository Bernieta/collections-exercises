import collectionsexercises.collections.*;
import collectionsexercises.dog.Dog;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        usedArrayListDog();
//        usedLinkedListDog();
//        usedStackDog();
//        usedQueueDog();
//        usedHashMapDog();
    }

    private static void usedArrayListDog() {
        ArrayListDog arrayListDog = new ArrayListDog();
//        Dog dog;
        arrayListDog.insertDog(new Dog("Odín", "1234", 1, "Mestizo"));
        arrayListDog.insertDog(new Dog("Nala", "1235", 3, "Mestizo"));
        arrayListDog.insertDog(new Dog("Luna", "1236", 1, "Pastor Aleman"));
        arrayListDog.insertDog(new Dog("Zeus", "1237", 8, "Boxer"));
//        arrayListDog.insertDog(new Dog("Odín", "1238", 5, "Mestizo"));

        arrayListDog.showAllDogs(arrayListDog.getListDog());

//        System.out.println("-----BUSCANDO UN PERRO-----");
//        dog = arrayListDog.searchDog("1235");
//        System.out.println(dog.getName());

//        System.out.println("-----FILTRANDO PERROS POR NOMBRE-----");
//        List<Dog> list = arrayListDog.filterDogByName("Odín");
//        arrayListDog.showAllDogs(list);

//        System.out.println("-----ELIMINANDO PERRO-----");
//        dog = arrayListDog.searchDog("1236");
//        if (dog != null) {
//            if (!arrayListDog.removeDog(dog)) return;
//            System.out.println("El perro (a) \"" + dog.getName() + "\" eliminado");
//            arrayListDog.showAllDogs(arrayListDog.getListDog());
//        } else System.out.println("El perro no existe");

    }

    private static void usedLinkedListDog() {
        LinkedListDog linkedListDog = new LinkedListDog();
    }

    private static void usedStackDog() {
        StackDog stackDog = new StackDog();
    }

    private static void usedQueueDog() {
        QueueDog queueDog = new QueueDog();
    }

    private static void usedHashMapDog() {
        HashMapDog hashMapDog = new HashMapDog();
    }

}