package net.grainier.UnitConverter.Conversions;

public class ConverterAngle implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[16];
        arrayOfDouble[0] = 0.01666667D;
        arrayOfDouble[1] = 0.00027778D;
        arrayOfDouble[2] = 360.0D;
        arrayOfDouble[3] = 1.0D;
        arrayOfDouble[4] = 0.9D;
        arrayOfDouble[5] = 0.9D;
        arrayOfDouble[6] = 0.05625D;
        arrayOfDouble[7] = 0.06D;
        arrayOfDouble[8] = 0.05714286D;
        arrayOfDouble[9] = 45.0D;
        arrayOfDouble[10] = 90.0D;
        arrayOfDouble[11] = 57.295779510000003D;
        arrayOfDouble[12] = 360.0D;
        arrayOfDouble[13] = 60.0D;
        arrayOfDouble[14] = 30.0D;
        arrayOfDouble[15] = 360.0D;
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