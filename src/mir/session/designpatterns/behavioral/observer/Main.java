package mir.session.designpatterns.behavioral.observer;

public class Main {

    public static void main(String[] args) {

        /**
         * News Agent hal hazirda xeberdardir ki hansi Channel leri notify etmelididr xber insert olanda.
         * Bu funksiolliqa daha flexible ve Tight Coupled bir hell lazimdir.
         * */

        NewsAgent agent = new NewsAgent();
        agent.insertNews("News");
    }
}
