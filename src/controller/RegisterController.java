package controller;

import functions.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {
    Navigation nav = new Navigation();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void registerClickHandler(ActionEvent event) {
        try {
            Parent dashboard = FXMLLoader.load(getClass().getResource(nav.getDashboard()));
            Scene dashboard_scene = new Scene(dashboard, 800, 550);
            Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(dashboard_scene);
            app_stage.setTitle("Stock Management - Dashboard");
            app_stage.show();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
