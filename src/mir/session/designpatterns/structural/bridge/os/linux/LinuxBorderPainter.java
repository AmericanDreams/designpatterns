package mir.session.designpatterns.structural.bridge.os.linux;

import mir.session.designpatterns.structural.bridge.BorderPainter;
import mir.session.designpatterns.structural.bridge.StyleBehaviour;

public class LinuxBorderPainter implements BorderPainter {

    private StyleBehaviour styleBehaviour;

    public LinuxBorderPainter(StyleBehaviour styleBehaviour) {
        this.styleBehaviour = styleBehaviour;
    }

    @Override
    public void paint() {
        System.out.println("Linux init...");
        System.out.println("Painting with style " + styleBehaviour.getStyle());
    }
}
