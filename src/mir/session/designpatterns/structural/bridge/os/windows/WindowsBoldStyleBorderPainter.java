package mir.session.designpatterns.structural.bridge.os.windows;

import mir.session.designpatterns.structural.bridge.BorderPainter;

public class WindowsBoldStyleBorderPainter implements BorderPainter {
    @Override
    public void paint() {
        System.out.println("Windows painter is initializing...");
        System.out.println("Starting painting with Bold style");
    }
}
