/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;


import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class FXMLregisterController implements Initializable {

     @FXML
    private JFXTextField edit_fullname;

    @FXML
    private JFXTextField edit_nama;

    @FXML
    private JFXPasswordField edit_password;

    @FXML
    private JFXTextField edit_size;

    @FXML
    private JFXTextField edit_telp;
    @FXML
    private Button register;
    public String full="Bima Aji";
    public String user="bimaji";
    public String pass="123";
    public String tipe="L";
    public String nomor="085111";
  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void masuk(ActionEvent event) throws IOException{
        if(edit_fullname.getText().equals("") || edit_nama.getText().equals("")
        || edit_password.getText().equals("") || edit_size.getText().equals("")
        || edit_telp.getText().equals("") )
        JOptionPane.showMessageDialog(null, "LENGKAPI DATA");  
        else{
        full=edit_fullname.getText();
        user=edit_nama.getText();
        pass=edit_password.getText();
        tipe=edit_size.getText();
        nomor=edit_telp.getText();
        
        if(full.equalsIgnoreCase(full) && user.equalsIgnoreCase(user) && pass.equalsIgnoreCase(pass) && tipe.equalsIgnoreCase(tipe) && nomor.equalsIgnoreCase(nomor)){
        try {
            
            
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLmasuk.fxml"));
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
}
