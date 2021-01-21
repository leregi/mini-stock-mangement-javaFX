package controller;

import functions.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    Navigation nav = new Navigation();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void loginClickHandler(ActionEvent event) {
        try {
            Parent register_parent = FXMLLoader.load(getClass().getResource(nav.getRegister()));
            Scene register_scene = new Scene(register_parent);
            Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(register_scene);
            app_stage.setTitle("Stock Management - Register");
            app_stage.show();
        } catch (Exception e ) {
            System.out.println(e.getMessage());
        }


        System.out.println("Login button clicked...");
    }
}
