/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLselesaiController implements Initializable {

       @FXML
    private JFXButton id_edit;

    @FXML
    private JFXButton Close;

    @FXML
    void keluar(ActionEvent event) {
            Stage stage = (Stage) Close.getScene().getWindow();
        stage.close();
    }

    @FXML
    void order(ActionEvent event) {
try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLregister.fxml"));
            
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Form Hasil");
            stage.show();
            
            FXMLregisterController Data = new FXMLregisterController();
            Data = fxmlLoader.getController();
            

            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
    
}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
