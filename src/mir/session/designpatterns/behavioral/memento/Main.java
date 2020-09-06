package mir.session.designpatterns.behavioral.memento;

public class Main {

    public static void main(String[] args) {
        /**
         * Hal hazirda Editor Class i save ve restore funksionalliqini ozu yerine yetirir. Ve save olunmush state oz icerisinde saxlayir.
         * Bu gelecekde save olunacaq sheyler ve ya save olunma shekli deyishildikde problem ola bilel. Bunu daha flexible
         * hala getirmek ucun Editor class inin state ini save ve restore edilmesi funksionalliqnin Editor classindan
         * cixarilmasi ve bashqa class terefinden handle olunmasi lazimdir.
         * */
        Editor editor = new Editor();

        editor.write("salam");
        editor.print();

        editor.save();

        editor.write("necesen");
        editor.print();

        editor.restore();

        editor.print();
    }
}
