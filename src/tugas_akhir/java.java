/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class java implements Initializable {

        @FXML
    private Button signin;
    public String user="bimaji";
    public String pass="123";

    @FXML
    private JFXTextField edit_password;

    @FXML
    private JFXTextField edit_nama;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void masuk(ActionEvent event) {
        user=edit_nama.getText();
        pass=edit_password.getText();
        
        if(user.equalsIgnoreCase(user) && pass.equalsIgnoreCase(pass)){
        try {
            JOptionPane.showMessageDialog(null, "sucess");
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLcatalogue.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 699, 398);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("OSHIRT");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
    }
}        
