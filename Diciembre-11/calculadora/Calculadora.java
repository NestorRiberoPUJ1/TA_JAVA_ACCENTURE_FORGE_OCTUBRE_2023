
public class Calculadora {

    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public Calculadora() {
    }

    public void performOperation() {
        switch (this.operation) {
            case "+":
                this.result = operandOne + operandTwo;
                break;
            case "-":
                this.result = operandOne - operandTwo;
                break;

            default:
                break;
        }
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
