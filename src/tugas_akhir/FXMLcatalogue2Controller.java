/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
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
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLcatalogue2Controller {

        @FXML
    private JFXCheckBox beli4;
    @FXML
    private JFXCheckBox beli5;
    @FXML
    private JFXCheckBox beli6;
    @FXML
    private JFXButton finish;
    @FXML
    private JFXButton back;
    @FXML
    private JFXButton oke;
    @FXML
    private TextArea jumlah;
       
    
    int hargatotal1, hargatotal4, hargatotal5, hargatotal33,
        hargatotal6, hargatotal44, hargatotal55, hargatotal66, hargatotal45;
    int harga;
 
    
    @FXML
    private void shop4(ActionEvent event) {
    }

    @FXML
    private void shop5(ActionEvent event) {
    }

    @FXML
    private void shop6(ActionEvent event) {
    }
    
    
    @FXML
    void kembali(ActionEvent event) throws IOException {
        
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLcatalogue.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 699, 398);
            
     
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("OSHIRT");
            stage.show();
    }

    
    @FXML
    private void proses() {
        if(beli4.isSelected()){     
            harga = 220000;
            jumlah.setText("  Rp."+ harga );
        }
        if(beli5.isSelected()){     
            harga = 100000+755000;
            jumlah.setText("  Rp."+ harga );
        }
         if(beli6.isSelected()) {
             harga = 225000+755000;
             hargatotal6=harga;
             jumlah.setText("  Rp."+ harga );
         }
         else if(beli4.isSelected() && beli5.isSelected()) {
             hargatotal44=220000+100000+755000;
             jumlah.setText("  Rp."+ hargatotal44 );
         }
         if(beli4.isSelected() && beli6.isSelected()) {
             hargatotal55=220000+225000+755000;
             jumlah.setText("  Rp."+ hargatotal55 );
         }
         else if(beli5.isSelected() && beli6.isSelected()) {
             hargatotal66=100000+225000+755000;
             jumlah.setText("  Rp."+ hargatotal66 );
        
        }
    }

    void setdata(int harga, int hargatotal1, int hargatotal2, int hargatotal3, 
            int hargatotal11, int hargatotal22, int hargatotal33, int hargatotal45) {
        
        jumlah.setText(" "+hargatotal11);
        jumlah.setText(" "+hargatotal22);
        jumlah.setText(" "+hargatotal2);
        jumlah.setText(" "+hargatotal3);
        jumlah.setText("  Rp."+hargatotal33);
        jumlah.setText("  Rp."+hargatotal45);  
    }
    @FXML
    private void selesai(ActionEvent event) {
         proses();
        try{
            JOptionPane.showMessageDialog(null, "CONGRATULATION \n YOU NEED TO PAY Rp.855000,-");
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLmari.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Form Hasil");
            stage.show();
            FXMLmariController Data = new FXMLmariController();
            Data = fxmlLoader.getController();
        }  catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
    }
    }
}

