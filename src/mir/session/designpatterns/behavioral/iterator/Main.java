package mir.session.designpatterns.behavioral.iterator;

public class Main {

    public static void main(String[] args) {
        /**
         * History class inin icindeki name leri daxili structurunu (Hemin name lerin nece saxlandiqini) client
         * e bildirmeden generic bir hell teklif ederek service olunmasi lazimdir.
         * Ki gelecekde names lerinin saxlanma strukturu deyishihdikde klient kodu deyishdirmeli olmasin.
         * */


        History history = new History();
        history.addName("Mirali");
        history.addName("Tural");
        history.addName("Orxan");

        for (String name : history.getNamesMap().values()) {
            System.out.println(name);
        }
    }
}
