package net.grainier.UnitConverter.Conversions;

public class ConverterFrequency implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[8];
        arrayOfDouble[0] = 0.01D;
        arrayOfDouble[1] = 1.0D;
        arrayOfDouble[2] = 1000000000.0D;
        arrayOfDouble[3] = 1.0D;
        arrayOfDouble[4] = 1000.0D;
        arrayOfDouble[5] = 1000000.0D;
        arrayOfDouble[6] = 1.0E-006D;
        arrayOfDouble[7] = 0.001D;
        unitField = arrayOfDouble;
    }

    public double getOutputValue() {
        double d;
        if (this.inputUnit == this.outputUnit) {
            d = this.inputValue;
            return d;
        }
        d = this.inputValue * unitField[this.inputUnit] / unitField[this.outputUnit];
        return d;
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