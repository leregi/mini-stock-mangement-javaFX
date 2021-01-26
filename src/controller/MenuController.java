package controller;

import functions.Navigation;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    Navigation nav = new Navigation();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void  clientLinkHandler(ActionEvent event) {
        try {
            Parent dashboard = FXMLLoader.load(getClass().getResource(nav.getClient()));
            Scene dashboard_scene = new Scene(dashboard, 1000, 550);
            Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(dashboard_scene);
            app_stage.setTitle("Stock Management - Dashboard");
            app_stage.show();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void clientLinkHandler(javafx.event.ActionEvent event) {
        try {
            Parent dashboard = FXMLLoader.load(getClass().getResource(nav.getClient()));
            Scene dashboard_scene = new Scene(dashboard, 1000, 550);
            Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(dashboard_scene);
            app_stage.setTitle("Stock Management - Dashboard");
            app_stage.show();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void productLinkHandler(javafx.event.ActionEvent event) {
        try {
            Parent dashboard = FXMLLoader.load(getClass().getResource(nav.getProduct()));
            Scene dashboard_scene = new Scene(dashboard, 1000, 550);
            Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(dashboard_scene);
            app_stage.setTitle("Stock Management - Dashboard");
            app_stage.show();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void linkListenner(ActionEvent event, String link) {
        try {
            Parent dashboard = FXMLLoader.load(getClass().getResource(link));
            Scene dashboard_scene = new Scene(dashboard, 1000, 550);
            Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(dashboard_scene);
            app_stage.setTitle("Stock Management - Dashboard");
            app_stage.show();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void transactionLinkHandler(javafx.event.ActionEvent event) {
        try {
            Parent dashboard = FXMLLoader.load(getClass().getResource(nav.getTransaction()));
            Scene dashboard_scene = new Scene(dashboard, 1000, 550);
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
