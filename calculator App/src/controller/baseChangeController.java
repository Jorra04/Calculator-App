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
	boolean octPressed;
	boolean binPressed2;
	boolean hexPressed2;
	boolean decPressed2;
	boolean octPressed2;

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
		dec.setSelected(true);
		bin2.setSelected(true);
		decPressed = true;
		binPressed2 = true;

	}

	@FXML
	void pressDec(ActionEvent event) {
		decPressed = true;
		hexPressed = binPressed = octPressed= false;

	}

	@FXML
	void pressDec2(ActionEvent event) {
		decPressed2 = true;
		hexPressed2 = binPressed2 = octPressed2=false;
	}

	@FXML
	void pressBin(ActionEvent event) {
		binPressed = true;
		hexPressed = decPressed = octPressed= false;
	}

	@FXML
	void pressBin2(ActionEvent event) {
		binPressed2 = true;
		hexPressed2 = decPressed2 = octPressed2= false;

	}

	@FXML
	void pressHex(ActionEvent event) {
		hexPressed = true;
		binPressed = decPressed = octPressed= false;

	}

	@FXML
	void pressHex2(ActionEvent event) {
		hexPressed2 = true;
		binPressed2 = decPressed2 = octPressed2= false;

	}
	@FXML
	void pressOct(ActionEvent event) {
		octPressed = true;
		binPressed = decPressed = hexPressed = false;

	}

	@FXML
	void pressOct2(ActionEvent event) {
		octPressed2 = true;
		binPressed2 = decPressed2 = hexPressed2 = false;

	}


	@FXML
	void computeHandler(ActionEvent event) {
		try {
			// checks which two ratio buttons are active at the moment. Relies on the other
			// calls of the press functions.
			if (decPressed && hexPressed2) {
				text2.setText(Integer.toHexString(Integer.parseInt(text1.getText())).toUpperCase());
			} else if (decPressed && binPressed2) {
				text2.setText(Integer.toBinaryString(Integer.parseInt(text1.getText())));
			} else if (decPressed && octPressed2) {
				text2.setText(Integer.toOctalString(Integer.parseInt(text1.getText())));
			} else if (hexPressed && decPressed2) {
				text2.setText(Integer.toString(Integer.parseInt(text1.getText(), 16)));
			} else if (hexPressed && binPressed2) {
				text2.setText(Integer.toBinaryString(Integer.parseInt(text1.getText(), 16)));
			} else if (hexPressed && octPressed2) {
				text2.setText(Integer.toOctalString(Integer.parseInt(text1.getText(),16)));
			} else if (binPressed && decPressed2) {
				text2.setText(Integer.toString(Integer.parseInt(text1.getText(), 2)));
			} else if (binPressed && hexPressed2) {
				text2.setText(Integer.toHexString(Integer.parseInt(text1.getText(), 2)).toUpperCase());
			} else if (binPressed && octPressed2) {
				text2.setText(Integer.toOctalString(Integer.parseInt(text1.getText(),2)));
			} else if (octPressed && decPressed2) {
				text2.setText(Integer.toString(Integer.parseInt(text1.getText(),8)));
			} else if (octPressed && binPressed2) {
				text2.setText(Integer.toBinaryString(Integer.parseInt(text1.getText(),8)));
			} else if (octPressed && hexPressed) {
				text2.setText(Integer.toHexString(Integer.parseInt(text1.getText(),8)));
			}

			else {
				text2.setText(text1.getText());
			}
		} catch (Exception e) {
			applicationMessages.ErrorMessage.display("Error", "Invalid format Exception");
			text1.setText("");
			text2.setText("");
		}

	}

}
