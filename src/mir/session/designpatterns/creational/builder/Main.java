package mir.session.designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        /**
         * Human object inin yaradilmasi prossesini sadeleshdirmek lazimdir
         * */
        Human human1 = new Human(12);
        Human human2 = new Human(30, "Filankes", "Filankesov");
        Human human3 = new Human("NoName");

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
