/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLcatalogueController {
    
          @FXML
    private JFXCheckBox beli1;

       @FXML
    private JFXCheckBox beli2;

    @FXML
    private JFXCheckBox beli3;

    @FXML
    private JFXButton edit_next;

        @FXML
    private JFXTextArea jumlah;
    
    @FXML
    private JFXButton oke;
    
    int hargatotal1, hargatotal2,hargatotal3, hargatotal11, hargatotal22, hargatotal33, hargatotal45;
    int harga;

    @FXML
    void shop1(ActionEvent event) {
        
    }

    @FXML
    void shop2(ActionEvent event) {

    }

    @FXML
    void shop3(ActionEvent event) {

    }
    
     @FXML
    private void proses() {
           if(beli1.isSelected()){     
            hargatotal1 = 185000;
            jumlah.setText("  Rp."+ hargatotal1 );
        }
        if(beli2.isSelected()){     
            hargatotal2 = 385000;
            jumlah.setText("  Rp."+ hargatotal2 );
        }
        if(beli3.isSelected()) {
             hargatotal3 = 185000;
             jumlah.setText("  Rp."+ hargatotal3 );
         }
         else if(beli1.isSelected() && beli2.isSelected()) {
             hargatotal11=185000+385000;
             jumlah.setText("  Rp."+ hargatotal11 );
         }
         if(beli1.isSelected() && beli3.isSelected()) {
             hargatotal22=185000+185000;
             jumlah.setText("  Rp."+ hargatotal22 );
         }
         else if(beli2.isSelected() && beli3.isSelected()) {
             hargatotal33=385000+185000;
             jumlah.setText("  Rp."+ hargatotal33 );
         }
         if(beli1.isSelected() && beli3.isSelected() && beli2.isSelected()) {
             hargatotal45=185000+185000+385000;
             jumlah.setText("  Rp."+ hargatotal45 );
         }
    }
    
    @FXML
    void next(ActionEvent event) throws IOException {

        proses();
        try{
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLcatalogue2.fxml"));
            
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Form Hasil");
            stage.show();
            
            FXMLcatalogue2Controller Data = new FXMLcatalogue2Controller();
            Data = fxmlLoader.getController();
            
            Data.setdata(harga, hargatotal1, hargatotal2,hargatotal3, 
                    hargatotal11, hargatotal22, hargatotal33, hargatotal45);
        }  catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
    }
    }       
   
}
    
