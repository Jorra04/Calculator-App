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
    	applicationWindows.matrixWindow.display("matrix");
    }
    @FXML
    void randomNumHandler(ActionEvent event) throws Exception{
    	applicationWindows.randomNumberGeneratorWindow.display("Random Number Generator");
    }
}
