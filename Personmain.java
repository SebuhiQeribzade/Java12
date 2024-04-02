package Lesson12;
public class Personmain {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();

        // Demonstrate setting valid and invalid values for name and age
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Trying to set invalid values
        person.setName(null);// Should print "Invalid name. Name cannot be null or empty."
        person.setAge(150); // Should print "Invalid age. Age must be between 0 and 120."

        // Data integrity maintained
        System.out.println("Name: " + person.getName()); // Name should remain "John"
        System.out.println("Age: " + person.getAge()); // Age should remain 30
    }
}
