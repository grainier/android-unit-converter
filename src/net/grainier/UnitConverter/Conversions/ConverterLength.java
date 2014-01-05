package net.grainier.UnitConverter.Conversions;

public class ConverterLength implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[11];
        arrayOfDouble[0] = 0.01D;
        arrayOfDouble[1] = 0.3048D;
        arrayOfDouble[2] = 0.0254D;
        arrayOfDouble[3] = 1000.0D;
        arrayOfDouble[4] = 9460730472580800.0D;
        arrayOfDouble[5] = 299792458.0D;
        arrayOfDouble[6] = 1.0D;
        arrayOfDouble[7] = 1609.3440000000001D;
        arrayOfDouble[8] = 1853.24D;
        arrayOfDouble[9] = 0.001D;
        arrayOfDouble[10] = 0.9144D;
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