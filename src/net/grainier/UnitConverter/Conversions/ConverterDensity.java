package net.grainier.UnitConverter.Conversions;

public class ConverterDensity implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[21];
        arrayOfDouble[0] = 1.425E-005D;
        arrayOfDouble[1] = 1.712E-005D;
        arrayOfDouble[2] = 1.0D;
        arrayOfDouble[3] = 0.001D;
        arrayOfDouble[4] = 1.0D;
        arrayOfDouble[5] = 0.001D;
        arrayOfDouble[6] = 1.0D;
        arrayOfDouble[7] = 27.679904000000001D;
        arrayOfDouble[8] = 0.01601846D;
        arrayOfDouble[9] = 0.09977637D;
        arrayOfDouble[10] = 0.11982643D;
        arrayOfDouble[11] = 1.0D;
        arrayOfDouble[12] = 0.001D;
        arrayOfDouble[13] = 1.0E-006D;
        arrayOfDouble[14] = 1.72999404D;
        arrayOfDouble[15] = 0.00623602D;
        arrayOfDouble[16] = 0.00748915D;
        arrayOfDouble[17] = 0.51531788D;
        arrayOfDouble[18] = 1.0D;
        arrayOfDouble[19] = 1.32893918D;
        arrayOfDouble[20] = 1.18655284D;
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