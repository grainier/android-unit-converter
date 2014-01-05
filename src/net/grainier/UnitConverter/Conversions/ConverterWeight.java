package net.grainier.UnitConverter.Conversions;

public class ConverterWeight implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[13];
        arrayOfDouble[0] = 0.2D;
        arrayOfDouble[1] = 1.0D;
        arrayOfDouble[2] = 1000.0D;
        arrayOfDouble[3] = 453.59237000000002D;
        arrayOfDouble[4] = 373.24172160000001D;
        arrayOfDouble[5] = 28.349523130000001D;
        arrayOfDouble[6] = 31.103476799999999D;
        arrayOfDouble[7] = 6350.2931799999997D;
        arrayOfDouble[8] = 15.0D;
        arrayOfDouble[9] = 5.0D;
        arrayOfDouble[10] = 1000000.0D;
        arrayOfDouble[11] = 1016046.9088D;
        arrayOfDouble[12] = 907184.73999999999D;
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