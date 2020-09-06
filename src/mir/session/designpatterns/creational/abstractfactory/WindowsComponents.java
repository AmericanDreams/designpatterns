package mir.session.designpatterns.creational.abstractfactory;

import mir.session.designpatterns.creational.abstractfactory.abs.Button;
import mir.session.designpatterns.creational.abstractfactory.abs.SelectBox;
import mir.session.designpatterns.creational.abstractfactory.abs.TextInput;
import mir.session.designpatterns.creational.abstractfactory.windows.WindowsButton;
import mir.session.designpatterns.creational.abstractfactory.windows.WindowsSelectBox;
import mir.session.designpatterns.creational.abstractfactory.windows.WindowsTextInput;

public class WindowsComponents implements ComponentFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public SelectBox createSelectBox() {
        return new WindowsSelectBox();
    }

    @Override
    public TextInput createTextInput() {
        return new WindowsTextInput();
    }
}
