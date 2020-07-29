/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author tenzintashi
 */
public class CalGUIController implements Initializable {

    @FXML
    private Label lblResult;
    @FXML
    private Button btn5;
    @FXML
    private Button btn4;
    @FXML
    private Button btn7;
    @FXML
    private Button btn9;
    @FXML
    private Button btn8;
    @FXML
    private Button btn6;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn0;
    @FXML
    private Button btnPoint;
    @FXML
    private Button btnEqual;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnSub;
    @FXML
    private Button btnMul;
    @FXML
    private Button btnDiv;
    @FXML
    private Button btnChangeSign;
    @FXML
    private Button btnPercentage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    String num="",opp;
    double num1=0,num2=0;
    @FXML
    public void btn1(){
        num += "1";
        lblResult.setText(num);
    }
    @FXML
    public void btn2(){
        num += "2";
        lblResult.setText(num);
    }
    @FXML
    public void btn3(){
        num += "3";
        lblResult.setText(num);
    }
    @FXML
    public void btn4(){
        num += "4";
        lblResult.setText(num);
    }
    @FXML
    public void btn5(){
        num += "5";
        lblResult.setText(num);
    }
    @FXML
    public void btn6(){
        num += "6";
        lblResult.setText(num);
    }
    @FXML
    public void btn7(){
        num += "7";
        lblResult.setText(num);
    }
    @FXML
    public void btn8(){
        num += "8";
        lblResult.setText(num);
    }
    @FXML
    public void btn9(){
        num += "9";
        lblResult.setText(num);
    }
    @FXML
    public void btn0(){
        num += "0";
        lblResult.setText(num);
    }
    @FXML
    public void btnClear(){
        lblResult.setText("");
        num = "";
    }
    @FXML
    public void btnAdd(){
        num1 = Double.parseDouble(num);
        lblResult.setText("");
        opp = "+";
        num = "";
    }
    @FXML
    public void btnSub(){
        num1 = Double.parseDouble(num);
        lblResult.setText("");
        opp = "-";
        num = "";
    }
    @FXML
    public void btnMul(){
        num1 = Double.parseDouble(num);
        lblResult.setText("");
        opp = "*";
        num = "";
    }
    @FXML
    public void btnDiv(){
        num1 = Double.parseDouble(num);
        lblResult.setText("");
        opp = "/";
        num = "";
    }
    @FXML
    public void btnPer(){
        num1 = Double.parseDouble(num);
        lblResult.setText("");
        opp = "%";
        num = "";
        btnEqual();
        
    }
    @FXML
    public void btnChangeSign(){
        num1 = Double.parseDouble(num);
        num1 *= -1;
        num = Double.toString(num1);
        lblResult.setText(num);
    }
    @FXML
    public void btnPoint(){
        num += ".";
        lblResult.setText(num);
    }
    @FXML
    public void btnEqual(){
        num2 = Double.parseDouble(num);
        switch (opp) {
            case "+":
                lblResult.setText(String.format("%.1f\n", (num1 + num2)));
                break;
            case "-":
                lblResult.setText(String.format("%.1f\n", (num1 - num2)));
                break;
            case "*":
                lblResult.setText(String.format("%.1f\n", (num1 * num2)));
                break;
            case "/":
                lblResult.setText(String.format("%.1f\n", (num1 / num2)));
                break;
            case "%":
                lblResult.setText(String.format("%.1f\n", (num1/100)*num2));
                break;
            default:
                break;
        }
    }
}
