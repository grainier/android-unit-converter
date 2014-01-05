package net.grainier.UnitConverter.Conversions;

public class ConverterTime implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[13];
        arrayOfDouble[0] = 3153600000.0D;
        arrayOfDouble[1] = 86400.0D;
        arrayOfDouble[2] = 315360000.0D;
        arrayOfDouble[3] = 3600.0D;
        arrayOfDouble[4] = 1.0E-006D;
        arrayOfDouble[5] = 31536000000.0D;
        arrayOfDouble[6] = 0.001D;
        arrayOfDouble[7] = 60.0D;
        arrayOfDouble[8] = 2628000.0D;
        arrayOfDouble[9] = 7884000.0D;
        arrayOfDouble[10] = 1.0D;
        arrayOfDouble[11] = 604800.0D;
        arrayOfDouble[12] = 31536000.0D;
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