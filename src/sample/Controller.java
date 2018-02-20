package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

import java.io.IOException;
import java.util.logging.*;

public class Controller {

    Logger log = Logger.getLogger(Controller.class.getName());

    //list for history of operations
    ObservableList<BooleanOperations> historyList = FXCollections.observableArrayList();
    BooleanOperations obj = new BooleanOperations();

    void initializeOperands(String valueOfOperand)
    {
        if(obj.getRezult() != "")
        {
            obj.setFirstOperand("");
            obj.setSecondOperand("");
            obj.setOperation("");
            obj.setRezult("");
            log.info("Clear object");
            labelFirstOperand.setText(obj.getFirstOperand());
            labelSecondOperand.setText(obj.getSecondOperand());
            labelOperation.setText(obj.getOperation());
            labelRezult.setText(obj.getRezult());
            labelEquals.setText("");
            log.info("Clear field");
        }
        if(obj.getOperation() == "") {
            obj.setFirstOperand(valueOfOperand);
            labelFirstOperand.setText(valueOfOperand);
            log.info("Set first operand");
        }
        else if(obj.getRezult() == "")
        {
            obj.setSecondOperand(valueOfOperand);
            labelSecondOperand.setText(valueOfOperand);
            log.info("Set second operand");
        }
    }

    void initializeOperations(String valueOfOperation)
    {
        if((obj.getFirstOperand() != "") && (obj.getSecondOperand() == ""))
        {
            obj.setOperation(valueOfOperation);
            labelOperation.setText(obj.getOperation());
            log.info("Set operation");
        }
    }

    @FXML
    private Button buttonEquals;

    @FXML
    private Label labelOperation;

    @FXML
    private Label labelRezult;

    @FXML
    private Label labelFirstOperand;

    @FXML
    private Label labelSecondOperand;

    @FXML
    private Button btnTrue;

    @FXML
    private Button btnFalse;

    @FXML
    private Button btnC;

    @FXML
    private Button btnNull;

    @FXML
    private Button buttonDisjunction;

    @FXML
    private Button buttonEquivalence;

    @FXML
    private Button buttonImplication;

    @FXML
    private Button buttonArrowPier;

    @FXML
    private Button buttonConstFalse;

    @FXML
    private Button buttonReverseImplication;

    @FXML
    private Button buttonBarcodeScheffer;

    @FXML
    private Label labelEquals;

    @FXML
    private Button buttonConstTrue;

    @FXML
    private Button buttonRepeatFirst;

    @FXML
    private Button buttonRepeatSecond;

    @FXML
    private Button buttonDenialFirst;

    @FXML
    private Button buttonConjunction;

    @FXML
    private Button buttonDenialSecond;

    @FXML
    private Button buttonAddTwoModules;

    @FXML
    private Button buttonDenialImplication;

    @FXML
    private Button buttonDenialReverseImplication;

    @FXML
    void onClickBtnC(ActionEvent event) {
        log.info("Click 'C'");
        obj.setFirstOperand("");
        obj.setSecondOperand("");
        obj.setOperation("");
        obj.setRezult("");
        log.info("Clear object");
        labelFirstOperand.setText(obj.getFirstOperand());
        labelSecondOperand.setText(obj.getSecondOperand());
        labelOperation.setText(obj.getOperation());
        labelRezult.setText(obj.getRezult());
        labelEquals.setText("");
        log.info("Clear field");
    }

    @FXML
    void onClickBtnFalse(ActionEvent event) {
        log.info("Click 'False'");
        initializeOperands("FALSE");
    }

    @FXML
    void onClickBtnNull(ActionEvent event) {
        log.info("Click 'Null'");
        initializeOperands("NULL");
    }

    @FXML
    void onClickBtnTrue(ActionEvent event) {
        log.info("Click 'True'");
        initializeOperands("TRUE");
    }

    @FXML
    void onClickBtnAddTwoModules(ActionEvent event) {
        log.info("Click '(+)'");
        initializeOperations("(+)");
    }

