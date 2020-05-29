package biz.konakov.p2;

public class Person {
    String name;
    byte age;

    Byte Age;

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

