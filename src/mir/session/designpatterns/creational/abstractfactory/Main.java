package mir.session.designpatterns.creational.abstractfactory;

import mir.session.designpatterns.creational.abstractfactory.abs.Button;
import mir.session.designpatterns.creational.abstractfactory.abs.SelectBox;
import mir.session.designpatterns.creational.abstractfactory.abs.TextInput;
import mir.session.designpatterns.creational.abstractfactory.linux.LinuxButton;
import mir.session.designpatterns.creational.abstractfactory.linux.LinuxSelectBox;
import mir.session.designpatterns.creational.abstractfactory.linux.LinuxTextInput;

public class Main {

    public static void main(String[] args) {

        /**
         * Object family-ler arasinda asanliqla kecid etmek temin olunmalidir.
         * */


        ComponentFactory componentFactory = new WindowsComponents();

        Button button = componentFactory.createButton();
        SelectBox selectBox = componentFactory.createSelectBox();
        TextInput textInput = componentFactory.createTextInput();

    }
}
