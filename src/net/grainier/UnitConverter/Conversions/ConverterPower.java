package net.grainier.UnitConverter.Conversions;

public class ConverterPower implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[10];
        arrayOfDouble[0] = 745.69987000000003D;
        arrayOfDouble[1] = 746.0D;
        arrayOfDouble[2] = 735.49874999999997D;
        arrayOfDouble[3] = 0.000277778D;
        arrayOfDouble[4] = 0.016666667D;
        arrayOfDouble[5] = 0.277777778D;
        arrayOfDouble[6] = 16.666666667000001D;
        arrayOfDouble[7] = 1000.0D;
        arrayOfDouble[8] = 0.001D;
        arrayOfDouble[9] = 1.0D;
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