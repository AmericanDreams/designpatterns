package mir.session.designpatterns.structural.bridge.os.windows;

import mir.session.designpatterns.structural.bridge.BorderPainter;
import mir.session.designpatterns.structural.bridge.StyleBehaviour;

public class WindowsBorderPainter implements BorderPainter {

    private StyleBehaviour styleBehaviour;

    public WindowsBorderPainter(StyleBehaviour styleBehaviour) {
        this.styleBehaviour = styleBehaviour;
    }
    @Override
    public void paint() {
        System.out.println("Windows init...");
        System.out.println("Painting with style " + styleBehaviour.getStyle());
    }
}
