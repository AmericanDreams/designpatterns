package mir.session.designpatterns.behavioral.observer;

public class NewsAgent {

    public void insertNews(String news) {

        Channel azTv = new AzTV();
        azTv.notifyMe();

        Channel liderTv = new LiderTV();
        liderTv.notifyMe();

    }
}
