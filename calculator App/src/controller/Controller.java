package controller;

import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

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
    private Button Binary;

    @FXML
    private Button hex;

    @FXML
    private Button decimal;

    @FXML
    private Button signSwap;
    
	public void initialize() {
		display.setEditable(false);
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
		operator = '\''; //because i used char to disclose the operator, ** wont work, so i use @.
	}
	@FXML
	void factorial(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		display.setText(display.getText() + "!");
		operator = '!'; 
	}
	@FXML
	void sqrt(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		display.setText("sqrt("+display.getText()+")");
		operator = 'r'; 
	}
	@FXML
	void negate(ActionEvent event) {
		operatorPressed = true;
		computationComplete = false;
		operator = 'n'; 
	}
	

	@FXML
	void compute(ActionEvent event) {
		if(num1.isBlank() || num1.isEmpty()) {
			num1 += val;
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
		else if(operator == '^') {
			val = (float)Math.pow(Float.parseFloat(num1), Float.parseFloat(num2));
			display.setText(Float.toString(val));
		}
		else if(operator == '\'') {
			val = (float)Math.pow(Float.parseFloat(num1), 2);
			display.setText(Float.toString(val));
		}
		else if(operator == '!') {
			val = factorial(Float.parseFloat(num1));
			display.setText(Float.toString(val));
		}
		else if(operator == 'r') {
			val = (float) Math.sqrt(Float.parseFloat(num1));
			display.setText(Float.toString(val));
		}
		else if(operator == 'n') {
			float val1 =Float.parseFloat(num1);
			val = -1*val1;
			display.setText(Float.toString(val));
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
		computationComplete = true;
		operatorPressed = false;
		num1 = " ";
		num2 = " ";
		val = 0;
		display.clear();
		
	}
	
	
	void addNum(int num) {
		if(computationComplete) {
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
		for(int i = 1; i <= num; i ++) {
			val*=i;
		}
		return val;
	}
}
