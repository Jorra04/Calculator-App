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
	    private Button permutation;

	    @FXML
	    private Button choose;

	    @FXML
	    private Button GCD;

	    @FXML
	    private Button fibseq;
    
    
    @FXML
    void matrixHandler(ActionEvent event)throws Exception {
    	applicationWindows.matrixWindow.display("matrix");
    }
    @FXML
    void randomNumHandler(ActionEvent event) throws Exception{
    	applicationWindows.randomNumberGeneratorWindow.display("Random Number Generator");
    }
    @FXML
    void gcdHandler(ActionEvent event) throws Exception{
    	applicationWindows.gcdWindow.display("GCD");
    }
    @FXML
    void logarithm(ActionEvent event) throws Exception{
    	applicationWindows.gcdWindow.display("GCD");
    }
    @FXML
    void permutation(ActionEvent event) throws Exception{
    	applicationWindows.permutationWindow.display("Permutation");
    }
    @FXML
    void choose(ActionEvent event) throws Exception{
    	applicationWindows.chooseWindow.display("Choose");
    }
    @FXML
    void fibSeq(ActionEvent event) throws Exception{
    	applicationWindows.fibSeqWindow.display("Fibonacci Sequence");
    }
}
