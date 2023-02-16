import java.util.*;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

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
        if (age > 0) {
            this.age = age;
        } else {
            throw new NullPointerException();
        }
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

    @Override
    public String toString() {
        return name + " " + age;
    }
}