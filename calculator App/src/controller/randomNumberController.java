package controller;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class randomNumberController {
	

    
    @FXML
    private Button compute;

    @FXML
    private TextField min;

    @FXML
    private TextField max;

    @FXML
    private TextField output;
    
    
    @FXML
    void randRange(ActionEvent event) {
    	try {
    		int low;
    		
    		if(min.getText().isEmpty()) {
    			low = 0;
    		}
    		else {
    			low=Integer.parseInt(min.getText()); 
    		}
    		Random rand = new Random();
        	int high = Integer.parseInt(max.getText());
        	
        	int res = rand.nextInt(high-low ) + low;
        	output.setText(res+ "");
    	}
    	catch(Exception e) {
    		applicationMessages.ErrorMessage.display("Error", "Invalid number format");
    		min.clear();
    		max.clear();
    	}
    	
    	
    }
    
   

}
