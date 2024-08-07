package collectionsexercises.dog;

public class Dog {

    private String name;
    private String dci;
    private int age;
    private String breed;

    public Dog() {
    }

    public Dog(String name, String dci, int age, String breed) {
        this.name = name;
        this.dci = dci;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDci() {
        return dci;
    }

    public void setDci(String dci) {
        this.dci = dci;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
