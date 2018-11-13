package com.mycompany.mavenproject2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

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
    private Button addQuest;
    @FXML
    private Button clear;
    @FXML
    private Button close;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void AddQuestion(ActionEvent evt){
        Question q = new Question();
        q.setQuestion(question.getText());
        q.setOpt1(optA.getText());
        q.setOpt2(optB.getText());
        q.setOpt3(optC.getText());
        q.setOpt4(optD.getText());
        q.setAns((String) ans.getValue());
        
    }

    @FXML
    public void Clear(ActionEvent evt) {
        question.clear();
        optA.clear();
        optB.clear();
        optC.clear();
        optD.clear();

    }

    @FXML
    private void Close(ActionEvent event) {
    }
}

//[Help 1] http://cwiki.apache.org/confluence/display/MAVEN/DependencyResolutionException