/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Myah
 */
public class ModifyController implements Initializable {

    @FXML
    private AnchorPane modify;
    @FXML
    private TextField optA;
    @FXML
    private TextField optB;
    @FXML
    private TextField optC;
    @FXML
    private TextField optD;
    @FXML
    private ComboBox<String> ans;
    @FXML
    private TextArea question;
    @FXML
    private Button clear;
    @FXML
    private Button delete;
    @FXML
    private Button close;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    

    @FXML
    private void Clear(ActionEvent event) {
    }

    @FXML
    private void Delete(ActionEvent event) {
    }

    @FXML
    private void Close(ActionEvent event) {
    }
    
}
