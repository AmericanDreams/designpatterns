package mir.session.designpatterns.structural.bridge.os;

import mir.session.designpatterns.structural.bridge.BorderPainter;
import mir.session.designpatterns.structural.bridge.os.linux.LinuxBoldStyleBorderPainter;
import mir.session.designpatterns.structural.bridge.os.windows.WindowsBoldStyleBorderPainter;

public class Main {
    public static void main(String[] args) {

        /**
         * Burada Class in hansi OS-e aid olmasi ve Border i hansi Style ile renglemesi bir birinden tamamile
         * ferqli 2 abstractiondur ve bir birlerinden musteqil olaraq deyishe bilirler.
         *
         * Glecekde hem sisteme yeni OS-ler ve hem de yeni Style-ler elave oluna biler. Bele olduqda
         * yaratmali olacaqimiz class saylari artaracaq. Bune optimal bir hell tapmaq lazimdir.
         * */

        BorderPainter windowsBold = new WindowsBoldStyleBorderPainter();
        windowsBold.paint();

        BorderPainter linuxBold = new LinuxBoldStyleBorderPainter();
        linuxBold.paint();
    }
}
