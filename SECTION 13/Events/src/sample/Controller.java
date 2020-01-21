package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    public void onButtonAction(){
        System.out.println("Hello, " + nameField.getText());

    }
}