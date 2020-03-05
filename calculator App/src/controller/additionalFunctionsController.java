package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class additionalFunctionsController {
	@FXML
    private Button matrix;

    @FXML
    private Button randomNum;

    @FXML
    private Button logarithm;
    
    
    @FXML
    void matrixHandler(ActionEvent event)throws Exception {
    	application.matrixWindow.display("matrix");
    }
}
