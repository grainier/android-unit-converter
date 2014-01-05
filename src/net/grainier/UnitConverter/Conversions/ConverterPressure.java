package net.grainier.UnitConverter.Conversions;

public class ConverterPressure implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[31];
        arrayOfDouble[0] = 101325.0D;
        arrayOfDouble[1] = 100000.0D;
        arrayOfDouble[2] = 1333.3199999999999D;
        arrayOfDouble[3] = 98.066500000000005D;
        arrayOfDouble[4] = 2989.0669200000002D;
        arrayOfDouble[5] = 100.0D;
        arrayOfDouble[6] = 249.08891D;
        arrayOfDouble[7] = 3386.3879999999999D;
        arrayOfDouble[8] = 98066.5D;
        arrayOfDouble[9] = 9.806649999999999D;
        arrayOfDouble[10] = 1000.0D;
        arrayOfDouble[11] = 1000000000.0D;
        arrayOfDouble[12] = 1000.0D;
        arrayOfDouble[13] = 6894757.2929999996D;
        arrayOfDouble[14] = 1000000.0D;
        arrayOfDouble[15] = 1000000000000.0D;
        arrayOfDouble[16] = 9806.6499999999996D;
        arrayOfDouble[17] = 100.0D;
        arrayOfDouble[18] = 133.322D;
        arrayOfDouble[19] = 9.806649999999999D;
        arrayOfDouble[20] = 0.001D;
        arrayOfDouble[21] = 10000.0D;
        arrayOfDouble[22] = 1.0D;
        arrayOfDouble[23] = 1000000.0D;
        arrayOfDouble[24] = 1.0D;
        arrayOfDouble[25] = 47.880000000000003D;
        arrayOfDouble[26] = 6894.7572929999997D;
        arrayOfDouble[27] = 1.44816D;
        arrayOfDouble[28] = 98066500.0D;
        arrayOfDouble[29] = 9806.6499999999996D;
        arrayOfDouble[30] = 133.322D;
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