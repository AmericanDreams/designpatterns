package mir.session.designpatterns.behavioral.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        /**
         * WebServer in icerisindeki Filter ler arasinda zencirvari elaqe qurulmalididr. Ve request
         * sirasi ile hemin filter ler terefinden handle olunmalidir.
         * */

        WebServer webServer = new WebServer();
        webServer.handLeRequest("request");
    }
}
