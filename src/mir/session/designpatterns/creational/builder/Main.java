package mir.session.designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        /**
         * Human object inin yaradilmasi prossesini sadeleshdirmek lazimdir
         * */
        Human human1 = new Human.Builder().build();
        Human human2 = new Human.Builder().age(30).name("Filankes").surname("Filankesov").build();
        Human human3 = new Human.Builder().name("Noname").build();

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
