package mir.session.designpatterns.creational.abstractfactory;

import mir.session.designpatterns.creational.abstractfactory.abs.Button;
import mir.session.designpatterns.creational.abstractfactory.abs.SelectBox;
import mir.session.designpatterns.creational.abstractfactory.abs.TextInput;
import mir.session.designpatterns.creational.abstractfactory.linux.LinuxButton;
import mir.session.designpatterns.creational.abstractfactory.linux.LinuxSelectBox;
import mir.session.designpatterns.creational.abstractfactory.linux.LinuxTextInput;

public class LinuxComponents implements ComponentFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public SelectBox createSelectBox() {
        return new LinuxSelectBox();
    }

    @Override
    public TextInput createTextInput() {
        return new LinuxTextInput();
    }
}
