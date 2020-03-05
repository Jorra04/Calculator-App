package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;;

public class gcdController {
	@FXML
    private TextField value1;

    @FXML
    private TextField value2;

    @FXML
    private Button compute;

    @FXML
    private Button clear;

    @FXML
    private TextField output;
    
    public void initialize() {
    	output.setEditable(false);
    }
    
    @FXML
    void computeGcd(ActionEvent event) {
    	int val1 = Integer.parseInt(value1.getText());
    	int val2 = Integer.parseInt(value2.getText());
    	int gcd =0;
    	for(int i = 1; i <= val1 && i <= val2; i++)
        {
            if(val1%i==0 && val2%i==0)
                gcd = i;
        }
    	
    	output.setText(gcd +"");
    	
    	
    }
}
