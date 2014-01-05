package net.grainier.UnitConverter.Conversions;

public class ConverterBits implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[14];
        arrayOfDouble[0] = 1.0D;
        arrayOfDouble[1] = 8.0D;
        arrayOfDouble[2] = 1024.0D;
        arrayOfDouble[3] = 8192.0D;
        arrayOfDouble[4] = 1048576.0D;
        arrayOfDouble[5] = 8388608.0D;
        arrayOfDouble[6] = 1073741824.0D;
        arrayOfDouble[7] = 8589934592.0D;
        arrayOfDouble[8] = 1099511627776.0D;
        arrayOfDouble[9] = 8796093022208.0D;
        arrayOfDouble[10] = 1125899906842624.0D;
        arrayOfDouble[11] = 9007199254740992.0D;
        arrayOfDouble[12] = 1.152921504606847E+018D;
        arrayOfDouble[13] = 9.223372036854776E+018D;
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