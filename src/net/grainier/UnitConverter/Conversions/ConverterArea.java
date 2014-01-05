package net.grainier.UnitConverter.Conversions;

public class ConverterArea implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[12];
        arrayOfDouble[0] = 4046.8564224000002D;
        arrayOfDouble[1] = 100.0D;
        arrayOfDouble[2] = 0.00050671D;
        arrayOfDouble[3] = 0.0001D;
        arrayOfDouble[4] = 10000.0D;
        arrayOfDouble[5] = 1000000.0D;
        arrayOfDouble[6] = 1.0D;
        arrayOfDouble[7] = 1.0E-006D;
        arrayOfDouble[8] = 0.09290304000000001D;
        arrayOfDouble[9] = 0.00064516D;
        arrayOfDouble[10] = 2589988.1103360001D;
        arrayOfDouble[11] = 0.83612736D;
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