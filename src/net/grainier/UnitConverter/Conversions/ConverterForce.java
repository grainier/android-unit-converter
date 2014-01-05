package net.grainier.UnitConverter.Conversions;

public class ConverterForce implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[12];
        arrayOfDouble[0] = 1.E-005D;
        arrayOfDouble[1] = 9.806649999999999D;
        arrayOfDouble[2] = 1000.0D;
        arrayOfDouble[3] = 4448.2219999999998D;
        arrayOfDouble[4] = 4.44822162D;
        arrayOfDouble[5] = 1000000.0D;
        arrayOfDouble[6] = 1.0D;
        arrayOfDouble[7] = 0.138255D;
        arrayOfDouble[8] = 1000.0D;
        arrayOfDouble[9] = 9806.6499999999996D;
        arrayOfDouble[10] = 9964.0164181799992D;
        arrayOfDouble[11] = 8896.4432305200007D;
        unitField = arrayOfDouble;
    }

    public double getOutputValue() {
        double d;
        if (this.inputUnit == this.outputUnit) {
            d = this.inputValue;
            return d;
        } else {

            d = this.inputValue * unitField[this.inputUnit] / unitField[this.outputUnit];
            return d;
        }
    }

    public void setOutputUnit(int paramInt) {
        this.outputUnit = paramInt;
    }

    public void setInputUnit(int paramInt) {
        this.inputUnit = paramInt;
    }

    public void setInputValue(double paramDouble) {
        this.inputValue = paramDouble;
    }
}