    @FXML
    void onClickBtnArrowPier(ActionEvent event) {
        log.info("Click '↓'");
        initializeOperations("↓");
    }

    @FXML
    void onClickBtnBarcodeScheffer(ActionEvent event) {
        log.info("Click '|'");
        initializeOperations("|");
    }

    @FXML
    void onClickBtnConjunction(ActionEvent event) {
        log.info("Click '˄'");
        initializeOperations("˄");
    }

    @FXML
    void onClickBtnConstFalse(ActionEvent event) {
        log.info("Click 'Const 0'");
        initializeOperations("(Const 0)");
    }

    @FXML
    void onClickBtnConstTrue(ActionEvent event) {
        log.info("Click 'Const 1'");
        initializeOperations("(Const 1)");
    }

    @FXML
    void onClickBtnDenialFirst(ActionEvent event) {
        log.info("Click '!first'");
        initializeOperations("(!first)");
    }

    @FXML
    void onClickBtnDenialImplication(ActionEvent event) {
        log.info("Click '!→'");
        initializeOperations("!→");
    }

    @FXML
    void onClickBtnDenialReverseImplication(ActionEvent event) {
        log.info("Click '!←'");
        initializeOperations("!←");
    }

    @FXML
    void onClickBtnDenialSecond(ActionEvent event) {
        log.info("Click '!second'");
        initializeOperations("(!second)");
    }

    @FXML
    void onClickBtnDisjunction(ActionEvent event) {
        log.info("Click '˅'");
        initializeOperations("˅");
    }

    @FXML
    void onClickBtnEquivalence(ActionEvent event) {
        log.info("Click '~'");
        initializeOperations("~");
    }

    @FXML
    void onClickBtnImplication(ActionEvent event) {
        log.info("Click '→'");
        initializeOperations("→");
    }

    @FXML
    void onClickBtnRepeatFirst(ActionEvent event) {
        log.info("Click 'Repeat ft.'");
        initializeOperations("(Repeat fr.)");
    }

    @FXML
    void onClickBtnRepeatSecond(ActionEvent event) {
        log.info("Click 'Repeat sc.'");
        initializeOperations("(Repeat sc.)");
    }

    @FXML
    void onClickBtnReverseImplication(ActionEvent event) {
        log.info("Click '←'");
        initializeOperations("←");
    }

    @FXML
    void onClickBtnEquals(ActionEvent event) {
        log.info("Click '='");
        if(obj.getSecondOperand() != "") {
            labelEquals.setText("=");
            switch (obj.getOperation()) {
                case "(+)":
                    obj.addTwoModules();
                    break;
                case "↓":
                    obj.arrowPier();
                    break;
                case "|":
                    obj.barcodeScheffer();
                    break;
                case "˄":
                    obj.conjunction();
                    break;
                case "(Const 0)":
                    obj.constFalse();
                    break;
                case "(Const 1)":
                    obj.constTrue();
                    break;
                case "(!first)":
                    obj.denialFirstOperand();
                    break;
                case "!→":
                    obj.denialImplication();
                    break;
                case "!←":
                    obj.denialReverseImplication();
                    break;
                case "(!second)":
                    obj.denialSecondOperand();
                    break;
                case "˅":
                    obj.disjunction();
                    break;
                case "~":
                    obj.equivalence();
                    break;
                case "→":
                    obj.implication();
                    break;
                case "(Repeat fr.)":
                    obj.repeatFirstOperand();
                    break;
                case "(Repeat sc.)":
                    obj.repeatSecondOperand();
                    break;
                case "←":
                    obj.reverseImplication();
                    break;
            }
            labelRezult.setText(obj.getRezult());
            log.info("Output rezult");
            historyList.add(obj);
            log.info("Add the operation in the history list");
            System.out.println(obj);
        }

    }


    @FXML
    void initialize() {
        labelFirstOperand.setText("");
        labelSecondOperand.setText("");
        labelOperation.setText("");
        labelRezult.setText("");
        labelEquals.setText("");
        labelOperation.setAlignment(Pos.CENTER);
        log.info("Set initial values");
    }

}
