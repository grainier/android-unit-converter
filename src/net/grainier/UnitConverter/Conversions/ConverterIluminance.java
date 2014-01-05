package net.grainier.UnitConverter.Conversions;

public class ConverterIluminance implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[4];
        arrayOfDouble[0] = 43.05564167D;
        arrayOfDouble[1] = 10.76391042D;
        arrayOfDouble[2] = 1.0D;
        arrayOfDouble[3] = 10000.0D;
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