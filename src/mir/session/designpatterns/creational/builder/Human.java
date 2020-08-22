package mir.session.designpatterns.creational.builder;

public class Human {
    private int age;
    private String name;
    private String surname;

    private Human(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public void printName() {
        System.out.println(this.name.substring(2));
    }

    public static class Builder {

        private int age;
        private String name;
        private String surname;

        public Builder() {
            this.age = 10;
            this.surname = "Default Surname";
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Human build() {
            Human human = new Human(this);
            return human;
        }
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
