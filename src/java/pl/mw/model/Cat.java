package pl.mw.model;

public class Cat {
    String name;
    int age;

    public Cat() {}

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "pl.mw.model.Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

