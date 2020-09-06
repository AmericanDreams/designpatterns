package mir.session.designpatterns.behavioral.iterator;

import java.util.Iterator;

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

        Iterator<String> iterator = history.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
