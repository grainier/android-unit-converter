package net.grainier.UnitConverter.Conversions;

public class ConverterCurrency implements ConverterInterface {
    public static long loadTime;
    public static double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[25];
        arrayOfDouble[0] = 1.0D;
        arrayOfDouble[1] = 1.0D;
        arrayOfDouble[2] = 1.0D;
        arrayOfDouble[3] = 1.0D;
        arrayOfDouble[4] = 1.0D;
        arrayOfDouble[5] = 1.0D;
        arrayOfDouble[6] = 1.0D;
        arrayOfDouble[7] = 1.0D;
        arrayOfDouble[8] = 1.0D;
        arrayOfDouble[9] = 1.0D;
        arrayOfDouble[10] = 1.0D;
        arrayOfDouble[11] = 1.0D;
        arrayOfDouble[12] = 1.0D;
        arrayOfDouble[13] = 1.0D;
        arrayOfDouble[14] = 1.0D;
        arrayOfDouble[15] = 1.0D;
        arrayOfDouble[16] = 1.0D;
        arrayOfDouble[17] = 1.0D;
        arrayOfDouble[18] = 1.0D;
        arrayOfDouble[19] = 1.0D;
        arrayOfDouble[20] = 1.0D;
        arrayOfDouble[21] = 1.0D;
        arrayOfDouble[22] = 1.0D;
        arrayOfDouble[23] = 1.0D;
        arrayOfDouble[24] = 1.0D;
        unitField = arrayOfDouble;
        loadTime = 0L;
    }

    public double getOutputValue() {
        double d;
        if (this.inputUnit == this.outputUnit) {
            d = this.inputValue;
            return d;
        }
        d = this.inputValue / unitField[this.inputUnit] * unitField[this.outputUnit];
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