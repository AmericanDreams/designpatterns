package mir.session.designpatterns.creational.builder;

public class Human {
    private int age;
    private String name;
    private String surname;

    public Human(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public Human(int age, String name) {
        this(age, name, "Default Surname");
    }

    public Human(int age) {
        this(age, "Default name", "Default Surname");
    }

    public Human(String name) {
        this(10, name, "Default Surname");
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
