import collectionsexercises.collections.*;
import collectionsexercises.dog.Dog;

import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        usedArrayListDog();
//        usedLinkedListDog();
//        usedStackDog();
//        usedQueueDog();
//        usedHashMapDog();
    }

    private static void usedArrayListDog() {
        ArrayListDog arrayListDog = new ArrayListDog();
        Dog dog;
        arrayListDog.insertDog(new Dog("Odín", "1234", 1, "Mestizo"));
        arrayListDog.insertDog(new Dog("Nala", "1235", 3, "Mestizo"));
        arrayListDog.insertDog(new Dog("Luna", "1236", 1, "Pastor Aleman"));
        arrayListDog.insertDog(new Dog("Zeus", "1237", 8, "Boxer"));
        arrayListDog.insertDog(new Dog("Odín", "1238", 5, "Mestizo"));

        arrayListDog.showAllDogs(arrayListDog.getListDog());

        System.out.println("-----BUSCANDO UN PERRO-----");
        dog = arrayListDog.searchDog("1235");
        System.out.println(dog.getName());

        System.out.println("-----FILTRANDO PERROS POR NOMBRE-----");
        Collection<Dog> list = arrayListDog.filterDogByName("Odín");
        arrayListDog.showAllDogs(list);

        System.out.println("-----ELIMINANDO PERRO-----");
        dog = arrayListDog.searchDog("1236");
        if (dog != null) {
            if (!arrayListDog.removeDog(dog)) return;
            System.out.println("El perro (a) \"" + dog.getName() + "\" eliminado");
            arrayListDog.showAllDogs(arrayListDog.getListDog());
        } else System.out.println("El perro no existe");
    }

    private static void usedLinkedListDog() {
        LinkedListDog linkedListDog = new LinkedListDog();
        Dog dog;
        linkedListDog.insertDog(new Dog("Odín", "1234", 1, "Mestizo"));
        linkedListDog.insertDog(new Dog("Nala", "1235", 3, "Mestizo"));
        linkedListDog.insertDog(new Dog("Luna", "1236", 1, "Pastor Aleman"));
        linkedListDog.insertDog(new Dog("Zeus", "1237", 8, "Boxer"));
        linkedListDog.insertDog(new Dog("Odín", "1238", 5, "Mestizo"));

        linkedListDog.showAllDogs(linkedListDog.getLinkedList());

        System.out.println("-----BUSCANDO PERRO-----");
        dog = linkedListDog.searchDog("1236");
        System.out.println(dog.getName());

        System.out.println("-----FILTRANDO PERROS POR NOMBRE-----");
        Collection<Dog> collection = linkedListDog.filterDogByName("Odín");
        linkedListDog.showAllDogs(collection);

        System.out.println("-----ELIMINANDO PERRO-----");
        dog = linkedListDog.searchDog("1237");
        if (dog != null) {
            if (!linkedListDog.removeDog(dog)) return;
            System.out.println("El perro (a) \"" + dog.getName() + "\" eliminado");
            linkedListDog.showAllDogs(linkedListDog.getLinkedList());
        } else System.out.println("No fue posible eliminar el perro");
    }

    private static void usedStackDog() {
        StackDog stackDog = new StackDog();
        Dog dog;
        stackDog.insertDog(new Dog("Odín", "1234", 1, "Mestizo"));
        stackDog.insertDog(new Dog("Nala", "1235", 3, "Mestizo"));
        stackDog.insertDog(new Dog("Luna", "1236", 1, "Pastor Aleman"));
        stackDog.insertDog(new Dog("Zeus", "1237", 8, "Boxer"));
        stackDog.insertDog(new Dog("Odín", "1238", 5, "Mestizo"));

        stackDog.showAllDogs(stackDog.getStackDog());

        System.out.println("-----BUSCANDO PERRO-----");
        dog = stackDog.searchDog("1237");
        System.out.println(dog.getName());

        System.out.println("-----FILTRANDO PERROS POR NOMBRE-----");
        Collection<Dog> collection = stackDog.filterDogByName("Odín");
        stackDog.showAllDogs(collection);

        System.out.println("-----POP PERRO-----");
        dog = stackDog.popDog();
        System.out.println(dog.getName());

        System.out.println("-----PEEK PERRO-----");
        dog = stackDog.peekDog();
        System.out.println(dog.getName());
    }

    private static void usedQueueDog() {
        QueueDog queueDog = new QueueDog();
        Dog dog;
        queueDog.insertDog(new Dog("Odín", "1234", 1, "Mestizo"));
        queueDog.insertDog(new Dog("Nala", "1235", 3, "Mestizo"));
        queueDog.insertDog(new Dog("Luna", "1236", 1, "Pastor Aleman"));
        queueDog.insertDog(new Dog("Zeus", "1237", 8, "Boxer"));
        queueDog.insertDog(new Dog("Odín", "1238", 5, "Mestizo"));

        queueDog.showAllDogs(queueDog.getQueueDog());

        System.out.println("-----BUSCANDO PERRO----");
        dog = queueDog.searchDog("1234");
        if (dog != null) System.out.println(dog.getName());

        System.out.println("-----FILTRANDO PERROS POR NOMBRE-----");
        Collection<Dog> collection = queueDog.filterDogByName("Odín");
        if (!collection.isEmpty()) queueDog.showAllDogs(collection);

        System.out.println("-----POLL PERRO----");
        dog = queueDog.pollDog();
        if (dog != null) {
            System.out.println("El perro (a) \"" + dog.getName() + "\" emininado");
            queueDog.showAllDogs(queueDog.getQueueDog());
        } else System.out.println("No fue posible eliminar el perro");

    }

    private static void usedHashMapDog() {
        HashMapDog hashMapDog = new HashMapDog();
        Dog dog;
        hashMapDog.insertDog(1, new Dog("Odín", "1234", 1, "Mestizo"));
        hashMapDog.insertDog(2, new Dog("Nala", "1235", 3, "Mestizo"));
        hashMapDog.insertDog(3, new Dog("Luna", "1236", 1, "Pastor Aleman"));
        hashMapDog.insertDog(4, new Dog("Zeus", "1237", 8, "Boxer"));
        hashMapDog.insertDog(5, new Dog("Odín", "1238", 5, "Mestizo"));

        hashMapDog.showAllValues(hashMapDog.getDogs());
        System.out.println("-----MOSTRANDO KEYS----");
        hashMapDog.showAllKeys();

        System.out.println("-----OBTENER UN PERRO POR SU KEY----");
        dog = hashMapDog.getDog(2);
        if (dog != null)
            System.out.println(dog.getName());

        System.out.println("-----ELIMINAR UN PERRO POR SU KEY----");
        dog = hashMapDog.removeDog(4);
        if (dog != null)
            System.out.println("El perro (a) \"" + dog.getName() + "\" eliminado");

        System.out.println("----FILTRAR PERROS POR NOMBRE-----");
        List<Dog> list = hashMapDog.filterDogByName("Odín");
        if (!list.isEmpty()) hashMapDog.showAllValues(list);
    }

}