package mir.session.designpatterns.behavioral.state;

public class Main {

    public static void main(String[] args) {

        /**
         * !!! IMPORTANT !!!
         * Evvelce Strategy Pattern ile tanish ol!
         *
         * Ahaqidaki TaskHandler classi strategy pattern vasitesi ile dizayn olunub. Laimzdir ki taskHandler e
         * Task kenardan gonderilmek evezine tasklar ozleri novbeti hansin taskin olunacaqina qerar vere bilsin.
         *
         * Yeni tasklar daim ardicil olaraq handle olunsun.
         *
         * */

        TaskHandler taskHandler = new TaskHandler();

        taskHandler.handleTask();
        taskHandler.handleTask();
        taskHandler.handleTask();

    }
}
