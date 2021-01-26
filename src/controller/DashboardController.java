package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public void addClientHandler(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/resources/fxml/addClientForm.fxml"));
            DialogPane clientDialogPane = fxmlLoader.load();

            Dialog<JFXButton.ButtonType> dialog = new Dialog<>();
            dialog.setDialogPane(clientDialogPane);
            dialog.setTitle("Ajouter un utilisateur");

            Optional<JFXButton.ButtonType> clickedButton = dialog.showAndWait();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void addProductHandler(ActionEvent event) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
