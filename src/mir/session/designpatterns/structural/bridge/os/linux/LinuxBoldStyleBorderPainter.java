package mir.session.designpatterns.structural.bridge.os.linux;

import mir.session.designpatterns.structural.bridge.BorderPainter;

public class LinuxBoldStyleBorderPainter implements BorderPainter {
    @Override
    public void paint() {
        System.out.println("Linux painter is initializing...");
        System.out.println("Starting painting with Bold style");
    }
}
