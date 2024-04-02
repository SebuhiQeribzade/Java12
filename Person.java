package Lesson12;
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person() {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods

    // Equals method override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    // HashCode method override
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age<=0&&age>=100);{
            System.out.println("Invalid number");
        }
    }
    public void setName(String name) {
        this.name=name;
        if (name.equals(null));{
            System.out.println("Invalid word");
        }
}
}