package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class matrixController {
	@FXML
    private AnchorPane pane;

    @FXML
    private SplitMenuButton matrixType;

    @FXML
    private MenuItem threeThree;

    @FXML
    private MenuItem threeTwo;

    @FXML
    private MenuItem threeOne;

    @FXML
    private MenuItem twoThree;

    @FXML
    private MenuItem twoTwo;

    @FXML
    private MenuItem twoOne;

    @FXML
    private MenuItem oneThree;

    @FXML
    private MenuItem oneTwo;
    @FXML
    private Button clearVals;

    @FXML
    private Button compute;
    @FXML
    private Pane matrixPane;
	 
	 
	 
	 @FXML
	 void threeThree(ActionEvent event ) {
		 matrixPane.getChildren().clear();
		 matrixType.setText(threeThree.getText());
		 TextField oneOne = new TextField();
		 oneOne.setPrefSize(87, 11);
		 oneOne.setLayoutX(34);
		 oneOne.setLayoutY(40);
		 TextField oneTwo = new TextField();
		 oneTwo.setPrefSize(87, 11);
		 oneTwo.setLayoutX(140);
		 oneTwo.setLayoutY(40);
		 TextField oneThree = new TextField();
		 oneThree.setPrefSize(87, 11);
		 oneThree.setLayoutX(246);
		 oneThree.setLayoutY(40);
		 TextField twoOne = new TextField();
		 twoOne.setPrefSize(87, 11);
		 twoOne.setLayoutX(34);
		 twoOne.setLayoutY(120);
		 TextField twoTwo = new TextField();
		 twoTwo.setPrefSize(87, 11);
		 twoTwo.setLayoutX(140);
		 twoTwo.setLayoutY(120);
		 TextField twoThree = new TextField();
		 twoThree.setPrefSize(87, 11);
		 twoThree.setLayoutX(246);
		 twoThree.setLayoutY(120);
		 TextField threeOne = new TextField();
		 threeOne.setPrefSize(87, 11);
		 threeOne.setLayoutX(34);
		 threeOne.setLayoutY(200);
		 TextField threeTwo = new TextField();
		 threeTwo.setPrefSize(87, 11);
		 threeTwo.setLayoutX(140);
		 threeTwo.setLayoutY(200);
		 TextField threeThree = new TextField();
		 threeThree.setPrefSize(87, 11);
		 threeThree.setLayoutX(246);
		 threeThree.setLayoutY(200);
		 
		 matrixPane.getChildren().addAll(oneOne,oneTwo,oneThree,twoOne,twoTwo,twoThree,threeOne,threeTwo,threeThree);
		
	 }
	 @FXML
	 void threeTwo(ActionEvent event ) {
		 matrixPane.getChildren().clear();
		 matrixType.setText(threeTwo.getText());
		 TextField oneOne = new TextField();
		 oneOne.setPrefSize(87, 11);
		 oneOne.setLayoutX(34);
		 oneOne.setLayoutY(40);
		 TextField oneTwo = new TextField();
		 oneTwo.setPrefSize(87, 11);
		 oneTwo.setLayoutX(140);
		 oneTwo.setLayoutY(40);
		 TextField oneThree = new TextField();
		 oneThree.setPrefSize(87, 11);
		 oneThree.setLayoutX(246);
		 oneThree.setLayoutY(40);
		 TextField twoOne = new TextField();
		 twoOne.setPrefSize(87, 11);
		 twoOne.setLayoutX(34);
		 twoOne.setLayoutY(120);
		 TextField twoTwo = new TextField();
		 twoTwo.setPrefSize(87, 11);
		 twoTwo.setLayoutX(140);
		 twoTwo.setLayoutY(120);
		 TextField twoThree = new TextField();
		 twoThree.setPrefSize(87, 11);
		 twoThree.setLayoutX(246);
		 twoThree.setLayoutY(120);
		 matrixPane.getChildren().addAll(oneOne,oneTwo,oneThree,twoOne,twoTwo,twoThree);
		 
	 }
	 @FXML
	 void threeOne(ActionEvent event ) {
		 matrixPane.getChildren().clear();
		 matrixType.setText(threeOne.getText());
		 TextField oneOne = new TextField();
		 oneOne.setPrefSize(87, 11);
		 oneOne.setLayoutX(34);
		 oneOne.setLayoutY(40);
		 TextField oneTwo = new TextField();
		 oneTwo.setPrefSize(87, 11);
		 oneTwo.setLayoutX(140);
		 oneTwo.setLayoutY(40);
		 TextField oneThree = new TextField();
		 oneThree.setPrefSize(87, 11);
		 oneThree.setLayoutX(246);
		 oneThree.setLayoutY(40);
		 matrixPane.getChildren().addAll(oneOne,oneTwo,oneThree);
	 }
	 @FXML
	 void twoTwo(ActionEvent event ) {
		 matrixPane.getChildren().clear();
		 matrixType.setText(twoTwo.getText());
		 TextField oneOne = new TextField();
		 oneOne.setPrefSize(87, 11);
		 oneOne.setLayoutX(34);
		 oneOne.setLayoutY(40);
		 TextField oneTwo = new TextField();
		 oneTwo.setPrefSize(87, 11);
		 oneTwo.setLayoutX(140);
		 oneTwo.setLayoutY(40);
		 TextField twoOne = new TextField();
		 twoOne.setPrefSize(87, 11);
		 twoOne.setLayoutX(34);
		 twoOne.setLayoutY(120);
		 TextField twoTwo = new TextField();
		 twoTwo.setPrefSize(87, 11);
		 twoTwo.setLayoutX(140);
		 twoTwo.setLayoutY(120);
		 matrixPane.getChildren().addAll(oneOne,oneTwo,twoOne,twoTwo);

	 }
	 @FXML
	 void twoOne(ActionEvent event ) {
		 matrixPane.getChildren().clear();
		 matrixType.setText(twoOne.getText());
		 TextField oneOne = new TextField();
		 oneOne.setPrefSize(87, 11);
		 oneOne.setLayoutX(34);
		 oneOne.setLayoutY(40);
		 TextField twoOne = new TextField();
		 twoOne.setPrefSize(87, 11);
		 twoOne.setLayoutX(34);
		 twoOne.setLayoutY(120);
		 matrixPane.getChildren().addAll(oneOne,twoOne);

	 }
}
