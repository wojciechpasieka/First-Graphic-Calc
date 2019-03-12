package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.StringTokenizer;

public class Controller {

    @FXML
    private TextField input;

    @FXML
    void point(ActionEvent event) {
        String text = input.getText();
        input.setText(text + ".");
    }

    @FXML
    void add(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "+");
    }

    @FXML
    void divide(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "/");
    }

    @FXML
    void multiply(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "*");
    }

    @FXML
    void remove(ActionEvent event) {
        input.setText("");
    }

    @FXML
    void result(ActionEvent event) {
        String text = input.getText().replace(",", ".");


        try{
            Double result = Calculator.count(text);
            input.setText(String.format("%.3f", result));
        }catch (Exception e){
            String result = "Something went wrong :(";
            input.setText(result);
        }
    }

    @FXML
    void subtract(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "-");
    }

    @FXML
    void toEight(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "8");

    }

    @FXML
    void toFive(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "5");
    }

    @FXML
    void toFour(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "4");
    }

    @FXML
    void toNine(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "9");
    }

    @FXML
    void toOne(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "1");
    }

    @FXML
    void toSeven(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "7");
    }

    @FXML
    void toSix(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "6");
    }

    @FXML
    void toThree(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "3");
    }

    @FXML
    void toTwo(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "2");
    }

    @FXML
    void toZero(ActionEvent event) {
        String text = input.getText();
        input.setText(text + "0");
    }

}
