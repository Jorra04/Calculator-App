package controller;

import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
	static boolean operatorPressed;
	static boolean computationComplete;
	String num1 = "";
	String num2 = "";
	char operator = ' ';
	float val = 0;
	
	@FXML
	private TextField display;
	@FXML
	private Button ans;
	@FXML
	private Button one;

	@FXML
	private Button two;

	@FXML
	private Button mul;

	@FXML
	private Button nine;

	@FXML
	private Button eight;

	@FXML
	private Button seven;

	@FXML
	private Button sub;

	@FXML
	private Button six;

	@FXML
	private Button five;

	@FXML
	private Button four;

	@FXML
	private Button add;

	@FXML
	private Button three;

	@FXML
	private Button clearAll;

	@FXML
	private Button equals;

	@FXML
	private Button zero;

	@FXML
	private Button div;

	void initialize() {
		display.setEditable(false);
	}

	@FXML
	void onePressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "1");
		if (!operatorPressed) {

			num1 += 1;
		} else {
			num2 += 1;
		}

	}

	@FXML
	void twoPressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "2");
		if (!operatorPressed) {
			num1 += 2;
		} else {
			num2 += 2;
		}
	}

	@FXML
	void threePressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "3");
		if (!operatorPressed) {
			num1 += 3;

		} else {
			num2 += 3;
		}
	}

	@FXML
	void fourPressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "4");

		if (!operatorPressed) {
			num1 += 4;
		} else {
			num2 += 4;
		}
	}

	@FXML
	void fivePressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "5");

		if (!operatorPressed) {
			num1 += 5;
		} else {
			num2 += 5;
		}
	}

	@FXML
	void sixPressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "6");

		if (!operatorPressed) {
			num1 += 6;
		} else {
			num2 += 6;
		}
	}

	@FXML
	void sevenPressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "7");

		if (!operatorPressed) {
			num1 += 7;
		} else {
			num2 += 7;
		}
	}

	@FXML
	void eightPressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "8");

		if (!operatorPressed) {
			num1 += 8;
		} else {
			num2 += 8;
		}
	}

	@FXML
	void ninePressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "9");

		if (!operatorPressed) {
			num1 += 9;
		} else {
			num2 += 9;
		}
	}

	@FXML
	void zeroPressed(ActionEvent event) {
		if(computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "0");

		if (!operatorPressed) {
			num1 += 0;
		} else {
			num2 += 0;
		}
	}
	@FXML
	void ansPressed(ActionEvent event) {
		display.clear();
		display.setText(display.getText() + val);

		if (!operatorPressed) {
			num1 +=val;
		} else {
			num2 += 0;
		}
	}

	@FXML
	void addition(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		display.setText(display.getText() + "+");
		operator = '+';

	}

	@FXML
	void subtraction(ActionEvent event) {
		computationComplete = false;
		operatorPressed = true;
		display.setText(display.getText() + "-");
		operator = '-';

	}

	@FXML
	void multiply(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		display.setText(display.getText() + "x");
		operator = '*';

	}

	@FXML
	void divide(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		display.setText(display.getText() + "/");
		operator = '/';
	}

	@FXML
	void compute(ActionEvent event) {
//		display.setText(display.getText() + "/");
//		System.out.println(num1);
//		System.out.println(num2);
		if(num1.isBlank() || num1.isEmpty()) {
			num1+=0;
		}
		if(num2.isBlank() || num2.isEmpty()) {
			num2+=0;
		}
		if (operator == '+') {
			val = Float.parseFloat(num1) + Float.parseFloat(num2);
			display.setText(Float.toString(val));

		} else if (operator == '-') {
			val = Float.parseFloat(num1) - Float.parseFloat(num2);
			display.setText(Float.toString(val));

		} else if (operator == '*') {
			val = Float.parseFloat(num1) * Float.parseFloat(num2);
			display.setText(Float.toString(val));

		} else if (operator == '/') {
			float v2 = Float.parseFloat(num2);
			if(v2 == 0) {
				display.setText("ERROR DIV BY 0");
			}
			else {
				val =  Float.parseFloat(num1) / v2;
				display.setText(Float.toString(val));
			}
			
		}
		else {
			display.setText(num1);
		}
		num1 = "";
		num2 = "";
		computationComplete = true;
		operatorPressed = false;

	}

	@FXML
	void clearButton(ActionEvent event) {
		operatorPressed = false;
		num1 = " ";
		num2 = " ";
		display.clear();
		
	}

}
