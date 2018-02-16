package sample;

/**
 * Created by Volodymyr on 15.11.2017.
 */
public class BooleanOperations {
    private String firstOperand;
    private String operation;
    private String secondOperand;
    private String rezult;

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
    }

    public void disjunction() {
        if ((this.getFirstOperand() == "TRUE") || (this.getSecondOperand() == "TRUE"))
            this.rezult = "TRUE";
        else if ((this.getFirstOperand() == "FALSE") && (this.getSecondOperand() == "FALSE"))
            this.rezult = "FALSE";
        else
            this.rezult = "NULL";
    }

    public void constTrue() {
        this.rezult = "TRUE";
    }

    public void constFalse() {
        this.rezult = "FALSE";
    }

    public void repeatFirstOperand() {
        this.rezult = this.getFirstOperand();
    }

    public void repeatSecondOperand() {
        this.rezult = this.getSecondOperand();
    }

    public void denialFirstOperand() {
        if (this.getFirstOperand() == "TRUE")
            this.rezult = "FALSE";
        else if (this.getFirstOperand() == "FALSE")
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
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
    }

    public void equivalence() {
        if ((this.getFirstOperand() == "NULL") || (this.getSecondOperand() == "NULL"))
            this.rezult = "NULL";
        else if (this.getFirstOperand() == this.getSecondOperand())
            this.rezult = "TRUE";
        else
            this.rezult = "FALSE";
    }

    public void implication(){
        if((this.getFirstOperand() == "TRUE") && (this.getSecondOperand() == "FALSE"))
            this.rezult = "FALSE";
        if((this.getFirstOperand() == "FALSE") || (this.getSecondOperand() == "TRUE"))
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
    }

    public void arrowPier(){
        if ((this.getFirstOperand() == "TRUE") || (this.getSecondOperand() == "TRUE"))
            this.rezult = "FALSE";
        else if ((this.getFirstOperand() == "FALSE") && (this.getSecondOperand() == "FALSE"))
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
    }

    public void barcodeScheffer() {
        if ((this.getFirstOperand() == "FALSE") || (this.getSecondOperand() == "FALSE"))
            this.rezult = "TRUE";
        else if ((this.getFirstOperand() == "TRUE") && (this.getSecondOperand() == "TRUE"))
            this.rezult = "FALSE";
        else
            this.rezult = "NULL";
    }

    public void reverseImplication() {
        if((this.getSecondOperand() == "TRUE") && (this.getFirstOperand() == "FALSE"))
            this.rezult = "FALSE";
        if((this.getSecondOperand() == "FALSE") || (this.getFirstOperand() == "TRUE"))
            this.rezult = "TRUE";
        else
            this.rezult = "NULL";
    }

    public void addTwoModules() {
        if ((this.getFirstOperand() == "NULL") || (this.getSecondOperand() == "NULL"))
            this.rezult = "NULL";
        else if (this.getFirstOperand() == this.getSecondOperand())
            this.rezult = "FALSE";
        else
            this.rezult = "TRUE";
    }

    public void denialReverseImplication() {
        if((this.getSecondOperand() == "TRUE") && (this.getFirstOperand() == "FALSE"))
            this.rezult = "TRUE";
        if((this.getSecondOperand() == "FALSE") || (this.getFirstOperand() == "TRUE"))
            this.rezult = "FALSE";
        else
            this.rezult = "NULL";
    }

    public void denialImplication() {
        if((this.getFirstOperand() == "TRUE") && (this.getSecondOperand() == "FALSE"))
            this.rezult = "TRUE";
        if((this.getFirstOperand() == "FALSE") || (this.getSecondOperand() == "TRUE"))
            this.rezult = "FALSE";
        else
            this.rezult = "NULL";
    }

}
