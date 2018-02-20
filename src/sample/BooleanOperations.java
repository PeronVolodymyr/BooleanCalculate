package sample;

import java.util.logging.Logger;

/**
 * Created by Volodymyr on 15.11.2017.
 */
public class BooleanOperations {
    private String firstOperand;
    private String operation;
    private String secondOperand;
    private String rezult;

    private static  final Logger log = Logger.getLogger(BooleanOperations.class.getName());

    public BooleanOperations() {
        this.firstOperand = "";
        this.secondOperand = "";
        this.operation = "";
        this.rezult = "";
    }

    public BooleanOperations(String firstOperand, String secondOperand, String operation, String rezult) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operation = operation;
        this.rezult = rezult;
    }

    public String getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(String firstOperand) {
        this.firstOperand = firstOperand;
    }

    public String getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(String secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getRezult() {
        return rezult;
    }

    public void setRezult(String rezult) {
        this.rezult = rezult;
    }

    public void conjunction() {
        if ((this.getFirstOperand() == "FALSE") || (this.getSecondOperand() == "FALSE"))
            this.rezult = "FALSE";
        else if ((this.getFirstOperand() == "TRUE") && (this.getSecondOperand() == "TRUE"))
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
        log.info("Conjunction performed");
    }

    public void disjunction() {
        if ((this.getFirstOperand() == "TRUE") || (this.getSecondOperand() == "TRUE"))
            this.rezult = "TRUE";
        else if ((this.getFirstOperand() == "FALSE") && (this.getSecondOperand() == "FALSE"))
            this.rezult = "FALSE";
        else
            this.rezult = "NULL";
        log.info("Disjuction performed");
    }

    public void constTrue() {
        this.rezult = "TRUE";
        log.info("Const True performed");
    }

    public void constFalse() {
        this.rezult = "FALSE";
        log.info("Const False performed");
    }

    public void repeatFirstOperand() {
        this.rezult = this.getFirstOperand();
        log.info("Repeat first operand performed");
    }

    public void repeatSecondOperand() {
        this.rezult = this.getSecondOperand();
        log.info("repeat Second operand performed");
    }

    public void denialFirstOperand() {
        if (this.getFirstOperand() == "TRUE")
            this.rezult = "FALSE";
        else if (this.getFirstOperand() == "FALSE")
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
        log.info("Denial First Operand performed");
    }

    @Override
    public String toString() {
        return "BooleanOperations{" +
                "firstOperand='" + firstOperand + '\'' +
                ", secondOperand='" + secondOperand + '\'' +
                ", operation='" + operation + '\'' +
                ", rezult='" + rezult + '\'' +
                '}';
    }

    public void denialSecondOperand() {
        if (this.getSecondOperand() == "TRUE")
            this.rezult = "FALSE";
        else if (this.getSecondOperand() == "FALSE")
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
        log.info("Denial Second Operand performed");
    }

    public void equivalence() {
        if ((this.getFirstOperand() == "NULL") || (this.getSecondOperand() == "NULL"))
            this.rezult = "NULL";
        else if (this.getFirstOperand() == this.getSecondOperand())
            this.rezult = "TRUE";
        else
            this.rezult = "FALSE";
        log.info("Equivalence performed");
    }

    public void implication(){
        if((this.getFirstOperand() == "TRUE") && (this.getSecondOperand() == "FALSE"))
            this.rezult = "FALSE";
        if((this.getFirstOperand() == "FALSE") || (this.getSecondOperand() == "TRUE"))
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
        log.info("Implication performed");
    }

    public void arrowPier(){
        if ((this.getFirstOperand() == "TRUE") || (this.getSecondOperand() == "TRUE"))
            this.rezult = "FALSE";
        else if ((this.getFirstOperand() == "FALSE") && (this.getSecondOperand() == "FALSE"))
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
        log.info("Arrow Pier performed");
    }

    public void barcodeScheffer() {
        if ((this.getFirstOperand() == "FALSE") || (this.getSecondOperand() == "FALSE"))
            this.rezult = "TRUE";
        else if ((this.getFirstOperand() == "TRUE") && (this.getSecondOperand() == "TRUE"))
            this.rezult = "FALSE";
        else
            this.rezult = "NULL";
        log.info("Barcode Scheffer performed");
    }

    public void reverseImplication() {
        if((this.getSecondOperand() == "TRUE") && (this.getFirstOperand() == "FALSE"))
            this.rezult = "FALSE";
        if((this.getSecondOperand() == "FALSE") || (this.getFirstOperand() == "TRUE"))
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
        log.info("Reverse Implication performed");
    }

    public void addTwoModules() {
        if ((this.getFirstOperand() == "NULL") || (this.getSecondOperand() == "NULL"))
            this.rezult = "NULL";
        else if (this.getFirstOperand() == this.getSecondOperand())
            this.rezult = "FALSE";
        else
            this.rezult = "TRUE";
        log.info("Add Two Modules performed");
    }

    public void denialReverseImplication() {
        if((this.getSecondOperand() == "TRUE") && (this.getFirstOperand() == "FALSE"))
            this.rezult = "TRUE";
        if((this.getSecondOperand() == "FALSE") || (this.getFirstOperand() == "TRUE"))
            this.rezult = "FALSE";
        else
            this.rezult = "NULL";
        log.info("Denial Reverse Implication performed");

    }

    public void denialImplication() {
        if((this.getFirstOperand() == "TRUE") && (this.getSecondOperand() == "FALSE"))
            this.rezult = "TRUE";
        if((this.getFirstOperand() == "FALSE") || (this.getSecondOperand() == "TRUE"))
            this.rezult = "FALSE";
        else
            this.rezult = "NULL";
        log.info("Denial Implication performed");
    }

}
