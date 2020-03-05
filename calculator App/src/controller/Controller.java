package controller;

import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
	static boolean operatorPressed;
	static boolean computationComplete;
	boolean inRads;
	String num1 = "";
	String num2 = "";
	char operator = ' ';
	float val = 0;

	@FXML
	private TextField display;

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

	@FXML
	private Button ans;

	@FXML
	private Button factorial;

	@FXML
	private Button sqrt;

	@FXML
	private Button square;

	@FXML
	private Button exp1;

	@FXML
	private Button baseChange;

	@FXML
	private Button signSwap;
	@FXML
	private Button sin;

	@FXML
	private Button cos;

	@FXML
	private Button tan;
	@FXML
	private RadioButton degrees;

	@FXML
	private RadioButton radians;

	@FXML
	private Button decimalVal;

	@FXML
	private Button pi;

	public void initialize() {
		display.setEditable(false);
		degrees.setSelected(true);
	}

	@FXML
	void onePressed(ActionEvent event) {
		addNum(1);

	}

//	@FXML
//	void oneKeyPressed(KeyEvent event) {
//		if(event.getCode().equals(KeyCode.ENTER)) {
//			addNum(1);
//		}
//	}
	@FXML
	void rads(ActionEvent event) {
		inRads = true;
	}

	@FXML
	void degrees(ActionEvent event) {
		inRads = false;
	}

	@FXML
	void twoPressed(ActionEvent event) {
		addNum(2);
	}

	@FXML
	void threePressed(ActionEvent event) {
		addNum(3);
	}

	@FXML
	void fourPressed(ActionEvent event) {
		addNum(4);
	}

	@FXML
	void fivePressed(ActionEvent event) {
		addNum(5);
	}

	@FXML
	void sixPressed(ActionEvent event) {
		addNum(6);
	}

	@FXML
	void sevenPressed(ActionEvent event) {
		addNum(7);
	}

	@FXML
	void eightPressed(ActionEvent event) {
		addNum(8);
	}

	@FXML
	void ninePressed(ActionEvent event) {
		addNum(9);
	}

	@FXML
	void zeroPressed(ActionEvent event) {
		addNum(0);
	}

	@FXML
	void decimalValPressed(ActionEvent event) {
		display.setText(display.getText() + ".");
		if (!operatorPressed) {

			num1 += ".";
		} else {
			num2 += ".";
		}
		computationComplete = false;
	}

	@FXML
	void piPressed(ActionEvent event) {
		if (computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + "π");
		System.out.println(num1+ "-->" + num1.length());
		System.out.println(num1 + "-->" + num2.length());
		if(num1.length() !=0 && num2.length()!= 0) {
			if (!operatorPressed) {

				num1 = "" + Float.parseFloat(num1) * Math.PI;
			} else {
				num2 = "" + Float.parseFloat(num2) * Math.PI;
			}
			computationComplete = false;
		}
		else {
			if (!operatorPressed) {

				num1 +=  Math.PI;
			} else {
				num2 +=Math.PI;
			}
			computationComplete = false;
		}
		
	}

	@FXML
	void ansPressed(ActionEvent event) {
		display.clear();
		display.setText(display.getText() + val);

		if (!operatorPressed) {
			num1 += val;
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
	void exponentiate(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		display.setText(display.getText() + "^");
		operator = '^';
	}

	@FXML
	void square(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		display.setText(display.getText() + "^2");
		operator = '\''; // because i used char to disclose the operator, ** wont work, so i use @.
	}

	@FXML
	void factorial(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		display.setText(display.getText() + "!");
		operator = '!';
		Operations();
	}

	@FXML
	void sqrt(ActionEvent event) {
		
		operatorPressed = true;
		computationComplete = false;
		display.setText("sqrt(" + display.getText() + ")");
		operator = 'r';
		Operations();
	}

	@FXML
	void negate(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		operator = 'n';
		Operations();
	}

	@FXML
	void baseChange(ActionEvent event) throws Exception {
		application.baseChangeWindow.display("Base Change Coversion");
	}

	@FXML
	void sine(ActionEvent event) {
		if (computationComplete) {
			display.clear();
		}
		operatorPressed = true;
		computationComplete = false;
		display.setText("sin(" + display.getText() + ")");
		operator = 's'; // s for sine
		Operations();
	}

	@FXML
	void cosine(ActionEvent event) {
		if (computationComplete) {
			display.clear();
		}
		operatorPressed = true;
		computationComplete = false;
		display.setText("cos(" + display.getText() + ")");
		operator = 'c'; // c for cosine
		Operations();
	}

	@FXML
	void tangent(ActionEvent event) {
		if (computationComplete) {
			display.clear();
		}
		
		operatorPressed = true;
		computationComplete = false;
		display.setText("tan(" + display.getText() + ")");
		operator = 't'; // t for tangent
		Operations();
	}

	@FXML
	void compute(ActionEvent event) {
		Operations();
	}

	@FXML
	void clearButton(ActionEvent event) {
		computationComplete = true;
		operatorPressed = false;
		num1 = "";
		num2 = "";
		val = 0;
		display.clear();
	}

	void addNum(int num) {
		if (computationComplete) {
			display.clear();
		}
		display.setText(display.getText() + num);
		if (!operatorPressed) {

			num1 += num;
		} else {
			num2 += num;
		}
		computationComplete = false;
	}

	float factorial(float num) {
		float val = 1;
		for (int i = 1; i <= num; i++) {
			val *= i;
		}
		return val;
	}

	void Operations() {
		if (num1.isBlank() || num1.isEmpty()) {
			num1 += val;
		}
		if (num2.isBlank() || num2.isEmpty()) {
			num2 += 0;
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
			if (v2 == 0) {
				display.setText("ERROR DIV BY 0");
			} else {
				val = Float.parseFloat(num1) / v2;
				display.setText(Float.toString(val));
			}

		} else if (operator == '^') {
			val = (float) Math.pow(Float.parseFloat(num1), Float.parseFloat(num2));
			display.setText(Float.toString(val));
		} else if (operator == '\'') {
			val = (float) Math.pow(Float.parseFloat(num1), 2);
			display.setText(Float.toString(val));
		} else if (operator == '!') {
			val = factorial(Float.parseFloat(num1));
			display.setText(Float.toString(val));
		} else if (operator == 'r') {
			val = (float) Math.sqrt(Float.parseFloat(num1));
			display.setText(Float.toString(val));
		} else if (operator == 'n') {
			float val1 = Float.parseFloat(num1);
			val = -1 * val1;
			display.setText(Float.toString(val));
		} else if (operator == 's') {
			if (inRads) {
				display.setText(Float.toString((float) Math.sin((Double.parseDouble(num1)))));
				System.out.println(Math.toRadians(Math.sin(Math.PI)));
				
			} else {
				double val = Double.parseDouble(num1);
				double rad = val*(Math.PI / 180);
				
				display.setText(Float.toString((float) Math.sin(rad)));
			}

		} else if (operator == 'c') {
			if(inRads) {
				display.setText(Float.toString((float) Math.cos(Math.toRadians(Float.parseFloat(num1)))));
			}
			else {
				double val = Double.parseDouble(num1);
				double rad = val*(Math.PI / 180);
				
				display.setText(Float.toString((float) Math.cos(rad)));
			}
			
		} else if (operator == 't') {
			if(inRads) {
				display.setText(Float.toString((float) Math.tan(Math.toRadians(Double.parseDouble(num1)))));
			}
			else {
				double val = Double.parseDouble(num1);
				double rad = val*(Math.PI / 180);
				
				display.setText(Float.toString((float) Math.tan(rad)));
			}
			
			
		} else {
			display.setText(num1);
		}
		num1 = "";
		num2 = "";
		operator = ' ';
		computationComplete = true;
		operatorPressed = false;
	}
}
