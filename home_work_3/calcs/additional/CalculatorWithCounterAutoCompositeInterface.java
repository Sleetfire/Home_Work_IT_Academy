package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface {

    private long countOperation;

    ICalculator iCalculator;

    public long getCountOperation() {

        return countOperation;
    }

    public ICalculator getICalculator() {
        incrementCountOperation();
        return iCalculator;
    }

    public void incrementCountOperation() {

        countOperation++;
    }

    public CalculatorWithCounterAutoCompositeInterface(ICalculator iCalculator) {
        this.iCalculator = iCalculator;

    }

}
