package mir.session.designpatterns.structural.bridge.os.styles;

import mir.session.designpatterns.structural.bridge.StyleBehaviour;

public class BoldStyle implements StyleBehaviour {
    @Override
    public String getStyle() {
        return "BOLD";
    }
}
