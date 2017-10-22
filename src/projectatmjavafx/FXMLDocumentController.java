/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatmjavafx;

import com.jfoenix.controls.JFXButton;
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
import javax.swing.JOptionPane;
import org.controlsfx.control.textfield.CustomPasswordField;

/**
 * FXML Controller class
 *
 * @author Mutiara
 */
public class FXMLDocumentController implements Initializable {
    String pin="";
    String PIN="1234";
    int kesempatan=3;
    int tmp;
    @FXML
    private CustomPasswordField editPin;
    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button3;
    @FXML
    private JFXButton button4;
    @FXML
    private JFXButton button5;
    @FXML
    private JFXButton button6;
    @FXML
    private JFXButton button7;
    @FXML
    private JFXButton button8;
    @FXML
    private JFXButton button9;
    @FXML
    private JFXButton buttonc;
    @FXML
    private JFXButton button0;
    @FXML
    private JFXButton buttonok;
    @FXML
    private JFXButton button2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void button1(ActionEvent event) {
        pin += "1";
        editPin.setText(pin);
    }

    @FXML
    private void button3(ActionEvent event) {
         pin += "3";
        editPin.setText(pin);
    }

    @FXML
    private void button4(ActionEvent event) {
         pin += "4";
        editPin.setText(pin);
    }

    @FXML
    private void button5(ActionEvent event) {
         pin += "5";
        editPin.setText(pin);
    }

    @FXML
    private void button6(ActionEvent event) {
         pin += "6";
        editPin.setText(pin);
    }

    @FXML
    private void button7(ActionEvent event) {
         pin += "7";
        editPin.setText(pin);
    }

    @FXML
    private void button8(ActionEvent event) {
         pin += "8";
        editPin.setText(pin);
    }

    @FXML
    private void button9(ActionEvent event) {
         pin += "9";
        editPin.setText(pin);
    }

    @FXML
    private void buttonc(ActionEvent event) {
         pin += "";
        editPin.setText(pin);
    }

    @FXML
    private void button0(ActionEvent event) {
         pin += "0";
        editPin.setText(pin);
    }

    @FXML
    private void buttonok(ActionEvent event) {
        if (pin.equals(PIN)){
           try{ ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("MenuAwal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("MenuAwal");
            stage.show();
        }catch(IOException e){
            System.out.println("Failed to create new Window."+e);
        }
        }  else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN salah \nTersisa " + kesempatan + "kesempatan lagi");
            editPin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }

    }

    @FXML
     void button2(ActionEvent event) {
          pin += "2";
        editPin.setText(pin);
    }
    
}
