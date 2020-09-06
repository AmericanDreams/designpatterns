package mir.session.designpatterns.behavioral.template;

public class Main {

    public static void main(String[] args) {
        /**
         * Muxtelif cur FileSaver class lar olmasina baxmayaraq sistemde file save olunmasi pressi deyishmir.
         * Once compress olunmalididr daha sonra ise save olunmalididr.
         *
         * Hemin bu compressing ve save etmek mexanizimleri deysihe biler her class dan class.Amma
         * Bu ardicilliq deysihmeyerek qalmalidir.
         * */

        FileSaver fileSaver = new WindowsFileSaver();

        fileSaver.save();
    }
}
