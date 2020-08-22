package mir.session.designpatterns.creational.abstractfactory;

import mir.session.designpatterns.creational.abstractfactory.abs.Button;
import mir.session.designpatterns.creational.abstractfactory.abs.SelectBox;
import mir.session.designpatterns.creational.abstractfactory.abs.TextInput;

public interface ComponentFactory {
    Button createButton();
    SelectBox createSelectBox();
    TextInput createTextInput();
}
