package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class baseChangeController {
	boolean binPressed;
	boolean hexPressed;
	boolean decPressed;
	boolean binPressed2;
	boolean hexPressed2;
	boolean decPressed2;

	@FXML
	private TextField text1;

	@FXML
	private RadioButton dec;

	@FXML
	private ToggleGroup group1;

	@FXML
	private RadioButton bin;

	@FXML
	private RadioButton hex;

	@FXML
	private TextField text2;

	@FXML
	private RadioButton dec2;

	@FXML
	private ToggleGroup group2;

	@FXML
	private RadioButton bin2;

	@FXML
	private RadioButton hex2;

	@FXML
	private Button convert;

	public void initialize() {
		text2.setEditable(false);

	}

	@FXML
	void pressDec(ActionEvent event) {
		decPressed = true;
		hexPressed = binPressed = false;

	}

	@FXML
	void pressDec2(ActionEvent event) {
		decPressed2 = true;
		hexPressed2 = binPressed2 = false;
	}

	@FXML
	void pressBin(ActionEvent event) {
		binPressed = true;
		hexPressed = decPressed = false;
	}

	@FXML
	void pressBin2(ActionEvent event) {
		binPressed2 = true;
		hexPressed2 = decPressed2 = false;

	}

	@FXML
	void pressHex(ActionEvent event) {
		hexPressed = true;
		binPressed = decPressed = false;

	}

	@FXML
	void pressHex2(ActionEvent event) {
		hexPressed2 = true;
		binPressed2 = decPressed2 = false;

	}

	@FXML
	void computeHandler(ActionEvent event) {
		try {
			//Checks to make sure that there are two states selected.
			if((decPressed == false && hexPressed == false && binPressed == false) ||
					(decPressed2 == false && hexPressed2 == false && binPressed2 == false)) {
				application.ErrorMessage.display("Error", "Select two states.");
			}
		
			//checks which two ratio buttons are active at the moment. Relies on the other calls of the press functions.
			if (decPressed && hexPressed2) {
				text2.setText(Integer.toHexString(Integer.parseInt(text1.getText())).toUpperCase());
			} else if (decPressed && binPressed2) {
				text2.setText(Integer.toBinaryString(Integer.parseInt(text1.getText())));
			} else if (hexPressed && decPressed2) {
				text2.setText(Integer.toString(Integer.parseInt(text1.getText(),16)));
			} else if (hexPressed && binPressed2) {
				text2.setText(Integer.toBinaryString(Integer.parseInt(text1.getText(),16)));
			} else if (binPressed && decPressed2) {
				text2.setText(Integer.toString(Integer.parseInt(text1.getText(),2)));

			} else if (binPressed && hexPressed2) {
				text2.setText(Integer.toHexString(Integer.parseInt(text1.getText(),2)).toUpperCase());
			}
			else {
				text2.setText(text1.getText());
			}
		}
		catch (Exception e) {
			application.ErrorMessage.display("Error", "Invalid format Exception");
			text1.setText("");
			text2.setText("");
		}
		
	}

}
