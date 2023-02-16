import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person() {}

    public Person(String name, int age) {
        setName(name); setAge(age);
    }

    public void setName(String name) {
        if (name != null) {
        this.name = name;
        } else {
            throw new NullPointerException();
        }
    }

    public void setAge(int age) {
            this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person i) {
        if (this.age != i.getAge()) {
            return this.age - i.getAge();
        }
        return this.name.compareTo(i.getName());
    }
}